package atmdatabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atm = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atm);
//        atmSimulator.run();
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMSimulatorConfig.class);
        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);
        atmSimulator.run();
    }
}
