package Pack1;

import java.util.Scanner;

public class Strings {


    public String userNameDummySetter() {
        System.out.println("Set username : ");
        StringBuffer bufferString = new StringBuffer("User name is set to : ")
                .append(new Scanner(System.in).nextLine());
        return bufferString.toString();
    }


    public String numberFormatter(Integer integer) {
        return String.format("%,d", integer).replace(",", "_");
    }


}









