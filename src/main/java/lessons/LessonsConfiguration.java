package lessons;

import org.springframework.context.annotation.Configuration;



@Configuration
public class LessonsConfiguration {

    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }

}
