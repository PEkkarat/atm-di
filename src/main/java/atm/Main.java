package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atm = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atm);
//        atmSimulator.run();

        ApplicationContext context = new ClassPathXmlApplicationContext("atm-config.xml");
        ATMSimulator atmSimulator = context.getBean("atmSimulator", ATMSimulator.class);

        atmSimulator.run();
    }
}
