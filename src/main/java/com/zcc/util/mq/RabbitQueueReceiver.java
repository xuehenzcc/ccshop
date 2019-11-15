package com.zcc.util.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitQueueReceiver {

    @RabbitListener(queues = "test")
    public void getMsg(String message){
        System.out.println("rabbitmq 收到新消息："+message);
    }
}
