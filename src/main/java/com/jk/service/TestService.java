package com.jk.service;

import com.jk.entity.SolrUser;

import java.util.List;
import java.util.Map;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-12 14:46
 **/
public interface TestService {
    List<SolrUser> queryInfo();

    Map<String,Object> addInfo(SolrUser solrUser);
}
