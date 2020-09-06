package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class NewsOffice {
    private List<Customer> customers=new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void newspaperSend(){
        //通知订阅报纸客户
        for (Customer customer : customers) {
            customer.update();
        }
    }
}
