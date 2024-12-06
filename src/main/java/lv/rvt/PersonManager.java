package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PersonManager {

    // Metode, kas nolasa datus no persons.csv un atgriež sarakstu ar Person objektiem
    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> personList = new ArrayList<>();
        Path filePath = Paths.get("data", "persons.csv");

        // Pārbauda, vai fails eksistē
        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filePath.toString());
        }

        // Lasa faila saturu
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Pieņemam, ka CSV ir formātā: name,age,email
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String email = parts[2].trim();

                    // Izveido Person objektu un pievieno sarakstam
                    personList.add(new Person(name, age, email));
                }
            }
        }

        return personList;
    }
}