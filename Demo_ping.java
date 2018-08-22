import java.io.IOException;
import java.util.Scanner;

public class Demo_ping{
    public static void PingHost()throws IOException, InterruptedException{

        Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 www.youtube.com");
        long st = System.currentTimeMillis();

        int returnVal = p1.waitFor();
        boolean reachable = (returnVal==0);

        //System.out.println(st);
        if(reachable) {
            //Thread.sleep(10);
            long et = System.currentTimeMillis();
            //System.out.println(et);
            long median = (et - st) / 2;
            System.out.println("median of the time taken is:" + median);
        }
        else
            System.out.println("host not reachable");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //String ip=sc.nextLine();
        //System.out.println(ip);
        try {
            PingHost();
        }
        catch (IOException | InterruptedException exp){
            System.out.println(exp);
        }
    }
}