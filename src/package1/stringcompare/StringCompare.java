package package1.stringcompare;

public class StringCompare {

    private String string1;
    private String string2;

    public StringCompare() {

    }

    public StringCompare(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    /*
    Checks whether the 2 strings are equal
    Returns true if equal, else returns false
     */
    public boolean isStringsEqual(){
        if (isEmpty() && !isSameLength()){
            return false;
        }

        int length1 = this.string1.length();

        for (int i = 0; i < length1; i++){
            boolean isCharEqual = this.string1.charAt(i) == this.string2.charAt(i);
            if (!isCharEqual){
                return false;
            }
        }

        return true;


    }

    /*
    Checks whether the lengths of both strings are the same.
    Returns true if lengths are the same.
    Else returns false.
     */
    public boolean isSameLength(){
        if (this.string1.length() == this.string2.length()){
            return true;
        }
        else {
            return  false;
        }
    }

    /*
    Method returns true if either of the strings are empty
    */
    public boolean isEmpty(){
        if(this.string1.isEmpty()){
            System.out.println("String 1 is empty.");
            return true;
        }
        else if (this.string2.isEmpty()){
            System.out.println("String 2 is empty");
            return  true;
        }
        else{
            return  false;
        }
    }
}
