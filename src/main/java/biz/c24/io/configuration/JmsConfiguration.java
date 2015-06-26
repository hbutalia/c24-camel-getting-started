package biz.c24.io.configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;

@Configuration
@Profile("default")
public class JmsConfiguration {


    @Value("${outbound.queue}")
    String queueName;

    @Value("${jms.broker.url}")
    String brokerUrl;

    @Bean
    public ConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        return activeMQConnectionFactory;
    }

    @Bean
    public Queue outboundQueue() {
        return new ActiveMQQueue(queueName);
    }
}
