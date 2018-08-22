import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDirectories {
    Scanner sc = new Scanner(System.in);
    void Findfiles(String DirectoryName){

        String str = new String();
        str = sc.nextLine();
        String temp = new String();
        File directory = new File(DirectoryName);
        boolean b = true;
        File[] fList = directory.listFiles();
        for (File file : fList){
            temp = file.getName();
            Pattern p = Pattern.compile(".*"+str+".*");
            Matcher m =p.matcher(temp);
            while (m.find()){
                b = false;
                System.out.println(file.getAbsolutePath());
            }
        }
        if(b)
            System.out.println("file not found");
    }

    public static void main(String[] args) {

        final String dir ="/home/user/IdeaProjects/incre-assignment7";

        CheckDirectories cd = new CheckDirectories();

        cd.Findfiles(dir);
    }
}
