import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDirectories {

    static void Findfiles(String DirectoryName) {
        String str = new String();
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        //accepting the pattern
        String temp = new String();
        //creating a temporary String variable for getting the name of each file
        Pattern p = Pattern.compile(".*" + str + ".*");
        //creating a pattern to search
        File directory = new File(DirectoryName);
        boolean matched = true;
        File[] fList = directory.listFiles();
        for (File file : fList) {
            temp = file.getName();
            Matcher m = p.matcher(temp);
            while (m.find()) {
                matched = false;
                System.out.println(file.getAbsolutePath());
            }
        }
        // iterating over the list of files in the specified directory and searching it with the given pattern
        if (matched)
            System.out.println("pattern not found in any of the file");
    }

    public static void main(String[] args) {

        final String dir = "/home/zadmin/Downloads";
        //path of the directory to be searched

        Findfiles(dir);
    }
}