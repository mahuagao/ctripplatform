package com.business.permission.realm;

import com.business.permission.dao.*;
import com.business.permission.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

public class FirstRealm extends AuthorizingRealm {

    //使用@Resource而不是@Autowired ,不然会报错
    //依赖系统用户表dao层接口（持久层）
    @Resource
    private SysUserMapper sysUserMapper;

    //依赖角色表dao层接口（持久层）
    @Resource
    private RoleInfoMapper roleInfoMapper;

    //依赖权限表dao层接口（持久层）
    @Resource
    private AuthorityInfoMapper authorityInfoMapper;

    //依赖角色权限表dao层接口（持久层）
    @Resource
    private RoleAndAuthMapper roleAndAuthMapper;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        Session session = SecurityUtils.getSubject().getSession();
        //获取当前用户
        SysUser sysUser = (SysUser) session.getAttribute("user");
        //根据获取该用户的角色id
        long roleidenty = sysUser.getRoleidenty();
        //调用持久层获取角色类型
        String roletype = roleInfoMapper.selectTypeById(roleidenty);
        //通过roleidenty去角色权限表查权限id(可能有多个)
        List<Long> lis = roleAndAuthMapper.selectAuid(roleidenty);
        //权限表
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //设置角色
        info.addRole(roletype);
        //权限结果集
        List<String> functionList = null;
        //查询当前用户权限
        for(long i : lis){
            //权限
            String str =  authorityInfoMapper.selectAuthType(i);
            functionList.add(str);
        }

        //遍历结果集授权
        for (String authrity : functionList){
            info.addStringPermission(authrity);
        }
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取令牌（里面存放new UsernamePasswordToken）
        UsernamePasswordToken usertoken = (UsernamePasswordToken) authenticationToken;
        //得到账号和密码
        String username = usertoken.getUsername();
        //调用持久层方法，去查询用户名是否存在，如果存在返回对象（账号和密码都有的对象）
        SysUser systemUser = sysUserMapper.findByusername(username);
        if (systemUser!=null) {
            //参数1，用户认证的对象（subject.getPrincipal();返回的对象）
            //参数2，从数据库根据用户名查询到的用户的密码
            //参数3，把当前自定义的realm对象传给SimpleAuthenticationInfo,在配置文件中注入
            AuthenticationInfo info = new SimpleAuthenticationInfo(systemUser, systemUser.getPassword(), this.getName());
            //设置参数
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user",systemUser);
            return info;
        }else{
            return null;
        }
    }
}
