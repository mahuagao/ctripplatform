import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.business.sysuser.dao")
@ComponentScan("com.business.sysuser")
public class SysuserStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SysuserStarter.class,args);
    }
}
