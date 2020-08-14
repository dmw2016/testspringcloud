package com.test.mq.rabbitmq.client;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Send {


    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("locahost");

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare("firstQueue", false, false, false, null);
            channel.basicPublish("firstExchange", "first.first", null, "nihao".getBytes());

            System.out.println(" [x] Sent 'this is first Message'");
        }


    }

}
