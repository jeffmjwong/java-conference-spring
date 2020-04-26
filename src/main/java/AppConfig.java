import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
    @Bean
    public CalendarFactory calFactory() {
        final CalendarFactory factory = new CalendarFactory();
        factory.addDays(3);
        return factory;
    }

    @Bean
    public Calendar calendar() throws Exception {
        return calFactory().getObject();
    }

//    @Bean(name = "speakerService")
//    @Scope(BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        return new SpeakerServiceImpl();
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
