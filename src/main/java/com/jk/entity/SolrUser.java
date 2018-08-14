package com.jk.entity;

import java.io.Serializable;

/**
 * @Auther: 传闻中的郭先森
 * @Date: 2018/6/10 16:49
 * @Description:
 */
public class SolrUser implements Serializable{

    private static final long serialVersionUID = 7609870877048106138L;
    private Integer userid;
    private String  username;
    private Integer usersex;
    private Integer userage;
    private String  useraddr;
    private String  userintro;
    private String  userstudy;

    public SolrUser() {
        super();
    }

    public SolrUser(Integer userid, String username, Integer usersex, Integer userage, String useraddr, String userintro, String userstudy) {
        this.userid = userid;
        this.username = username;
        this.usersex = usersex;
        this.userage = userage;
        this.useraddr = useraddr;
        this.userintro = userintro;
        this.userstudy = userstudy;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr;
    }

    public String getUserintro() {
        return userintro;
    }

    public void setUserintro(String userintro) {
        this.userintro = userintro;
    }

    public String getUserstudy() {
        return userstudy;
    }

    public void setUserstudy(String userstudy) {
        this.userstudy = userstudy;
    }

    @Override
    public String toString() {
        return "SolrUser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex=" + usersex +
                ", userage=" + userage +
                ", useraddr='" + useraddr + '\'' +
                ", userintro='" + userintro + '\'' +
                ", userstudy='" + userstudy + '\'' +
                '}';
    }
}
