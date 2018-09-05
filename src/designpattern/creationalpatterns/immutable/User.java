package designpattern.creationalpatterns.immutable;

import java.util.HashMap;
import java.util.Map;

public final class User implements Cloneable{

    private final String username;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;

    private final HashMap<String,Integer> map;

    public User(String username, String password, String firstname, String lastname, String email, HashMap<String, Integer> map) {
        this.username = username;
        this.password = password;
        this.email=email;
        this.firstname=firstname;
        this.lastname=lastname;
        this.map = map;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public String getEmail() {
        return email;
    }

    public HashMap<String, Integer> getMap() {
        return (HashMap<String, Integer>) map.clone();
    }
}
