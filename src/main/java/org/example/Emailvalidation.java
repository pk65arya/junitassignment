package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {


    public boolean validation() {


          String text ="abc.100@yahoo.com";
             /*   "Here are some sample email addresses:"+
                "         /* 1. abc@yahoo.com\n" +
                "         2. abc-100@yahoo.com\n" +
                "        //• 3. abc.100@yahoo.com\n" +
                "        //• 4. abc111@abc.com\n" +
                "        //• 5. abc-100@abc.net\n" +
                "        //• 6. abc.100@abc.com.au\n" +
                "        //• 7. abc@1.com,\n" +
                "        //• 8. abc@gmail.com.com\n" +
                "        //• 9. abc+100@gmail.com";*/

        String emailvalidation = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";


        Pattern pattern = Pattern.compile(emailvalidation);

Matcher matcher= pattern.matcher(text);





        return true;
    }
}