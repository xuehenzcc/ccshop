package com.zcc.controller;

import com.zcc.common.SysCode;
import com.zcc.common.response.ReturnBody;
import com.zcc.service.HomeService;
import com.zcc.util.mq.RabbitSender;
import com.zcc.vo.CcUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import com.zcc.util.mq.JmsUtil;
@Slf4j
@RestController
public class HomeController {
    @Autowired
    private HomeService homeService;
//    @Autowired
//    private JmsUtil jmsUtil;
    @Autowired
    private RabbitSender rabbitSender;

    @RequestMapping("/getUser")
    public ReturnBody getUser(){
        log.info("获取用户信息");
        List<CcUser> ccUserList = homeService.getUser(null);
//        Long id = new IdWorker(1L,1L).nextId();
//        logger.info("获取用户信息:"+id);
        return ReturnBody.Sucess(SysCode.SUCCESS, ccUserList);
    }
    @RequestMapping("/addUser")
    public ReturnBody addUser(String userName,String userAge,String userSex){
        CcUser ccUserVO =new CcUser();
        ccUserVO.setUserAge(userAge==null?0:Integer.parseInt(userAge));
        ccUserVO.setUserName(userName);
        ccUserVO.setUserSex(userSex);
        int result = homeService.addUser(ccUserVO);
        log.info("添加用户信息");
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
//    @RequestMapping("/addMessage")
//    public ReturnBody addMessage(String message){
//       jmsUtil.sendMsg("test",message);
//        logger.info("发送信息");
//        return ReturnBody.Sucess(SysCode.SUCCESS,message);
//    }
    @RequestMapping("/addMessageByRabbit")
    public ReturnBody addMessageByRabbit(String message){
        rabbitSender.send("test",message);
        log.info("addMessageByRabbit == 发送信息");
        return ReturnBody.Sucess(SysCode.SUCCESS,message);
    }


}
