package tech.technote.delmore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.technote.delmore.controller.Person;

@MapperScan("tech.technote.delmore.repositories")
@SpringBootApplication
public class DelmoreApplication implements CommandLineRunner {

    @Autowired
    Person person;
    public static void main(String[] args) {
        SpringApplication.run(DelmoreApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("person:"+person);
    }

}
