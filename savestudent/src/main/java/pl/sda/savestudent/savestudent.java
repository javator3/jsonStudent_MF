package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.studentmodel;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class savestudent {

    public static void main(String[] args) throws IOException {

        List<studentmodel> studentlist = Arrays.asList(
                new studentmodel("Tomek", "Tomaszewski", 12345),
                new studentmodel("Radek", "Radkowski", 12435),
                new studentmodel("Łukasz", "Łukaszeski", 12705),
                new studentmodel("Anita", "Aniciak", 19405),
                new studentmodel("Wojtek", "Wojtkowiak", 12605)
        );

        ObjectMapper mapper = new ObjectMapper();
        File files = new File("listastudentow.json");

        try {
            mapper.writeValue(files, studentlist);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


