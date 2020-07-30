import com.hillstone.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
         //获取Spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //我们的对象都在Spring中管理了，我们要使用，直接从里面取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

}
