import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo_ping{
    public static void PingHost(String ip)throws UnknownHostException, IOException, InterruptedException{
        InetAddress add = InetAddress.getByName(ip);
        long st = System.currentTimeMillis();
        //System.out.println(st);

        if(add.isReachable(5000)) {
            //Thread.sleep(10);
            long et = System.currentTimeMillis();
            //System.out.println(et);
            long median = (et - st) / 2;
            System.out.println("median of the time taken is:" + median);
        }
        else
            System.out.println("host not reachable");
    }
    public static void main(String[] args)throws UnknownHostException, IOException ,InterruptedException{
        Scanner sc= new Scanner(System.in);

        String ip=sc.nextLine();
        //System.out.println(ip);

        PingHost(ip);
    }
}