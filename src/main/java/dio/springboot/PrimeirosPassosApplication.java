package dio.springboot;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeirosPassosApplication.class, args);

	}
}
