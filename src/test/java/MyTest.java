import com.wang.pojo.Books;
import com.wang.service.bookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/15 0015
 */
public class MyTest
{
    @Test
    public void test()
    {
        ApplicationContext context         = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookServiceImpl    bookServiceImpl = context.getBean("bookServiceImpl", bookServiceImpl.class);
        for (Books books : bookServiceImpl.queryAll())
        {
            System.out.println(books);
        }
    }
}
