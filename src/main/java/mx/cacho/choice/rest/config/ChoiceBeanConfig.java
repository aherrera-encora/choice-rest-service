package mx.cacho.choice.rest.config;

import mx.cacho.choice.soapws.client.ChoicePort;
import mx.cacho.choice.soapws.client.ChoicePortService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChoiceBeanConfig {
    @Bean
    public ChoicePort choicePort() {
        return new ChoicePortService().getChoicePortSoap11();
    }
}
