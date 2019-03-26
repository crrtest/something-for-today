package comp.lampo.fizz.buzz;

import com.lampo.extensions.springframework.EnableRootStatusController;
import com.lampo.extensions.springframework.SpringMvcDefaultConfiguration;
import com.lampo.extensions.springframework.configuration.LoadApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
  EnableRootStatusController.class,
  LoadApplicationProperties.class,
  SpringMvcDefaultConfiguration.class
})
public class Application {
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
