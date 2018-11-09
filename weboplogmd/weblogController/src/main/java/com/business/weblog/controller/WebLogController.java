package com.business.weblog.controller;

import com.business.weblog.annotation.WebOpLog;
import com.business.weblog.pojo.WebLog;
import com.business.weblog.service.WebLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/log")
public class WebLogController {

    @Resource
    private WebLogService webLogService;

    @WebOpLog(operation = "获取日志")
    @RequestMapping("/logList.json")
    public List<WebLog> logList(HttpServletRequest request){
        List<WebLog> all = webLogService.findAll();
        return all;
    }
}