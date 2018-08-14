package com.jk.controller;

import com.jk.entity.SolrUser;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-12 14:46
 **/
@RestController
@RequestMapping("/TestController")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 功能描述:〈信息列表查询〉
     * @Author:传闻中的郭先森
     * @Date: 2018/7/12 15:18
     */
    @RequestMapping("/queryInfo")
    @ResponseBody
    public List<SolrUser> queryInfo(){
        return testService.queryInfo();
    }

    @RequestMapping("/addInfo")
    @ResponseBody
    public Map<String, Object> addInfo(){
        SolrUser solrUser = new SolrUser();
        solrUser.setUseraddr("美国宾利福尼亚州");
        solrUser.setUserage(26);
        solrUser.setUserintro("高富帅");
        solrUser.setUsername("小马云");
        solrUser.setUsersex(1);
        solrUser.setUserstudy("麻省理工");
        return testService.addInfo(solrUser);
    }


}
