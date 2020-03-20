package com.yzxie.study.eshopbiz.queue;

import com.yzxie.study.eshopcommon.constant.OrderConst;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: xieyizun
 * Version: 1.0
 * Date: 2019-08-25
 * Description:
 **/
@Configuration
public class RabbitMqConfig {

    /**
     * 针对消费者配置
     * 1. 设置交换机类型
     * 2. 将队列绑定到交换机
     FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
     HeadersExchange ：通过添加属性key-value匹配
     DirectExchange:按照routingkey分发到指定队列
     TopicExchange:多关键字匹配
     */
   /* @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange(OrderConst.EXCHANGE_A);
    }*/

    /**
     * 队列名称
     * @return
     */
    @Bean
    public Queue orderQueue() {
        return new Queue(OrderConst.ORDER_QUEUE);
    }
}
