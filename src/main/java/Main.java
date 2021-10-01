import json.Config;
import json.Parser;
import json.models.person.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Parser parser = context.getBean(Parser.class);
        try {
            List<Person> personList = parser.parse();
            for (Person hum:personList){
                System.out.println(hum.guid);
            };
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}