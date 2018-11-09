package com.business.product.service.impl;

import com.business.product.dao.ProBaseMapper;
import com.business.product.dto.ProBaseDTO;
import com.business.product.pojo.ProBase;
import com.business.product.service.ProBaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProBaseServiceImpl implements ProBaseService {

    //依赖持久层
    @Resource
    private ProBaseMapper proBaseMapper;

    //根据供应商的id查询商品基本信息表
    @Override
    public List<ProBaseDTO> seleByComId(Long commerid) {
        List<ProBase> pojos = new ArrayList<>();
        List<ProBaseDTO> dtos = new ArrayList<>();
        //调用持久层
        pojos = proBaseMapper.seleByComId(commerid);
        for (ProBase pojo : pojos){
            ProBaseDTO dto = new ProBaseDTO();
            //把pojo中的字段，复制到dto（注意，类型和名字相同的字段才会复制，定义dto时尽量和pojo里的一致）
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }

    //插入记录，并立即得到主键
    @Override
    public Long inserRec(ProBaseDTO basedto) {
        ProBase record = new ProBase();
        BeanUtils.copyProperties(basedto,record);
        //调用持久层，并立即得到主键 （在对应的 ProBaseMapper.xml中配置）
        proBaseMapper.insertSelective(record);
        //立即得到主键
        Long proid = record.getProid();
        //返回最新插入的记录的主键
        return proid;
    }

    //根据id删除
    @Override
    public int deleProBase(Long proid) {
        int i = proBaseMapper.deleteByPrimaryKey(proid);
        return i;
    }

    //修改商品信息
    @Override
    public int updatepro(Long proid, String proname, Long proprice) {
        ProBase record = new ProBase();
        record.setProid(proid);
        record.setProname(proname);
        record.setProprice(proprice);
        //调用持久层
        int i = proBaseMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    //根据商品id得到类型id
    @Override
    public Long selectTypeidByid(Long proid) {
        Long protypeid = proBaseMapper.selectTypeidByid(proid);
        return protypeid;
    }
}
