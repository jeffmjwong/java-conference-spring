import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }
}
