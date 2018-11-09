package com.business.sysuser.controller;

import com.business.sysuser.service.*;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AuthorityManagerController {

    //依赖服务层
    @Resource
    private SysUserService sysUserService;       //操作系统用户表
    @Resource
    private RoleInfoService roleInfoService;      //操作角色表
    @Resource
    private AuthorityInfoService authorityInfoService;   //操作权限表
    @Resource
    private SysAndRoleService sysAndRoleService;    //操作用户角色表
    @Resource
    private RoleAndAuthService roleAndAuthService;   //操作角色权限表


    //根据系统用户id查询该用户权限
    @RequestMapping("/getauth.do")
    public List<String> getauth(HttpServletRequest request){
        String uid = request.getParameter("sysuserid");
        Long sysuserid = Long.parseLong(uid);
        //调用用户角色表服务层，得到角色id
        Long roleid = sysAndRoleService.selectrid(sysuserid);
        //调用角色权限表服务层，得到权限id
        List<Long> aids = new ArrayList<>();
        aids = roleAndAuthService.selectaids(roleid);
        List<String> auths = new ArrayList<>();
        //一个角色可能有多个权限
        for (Long aid : aids){
            //查找权限
            String str = authorityInfoService.selectauthtype(aid);
            auths.add(str);
        }
        //返回权限列表
        return auths;
    }

    //权限授予
    @RequestMapping("/grantauth.do")
    public Map<String,Object> grantauth(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //得到该用户的系统id
        String uid = request.getParameter("sysuserid");
        Long sysuserid = Long.parseLong(uid);
        //调用用户角色表服务层，得到角色id
        Long roleid = sysAndRoleService.selectrid(sysuserid);
        //得到要添加的权限id，前端已经将权限名和对应的权限id做转换，看具体情况
        String aid = request.getParameter("authid");
        Long authid = Long.parseLong(aid);
        //角色权限表里，添加对应关系
        int i = roleAndAuthService.addauth(roleid,authid);
        if (i>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }


    //收回权限
    @RequestMapping("/revokeauth.do")
    public Map<String,Object> revokeauth(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //得到该用户的系统id
        String uid = request.getParameter("sysuserid");
        Long sysuserid = Long.parseLong(uid);
        //调用用户角色表服务层，得到角色id
        Long roleid = sysAndRoleService.selectrid(sysuserid);
        //得到要添加的权限id，前端已经将权限名和对应的权限id做转换，看具体情况
        String aid = request.getParameter("authid");
        Long authid = Long.parseLong(aid);
        //在角色权限表中删除对应关系
        int i = roleAndAuthService.deleteauth(roleid,authid);
        if (i>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }

}