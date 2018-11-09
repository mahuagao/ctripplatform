package com.business.product.controller;

import com.business.product.dto.ProBaseDTO;
import com.business.product.dto.ProSpecialDTO;
import com.business.product.dto.ProSpecialDTO1;
import com.business.product.dto.ProductDTO;
import com.business.product.pojo.ProSpecialKey;
import com.business.product.service.ProBaseService;
import com.business.product.service.ProSpecialService;
import com.business.product.service.ProTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProManagerController {

    //依赖服务层
    @Resource
    private ProBaseService proBaseService;
    @Resource
    private ProSpecialService proSpecialService;
    @Resource
    private ProTypeService proTypeService;

    //根据商家id查询他的全部商品
    @RequestMapping("/getprolist.do")
    public List<ProductDTO> getList(HttpServletRequest request){
        List<ProductDTO> prolis = new ArrayList<>();
        String comid = request.getParameter("commerid");
        Long commerid = Long.parseLong("comid");
        List<ProBaseDTO> probase = new ArrayList<>();
        ProSpecialDTO prospe = new ProSpecialDTO();
        //根据商家id查商品基本表，得到该商家的商品列表
        probase = proBaseService.seleByComId(commerid);
        for (ProBaseDTO dto1 : probase ){
            ProductDTO record = new ProductDTO();
            //得到商品类型信息
            String protypename = proTypeService.seleTypeById(dto1.getProtypeid());
            //得到商品详细信息
            ProSpecialKey key = new ProSpecialKey();
            key.setProid(dto1.getProid());
            key.setProtypeid(dto1.getProtypeid());
            prospe = proSpecialService.seleByKey(key);
            //拼接三张表的字段
            BeanUtils.copyProperties(dto1,record);
            record.setProtypename(protypename);
            BeanUtils.copyProperties(prospe,record);
            //得到结果
            prolis.add(record);
        }
        return prolis;
    }

    //多条件查询
    @RequestMapping("/prosele.do")
    public List<ProductDTO> prosele(HttpServletRequest request){
        //待续...

        return null;
    }



    //添加商品
    @RequestMapping("/addpro.do")
    public Map<String,Object> addpro(HttpServletRequest request){
        //返回给前端的信息，存在map中
        Map<String,Object> map = new HashMap<>();
        //获取前端传过来的参数
        String protypename = request.getParameter("protypename");
        String comid = request.getParameter("commerid");
        Long commerid = Long.parseLong(comid);
        String proname = request.getParameter("proname");
        String price = request.getParameter("proprice");
        Long proprice = Long.parseLong(price);
        String roomtype = request.getParameter("roomtype");
        String startpo = request.getParameter("startpo");
        String destination = request.getParameter("destination");
        String viewpoint = request.getParameter("viewpoint");

        //通过类型名获取类型id
        Long protypeid = proTypeService.seletypeid(protypename);
        //调用商品基本信息服务层，插入信息
        ProBaseDTO basedto = new ProBaseDTO();
        basedto.setProtypeid(protypeid);
        basedto.setCommerid(commerid);
        basedto.setProname(proname);
        basedto.setProprice(proprice);
        //插入记录，并立即得到主键
        Long proid = proBaseService.inserRec(basedto);

        //调用商品详细信息服务层，插入信息
        ProSpecialDTO1 spedto = new ProSpecialDTO1();
        spedto.setProid(basedto.getProid());
        spedto.setProtypeid(protypeid);
        spedto.setRoomtype(roomtype);
        spedto.setStartpo(startpo);
        spedto.setDestination(destination);
        spedto.setViewpoint(viewpoint);
        int j = proSpecialService.inserRec(spedto);

        if (j>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }


    //根据id删除商品
    @RequestMapping("delepro.do")
    public Map<String,Object> delepro(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //获取前端传过来的参数
        String id = request.getParameter("proid");
        Long proid = Long.parseLong(id);
        //先删除商品详细表记录，因为它参考基本表id,先删基本表会删除失败
        int i = proSpecialService.deleProDetail(proid);
        //然后删除商品基本表记录
        int j = proBaseService.deleProBase(proid);
        if (i>0 && j>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }


    //根据id修改商品
    @RequestMapping("updatepro.do")
    public Map<String,Object> updatepro(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //获取前端数据
        String id = request.getParameter("proid");
        Long proid = Long.parseLong(id);
        String proname = request.getParameter("proname");
        String price = request.getParameter("proprice");
        Long proprice = Long.parseLong(price);
        String roomtype = request.getParameter("roomtype");
        String startpo = request.getParameter("startpo");
        String destination = request.getParameter("destination");
        String viewpoint = request.getParameter("viewpoint");
        //调用商品基本信息服务层
        int i = proBaseService.updatepro(proid,proname,proprice);
        //根据商品id得到类型id
        Long protypeid = proBaseService.selectTypeidByid(proid);
        //调用商品详细信息服务层
        //不同类型商品，用到的字段不同，像火车票，第一，第四个参数是用不到的
        int j = proSpecialService.updatepro(proid,protypeid,roomtype,startpo,destination,viewpoint);
        if (i>0&&j>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }
}