package lesson3;

import java.util.Set;

public interface Book {

    void add(String lastname, String phoneNumber);

    Set<String> get (String lastName);

    Set<String> getAllLastnames ();



}
