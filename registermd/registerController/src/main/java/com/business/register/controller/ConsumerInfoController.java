package com.business.register.controller;

import com.business.permission.dto.RoleAndAuthKeyDTO;
import com.business.permission.dto.SysAndRoleKeyDTO;
import com.business.permission.dto.SysUserDTO;
import com.business.permission.service.RoleAndAuthService;
import com.business.permission.service.RoleInfoService;
import com.business.permission.service.SysAndRoleService;
import com.business.permission.service.SysUserService;
import com.business.register.dto.ConsumerInfoDTO;
import com.business.register.service.ConsumerInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ConsumerInfoController {

    //依赖普通用户注册的服务层
    @Resource
    private ConsumerInfoService consumerInfoService;

    //依赖系统权限模块的服务层
    @Resource
    private SysUserService sysUserService;
    @Resource
    private RoleInfoService roleInfoService;
    @Resource
    private SysAndRoleService sysAndRoleService;
    @Resource
    private RoleAndAuthService roleAndAuthService;

    //普通用户注册请求这个地址
    @RequestMapping("/conRegis.do")
    public String comregister(HttpServletRequest request){

        // 1,************ 先在权限 5 张表中操作，插入数据，给该注册用户（调用系统权限模块）********************

          //操作系统用户表
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        SysUserDTO dto = new SysUserDTO();
        dto.setUsername(username);
        dto.setPassword(password);
        //插入后立即得到主键
        long sysuserid =  sysUserService.insuser(dto);

          //操作角色表
        String roletype = request.getParameter("roletype");
        //插入后立即得到主键
        long roleid = roleInfoService.insrole(roletype);

          //操作用户角色表
        SysAndRoleKeyDTO dto1 = new SysAndRoleKeyDTO();
        dto1.setSysuserid(sysuserid);
        dto1.setRoleid(roleid);
        sysAndRoleService.insert(dto1);

          //操作角色权限表
        //普通用户就只给它 查的权限吧，根据实际需要，还可以细分权限，在权限表中自定义权限就行，就是一个字段而已
        long t1 = 4;
        RoleAndAuthKeyDTO dto2 = new RoleAndAuthKeyDTO();
        dto2.setRoleid(roleid);
        dto2.setAuthid(t1);
        roleAndAuthService.insert(dto2);


        // 2,**************操作普通用户信息表，插入数据************************
        String conname = request.getParameter("conname");
        String conag = request.getParameter("conage");
        //将前端获取的字符串转成long类型，因为数据库中的conage是bigint类型的
        long conage = Long.parseLong("conag");
        String conphone = request.getParameter("conphone");
        String conweixin = request.getParameter("conweixin");
        String conaddr = request.getParameter("conaddr");
        String conidentity = request.getParameter("conidentity");

        //严格分层思想，定义一个DTO数据传输对象，dto在controller层和service层之间传数据，pojo在service层和dao层间传数据
        ConsumerInfoDTO dto5 = new ConsumerInfoDTO();
        dto5.setConname(conname);
        dto5.setConage(conage);
        dto5.setConphone(conphone);
        dto5.setConweixin(conweixin);
        dto5.setConaddr(conaddr);
        dto5.setConidentity(conidentity);

        //调用服务层
        int i = consumerInfoService.cnnregis(dto5);

        if (i > 0){
            //返回json格式的字符串，这个标识，是开发之前约定好的
            return "success";
        }else{
            return "error";
        }

    }

}
