package com.business.register.controller;

import com.business.permission.dto.RoleAndAuthKeyDTO;
import com.business.permission.dto.SysAndRoleKeyDTO;
import com.business.permission.dto.SysUserDTO;
import com.business.permission.service.RoleAndAuthService;
import com.business.permission.service.RoleInfoService;
import com.business.permission.service.SysAndRoleService;
import com.business.permission.service.SysUserService;
import com.business.register.dto.CommercialInfoDTO;
import com.business.register.service.CommercialInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class CommercialInfoController {

    //依赖商家注册的服务层
    @Resource
    private CommercialInfoService commercialInfoService;

    //依赖系统权限模块的服务层
    @Resource
    private SysUserService sysUserService;
    @Resource
    private RoleInfoService roleInfoService;
    @Resource
    private SysAndRoleService sysAndRoleService;
    @Resource
    private RoleAndAuthService roleAndAuthService;


    //*********商家注册请求这个地址************
    @RequestMapping("/comRegis.do")
    public String comregister(HttpServletRequest request){

        // 1,************ 先在权限 5 张表中操作，插入数据，给该用户分配角色，权限（调用系统权限模块）********************
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
        //商家的话就给它 增、改、查的权限吧，根据实际需要，还可以细分权限，在权限表中自定义权限就行，就是一个字段而已
        long t1 = 1;
        long t2 = 2;
        long t3 = 4;
        RoleAndAuthKeyDTO dto2 = new RoleAndAuthKeyDTO();
        RoleAndAuthKeyDTO dto3 = new RoleAndAuthKeyDTO();
        RoleAndAuthKeyDTO dto4 = new RoleAndAuthKeyDTO();
        dto2.setRoleid(roleid);
        dto2.setAuthid(t1);
        dto3.setRoleid(roleid);
        dto3.setAuthid(t2);
        dto4.setRoleid(roleid);
        dto4.setAuthid(t3);
        roleAndAuthService.insert(dto2);
        roleAndAuthService.insert(dto3);
        roleAndAuthService.insert(dto4);


        // 2,**************操作商户信息表，插入数据************************
        String comname = request.getParameter("comname");
        String comgytypeid = request.getParameter("comgytypeid");
        String commone = request.getParameter("commoney");
        //将前端获取的字符串转成long类型，因为数据库中的commoney是bigint类型的
        long commoney = Long.parseLong(commone);
        String comemail = request.getParameter("comemail");
        String comweixin = request.getParameter("comweixin");
        String comqq = request.getParameter("comqq");
        String combank = request.getParameter("combank");
        String compersoon = request.getParameter("compersoon");
        String comphone = request.getParameter("comphone");
        String comtele = request.getParameter("comtele");
        String comidentity = request.getParameter("comidentity");
        String comaddr = request.getParameter("comaddr");

        //严格分层思想，定义一个DTO数据传输对象，dto在controller层和service层之间传数据，pojo在service层和dao层间传数据
        CommercialInfoDTO dto5 = new CommercialInfoDTO();
        dto5.setComname(comname);
        dto5.setCommoney(commoney);
        dto5.setComemail(comemail);
        dto5.setComweixin(comweixin);
        dto5.setComqq(comqq);
        dto5.setCombank(combank);
        dto5.setCompersoon(compersoon);
        dto5.setComphone(comphone);
        dto5.setComtele(comtele);
        dto5.setComidentity(comidentity);
        dto5.setComaddr(comaddr);

        //调用服务层
        int i = commercialInfoService.comregis(dto5);

        if (i>0){
            //返回json格式的字符串，这个标识，是开发之前约定好的
            return "success";
        }else{
            return "error";
        }

    }

}
