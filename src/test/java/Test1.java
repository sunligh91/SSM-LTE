import com.github.sunligh91.service.BaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("springContext.xml");
        BaseService test = ac.getBean("baseService", BaseService.class);
        test.test();
    }
}
