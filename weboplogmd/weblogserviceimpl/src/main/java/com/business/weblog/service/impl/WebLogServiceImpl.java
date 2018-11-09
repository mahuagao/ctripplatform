package com.business.weblog.service.impl;

import com.business.weblog.dao.WebLogMapper;
import com.business.weblog.pojo.WebLog;
import com.business.weblog.pojo.WebLogExample;
import com.business.weblog.service.WebLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebLogServiceImpl implements WebLogService {


    @Autowired
    private WebLogMapper webLogMapper;

    @Override
    public void addLog(WebLog pojo) {
        webLogMapper.insert(pojo);
    }

    @Override
    public List<WebLog> findAll() {
        WebLogExample example = new WebLogExample();
        List<WebLog> webLogs = webLogMapper.selectByExample(example);
        return webLogs;
    }
}
