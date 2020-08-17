package com.test.mq.rabbitmq.client.workqueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.util.concurrent.Exchanger;

public class NewTask {


    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");


        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare("","");
            channel.queueDeclare("firstQueue", false, false, false, null).getQueue();
            channel.queueBind("firstQueue", "firstExchange", "first.first");


            int i = 0;
            while (true) {

                channel.basicPublish("firstExchange", "first.first", MessageProperties.PERSISTENT_TEXT_PLAIN, ("nihao" + i).getBytes());
                i++;
            }
//            System.out.println(" [x] Sent 'this is first Message'");


        }


    }

}
