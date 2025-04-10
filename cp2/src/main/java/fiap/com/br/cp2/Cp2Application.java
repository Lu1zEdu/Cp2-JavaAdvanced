package fiap.com.br.cp2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "API de Animes", description = "Exemplo de API RESTful com Swagger", version = "v1"))
@EntityScan(basePackages = "fiap.com.br.cp2.models")
public class Cp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cp2Application.class, args);
	}

}
