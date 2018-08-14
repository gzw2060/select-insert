package com.jk.service.impl;

import com.jk.dao.TestDao;
import com.jk.entity.SolrUser;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-12 14:46
 **/
@Service("TestService")
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public List<SolrUser> queryInfo() {
        Map<String, Object> map = new HashMap<String, Object>();
        return testDao.queryInfo();
    }

    @Override
    public Map<String, Object> addInfo(SolrUser solrUser) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            testDao.addInfo(solrUser);
            map.put("success", true);
            map.put("msg", "新增信息成功！");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "新增信息失败！");
        }
        return map;
    }
}
