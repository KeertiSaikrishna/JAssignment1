import java.util.Scanner;

public class stringcheck{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = new String();
        str = sc.nextLine();
        int[] arr = new int[26];

        char t ='a';
        int temp=0;
        str.toLowerCase();

        for(int i=0 ; i<str.length() ;i++){
            t = str.charAt(i);
            temp = (int)t;
            if(temp > 96 && temp <123)
                arr[temp-97]++;
        }

        for(int i=0 ; i<26 ;i++){
            if(arr[i]==0){
                System.out.println("the string doesnot has all the letters of english alphebets");
                return;
            }
        }
        System.out.println("the string has all the letters of english alphebets");
    }

    //time comlexity of this solution is O(n)
    //space comlexity of this solution is O(1)
}