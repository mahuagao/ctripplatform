package com.business.sysuser.controller;

import com.business.sysuser.dto.CommercialInfoDTO;
import com.business.sysuser.dto.CommercialInfoDTO1;
import com.business.sysuser.dto.ConsumerInfoDTO;
import com.business.sysuser.dto.ConsumerInfoDTO1;
import com.business.sysuser.service.CommercialInfoService;
import com.business.sysuser.service.ConsumerInfoService;
import com.business.sysuser.service.GyTypeInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserManagerController {

    //依赖商家服务层
    @Resource
    private CommercialInfoService commercialInfoService;

    //依赖普通用户服务层
    @Resource
    private ConsumerInfoService consumerInfoService;

    //依赖商家类型服务层
    @Resource
    private GyTypeInfoService gyTypeInfoService;


    //获取商家列表
    @RequestMapping("/getcomlist.do")
    public List<CommercialInfoDTO> getComList(HttpServletRequest request){
        List<CommercialInfoDTO> comdtos = commercialInfoService.getComList();
        return comdtos;
    }


    //获取用户列表
    @RequestMapping("/getcomlist.do")
    public List<ConsumerInfoDTO> getConList(HttpServletRequest request){
        List<ConsumerInfoDTO> condtos = consumerInfoService.getConList();
        return condtos;
    }

    //根据id查询商家
    @RequestMapping("/getsincom.do")
    public CommercialInfoDTO1 getSinComById(HttpServletRequest request){
        String id = request.getParameter("commerid");
        //转为Long型，因为数据库中这个字段为bigint
        Long commerid = Long.parseLong(id);
        //调用商家服务层
        CommercialInfoDTO1 comdto = commercialInfoService.getSinComById(commerid);
        return comdto;
    }

    //根据id查询普通用户
    @RequestMapping("/getsincon.do")
    public ConsumerInfoDTO1 getSinConById(HttpServletRequest request){
        String id = request.getParameter("conid");
        //转为Long型，因为数据库中这个字段为bigint
        Long conid = Long.parseLong(id);
        //调用普通用户服务层
        ConsumerInfoDTO1 condto = consumerInfoService.getSinConById(conid);
        return condto;
    }

    //修改普通用户信息
    @RequestMapping("/updatecon.do")
    public Map<String,Object> updateConById(ConsumerInfoDTO1 dto){ //要求前端传过来的参数必须和dto字段一致
        Map<String,Object> map = new HashMap<>();
        int i = consumerInfoService.updateConById(dto);
        if (i>0){
            //是开发前约定好的
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }

    //修改商家信息
    @RequestMapping("/updatecom.do")
    public Map<String,Object> updateComById(CommercialInfoDTO1 dto){ //要求前端传过来的参数必须和dto字段一致
        Map<String,Object> map = new HashMap<>();
        int i = commercialInfoService.updateComById(dto);
        if (i>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }


    //删除用户（和商家合作结束后，不再合作的情况，开发中根据具体情况，不做真正意义上的删除）
    @RequestMapping("/deletecom.do")
    public Map<String,Object> deleteCom(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        String id = request.getParameter("commerid");
        Long commerid = Long.parseLong(id);
        int i = commercialInfoService.deleteCom(commerid);
        if (i>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }

    //多条件查询商家
    @RequestMapping("/comselective.do")
    public List<CommercialInfoDTO1> comSelective(HttpServletRequest request){
        //待续...

        return null;
    }

    //多条件查询普通用户
    @RequestMapping("/conselective.do")
    public List<ConsumerInfoDTO1> conSelective(HttpServletRequest request){
        //待续...

        return null;
    }

}
