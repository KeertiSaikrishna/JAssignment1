import java.io.IOException;
import java.util.Scanner;

public class DemoPing {
    public static void PingHost(String ip) throws IOException, InterruptedException {

        Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 " + ip);
        // creating a process to ping the host

        long st = System.currentTimeMillis();
        // getting starting time of the process

        int returnVal = p1.waitFor();
        // checking the host is reachable or not

        boolean reachable = (returnVal == 0);

        if (reachable) {
            long et = System.currentTimeMillis();
            // getting the end time of the process
            long median = (et - st) / 2;
            System.out.println("median of the time taken is:" + median);
            // finding the median and then printing it
        } else
            System.out.println("host not reachable");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a scanner variable sc
        System.out.println("enter host name: Example:google.com");
        String ip = sc.nextLine();
        // accepting input host from user in the form of string

        try {
            PingHost(ip);
        } catch (IOException | InterruptedException exp) {
            System.out.println(exp);
        }
    }
}
