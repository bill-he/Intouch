package com.javahelps.contactsreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by billhe on 1/21/17.
 */

public class Profile {
    private String _name;
    private String _email;
    private String _number;

    public Profile (String name, String email, String phoneNumber) {
        _name = name;
        _email = email;
        _number = phoneNumber;

    }

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public String getNumber() {
        return _number;
    }
    /*
    public void addEmail(String email, String type) {
        if (_emails == null) _emails = new ArrayList<String>();

        _emails.add(type.replace(" ", "") + " " + email.replace(" ", "") );

    }
    */
}
