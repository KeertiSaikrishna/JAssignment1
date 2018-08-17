import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class CheckDirectories {
    Scanner sc = new Scanner(System.in);
    void listFiles(String DirectoryName){

        String str = new String();
        str = sc.nextLine();
        File directory = new File(DirectoryName);
        boolean b = false;
        File[] fList = directory.listFiles();
        for (File file : fList){
            if(str.equals(file.getName())){
                b = true;
                System.out.println("file found");
                return;
            }
        }
        System.out.println("file not found");
    }

    public static void main(String[] args) {

        final String dir ="/home/user/IdeaProjects/incre-assignment7";

        CheckDirectories cd = new CheckDirectories();

        cd.listFiles(dir);
    }
}
