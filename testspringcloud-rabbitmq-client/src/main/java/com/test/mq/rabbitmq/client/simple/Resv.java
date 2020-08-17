package com.test.mq.rabbitmq.client.simple;

import com.rabbitmq.client.*;

import java.io.IOException;

public class Resv {

    private final static String QUEUE_NAME = "firstQueue";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        System.out.println(" [x] Waiting for message .To exit press CTRL+C");
//        DeliverCallback deliverCallback = ((consumerTag, message) -> {
//            System.out.println(" [x] Received '" + new String(message.getBody(),"UTF-8") + "'");
//        });
//
//        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});

    }
}
