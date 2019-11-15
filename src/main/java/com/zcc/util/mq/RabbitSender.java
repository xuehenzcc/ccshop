package com.zcc.util.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * rabbitMQ 发送消息
 */
@Component
public class RabbitSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send (String topic,String message){
        amqpTemplate.convertAndSend(topic,message);
    }
}
