import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == bean2);

        Cat cat_bean = (Cat) applicationContext.getBean("cat");

        System.out.println(cat_bean.getNickname());

        Cat cat_bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat_bean == cat_bean2);


    }
}