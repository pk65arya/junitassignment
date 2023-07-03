package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistration {

    public boolean fnamevalidation() {
        String firstname = "Pradeep";
        String valid = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(firstname);
        if (matcher.matches()) {
            return true;

        }else
            return false;
    }

    public boolean lnamevalidation(){
        String lname="Kumar";
        String valid="[A-Z]{1}[a-z]{2,}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(lname);
        if (matcher.matches()){
            return true;
        }else
            return false;
    }
    public boolean emailvalidation(){
        String email="abc.xyz@bl.co.in";
        String valid="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }else
            return false;
    }
    public boolean mobilevalidatio(){
        String  mobile="91 6207827848";
        String valid="[0-9]{2}[ ][0-9]{10}";
        Pattern pattern=Pattern.compile(valid);
        Matcher matcher= pattern.matcher(mobile);
        if (matcher.matches()){
            return true;
        }else
            return false;

    }
}
