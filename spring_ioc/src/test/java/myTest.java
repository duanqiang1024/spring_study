import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {

    public static void main(String[] args) {

        //用户实际调用是业务层，dao层他们不需要接触！

      /*  UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlserverImpl());
        userService.getUser();*/

    //注释掉上面的代码，改用获取xml配置文件中的值
        //获取Spring的上下文对象！
        //获取Spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //我们的对象都在Spring中管理了，我们要使用，直接从里面取出来就可以
       // context.getBean();


    }
}
