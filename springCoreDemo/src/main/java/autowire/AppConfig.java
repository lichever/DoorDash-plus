package autowire;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("autowire")
public class AppConfig {

    @Bean("beanAnnotation")
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean("beanAnnotation2")
    public EmailService emailService2(){
        return new EmailService();
    }
}
