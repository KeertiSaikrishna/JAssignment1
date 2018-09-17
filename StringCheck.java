import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = new String();
        str = sc.nextLine();
        //Accepting the input string
        int[] arr = new int[26];

        char tmp = 'a';
        // creating temporary char variable
        int temp = 0;
        // creating a temporary integer variable
        str.toLowerCase();
        //converting given string to lower case

        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);
            temp = (int) tmp;
            if (temp > 96 && temp < 123)
                arr[temp - 97]++;
        }
        // iterating over the string and incrementing the value of count array according to the ascii values
        // of the characters

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                System.out.println("the string does not contain all the letters of english alphabets");
                return;
            }
        }
        // checking if all the characters exist or not
        System.out.println("the string has all the letters of english alphabets");
        // printing that all characters exist
    }

    //time comlexity of this solution is O(n)
    //space comlexity of this solution is O(1)
}
