package com.business.weblog.service;

import com.business.weblog.pojo.WebLog;

import java.util.List;

public interface WebLogService {

    public void addLog(WebLog pojo);

    public List<WebLog> findAll();
}
