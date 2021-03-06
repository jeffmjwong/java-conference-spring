import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main (String[] args) {
        final ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        final SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNumber());
    }
}
