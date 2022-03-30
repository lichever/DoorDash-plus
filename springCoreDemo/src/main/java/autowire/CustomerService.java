package autowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    @Qualifier("customerDaoImpl2")
    private CustomerDao customerDao;


//    public CustomerService() {
//        System.out.println("CustomerService()");
//    }
//
//    public CustomerService(CustomerDao customerDao) {
//        System.out.println("CustomerService(CustomerDao customerDao) ");
//        this.customerDao = customerDao;
//    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }
}
