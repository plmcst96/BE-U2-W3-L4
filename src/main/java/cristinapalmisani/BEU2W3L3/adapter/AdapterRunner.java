package cristinapalmisani.BEU2W3L3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        UserData userData = new UserData();
        Info info = new Info();

        info.setName("Mario");
        info.setSurname("Rossi");
        info.setBirthDate(LocalDate.of(1980, 2, 8));

        DataAdapter dataAdapter = new DataAdapter(info);
        userData.getData(dataAdapter);

        System.out.println("Full name: " + userData.getFullName());
        System.out.println("Age: " + userData.getAge());

    }
}
