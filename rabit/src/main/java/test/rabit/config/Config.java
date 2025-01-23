package test.rabit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import test.rabit.manage.Reciver;
import test.rabit.manage.Sender;



@Profile("test")
@Configuration
public class Config {
    @Bean
    public Queue hello() {
        return new Queue("test");
    }

    @Profile("receiver")
    @Bean
    public Reciver receiver() {
        return new Reciver();
    }

    @Profile("sender")
    @Bean
    public Sender sender() {
        return new Sender();
    }
}
