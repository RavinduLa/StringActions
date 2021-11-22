package package1;

import java.util.Scanner;

public class StringActionsMain {
    public static void main(String[] args) {

        /*Scanner input  = new Scanner(System.in);

        System.out.println("Enter String : ");
        String inString = input.nextLine();

        int stringLength = inString.length();*/

        //check if strings are identical
        String string1 = "264852521909955";
        String string2 = "264852521909955";

        boolean isEqual = string1.equals(string2);

        if (isEqual){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }


    }
}
