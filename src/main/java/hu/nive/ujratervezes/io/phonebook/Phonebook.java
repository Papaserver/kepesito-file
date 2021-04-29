package hu.nive.ujratervezes.io.phonebook;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        } else {
            try {
                PrintWriter pw = new PrintWriter(output);
                StringBuilder sb = new StringBuilder();
                contacts.forEach((key, value) -> sb.append(key + ": " + value + System.lineSeparator()));
                pw.write(sb.toString());
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}