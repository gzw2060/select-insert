package com.jk.dao;

import com.jk.entity.SolrUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-12 14:47
 **/
@Mapper
public interface TestDao {
    @Select(" SELECT\n" +
            "  `userid`,\n" +
            "  `username`,\n" +
            "  `usersex`,\n" +
            "  `userage`,\n" +
            "  `useraddr`,\n" +
            "  `userintro`,\n" +
            "  `userstudy`\n" +
            "FROM `builddream`.`solruser`\n ")
    List<SolrUser> queryInfo();

    @Insert(" INSERT INTO `builddream`.`solruser`\n" +
            "            (\n" +
            "             `username`,\n" +
            "             `usersex`,\n" +
            "             `userage`,\n" +
            "             `useraddr`,\n" +
            "             `userintro`,\n" +
            "             `userstudy`)\n" +
            "VALUES (\n" +
            "        #{username},\n" +
            "        #{usersex},\n" +
            "        #{userage},\n" +
            "        #{useraddr},\n" +
            "        #{userintro},\n" +
            "        #{userstudy}); ")
    void addInfo(SolrUser solrUser);
}
