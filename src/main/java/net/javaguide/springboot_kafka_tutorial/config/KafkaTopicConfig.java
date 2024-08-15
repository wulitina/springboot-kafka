package net.javaguide.springboot_kafka_tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaGuideTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }


    @Bean
    public NewTopic javaGuideJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }
}

