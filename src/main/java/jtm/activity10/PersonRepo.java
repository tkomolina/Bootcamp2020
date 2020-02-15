package jtm.activity10;

/*
TODO Necessary imports commented
 */

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

    private List<Person> personList;

    public PersonRepo() {
        init();
    }

    public void init() {

        try {
            List<String> file = Files.readAllLines(Paths.get("src/main/resources/data.json"));
            ObjectMapper mapper = new ObjectMapper();
            //To go from List to single String variable:
            String fileString = String.join("\n", file); // Join adds new line to string
            Person[] personArray = mapper.readValue(fileString, Person[].class);
            this.personList = Arrays.asList(personArray);

            // 1. Read file data.json from resources folder into String
            // 2. Use ObjectMapper to convert String to List of Persons and
            // store in personList field
            //Hint: Correct way how to use ObjectMapper to convert String to List below
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person oldestPerson() {
        //Find oldest person in personList field and return it
        Person oldest = personList.get(0);
        for (Person i : personList) {
            if (i.getBirthDate().compareTo(oldest.getBirthDate()) < 0) {
                oldest = i;
            }
        }
        return oldest;
    }

    public Person youngestPerson() {
        //Find youngest person in personList field and return it
        Person youngest = personList.get(0);
        for (Person i : personList) {
            if (i.getBirthDate().compareTo(youngest.getBirthDate()) > 0) {
                youngest = i;
            }
        }
        return youngest;
    }

    public String largestPopulation() {
        //Find country with largest population and return it's name

        Comparator<Person> compareByCountry = (Person p1, Person p2) -> p1.getCountry().compareTo(p2.getCountry());
        Collections.sort(personList, compareByCountry); //sort by country A-Z
        int x = 1;
        int tmp = 0;
        Person comparedPerson = personList.get(0);
        Person result = personList.get(0);
        for (Person i : personList) {
            if (comparedPerson.getCountry().equals(i.getCountry())) {
                x++;
                comparedPerson = i;
            } else if (!comparedPerson.getCountry().equals(i.getCountry())) {
                if (x > tmp) {
                    result = comparedPerson;
                    tmp = x;
                    x = 1;
                    comparedPerson = i;
                } else x = 1;
                comparedPerson = i;
            }
        }
        return result.getCountry();
    }


}


/*

Hint:
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(data, Person[].class);
            List<Person> personList = Arrays.asList(personArray);
 */
