import com.hillstone.pojo.Student;
import com.hillstone.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

/*
        Student{
        name='强哥',
        address=Address{address='西安'},
        books=[红楼梦, 水浒传,  西游记, 三国演义],
        hobbys=[敲代码, 听歌,看电影],
        card={001=周润发, 002=周星驰},
        games=[98拳皇,魂斗罗, 超级玛丽],
        wife='null',
        info={EMAL=qduan@hillstonenet.com,
             EMPLOYEE_NUMBER=902703}}
*/

    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
