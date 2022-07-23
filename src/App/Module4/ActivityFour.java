package App.Module4;
import java.lang.*;

public class ActivityFour {
    public static void main(String[] args)
    {
        /*
            Exercise
            ========
            String str = "programmer@gmail.com"
            1. Find if the email id is on gmail
            2. Find username and domain name from email
         */
        String str = "programmer@gmail.com";
        // Here we get the index of @
        int i = str.indexOf("@");
        String username, domain, domainName;
        // Here we get the username by using the substring method and supplying the index number
        username = str.substring(0, i);
        System.out.println("Username: "+username);
        int length = str.length();
        domain = str.substring(i+1, length);
        System.out.println("Domain: "+domain);
        domainName = domain.substring(0, domain.indexOf("."));
        System.out.println("Domain name: "+domainName);
        System.out.println(domainName.equals("gmail"));
        System.out.println(domainName.startsWith("gmail"));
    }
}
