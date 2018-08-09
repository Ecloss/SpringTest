import com.spring.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 余修文
 * @date 2018/8/9 13:44
 */
public class Test01 {

    @Test
    public void test01() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过spring获取实例对象
        Student stu = (Student) context.getBean("stu");
        System.out.println("-----------------");
        stu.saveMany("XiaoBai");

    }

}
