package com.jk.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-13 17:12
 **/
@Component  //声明类
public class SchedulerTask {

    private int count = 0;

    @Scheduled(cron="*/6 * * * * ?")    //每6秒执行一次
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
