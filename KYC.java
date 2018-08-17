import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println();
        for(int i=0 ; i<n ;i++) {
            String FDate = sc.next();
            String SDate = sc.next();
            DateTimeFormatter formatter_1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate AnniDate = LocalDate.parse(FDate,formatter_1);
            LocalDate PDate = LocalDate.parse(SDate,formatter_1);
            if(PDate.getYear() <= AnniDate.getYear()){
                System.out.println("No Range");
                break;
            }
            LocalDate AnniPyear = LocalDate.of(PDate.getYear(),AnniDate.getMonth(),AnniDate.getDayOfMonth());
            LocalDate sd = AnniPyear.minusDays(30);
            LocalDate ed = AnniPyear.plusDays(30);
            if(sd.getMonth().equals(PDate.getMonth())){
                if(sd.getDayOfMonth() >= PDate.getDayOfMonth()){
                    System.out.println(sd +" "+ed);
                }
                else {
                    System.out.println(sd + " " + PDate);
                }
            }
            else if(ed.getMonth().equals(PDate.getDayOfMonth())){
                if(ed.getDayOfMonth() < PDate.getDayOfMonth()){
                    System.out.println(sd + " " +ed);
                }
                else {
                    System.out.println(sd + " " + PDate);
                }
            }
            else if(AnniPyear.getMonth().equals(PDate.getMonth())){
                System.out.println(sd + " " + PDate);
            }
            else {
                System.out.println(sd + " " + ed);
            }
        }
    }
}