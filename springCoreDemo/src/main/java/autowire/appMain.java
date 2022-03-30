package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appMain {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        System.out.println(customerService.getCustomerDao());

        EmailService emailService = context.getBean("beanAnnotation", EmailService.class);
        System.out.println(emailService);

        EmailService emailService2= context.getBean("beanAnnotation2", EmailService.class);
        System.out.println(emailService2);
    }
}
