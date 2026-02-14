package guru.springframework.msscbeerservice.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableAutoConfiguration
@Configuration
public class LocalDiscovery {


}
