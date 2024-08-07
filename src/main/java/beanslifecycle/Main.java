package beanslifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beanslifecycle/beansannotation.xml");

        // destroy() method
        cap.close();
    }
}
