//package com.zcc.util.mq;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JmsUtil {
//
//    @Autowired
//    private JmsTemplate jmsTemplate;
//
//    public void sendMsg(String queue,String message){
//        jmsTemplate.convertAndSend(queue,message);
//    }
//
//    @JmsListener(destination="test")
//    public void receiveUploadQueue(String message){
//        System.out.println("test --收到消息："+message);
//    }
//
//}
