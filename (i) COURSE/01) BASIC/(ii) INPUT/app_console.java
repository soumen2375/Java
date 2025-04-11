//take a user input using "Console class" 
import java.io.Console;

public class app_console {
    public static void main(String[] args) {
        Console myConsole = System.console();

        String myMail = myConsole.readLine("Enter your e-mail id: ");
        char[] myPass = myConsole.readPassword("Enter your password: ");

        System.out.println("USERNAME: "+myMail);
        System.out.println("PASSWORD: "+ new String(myPass));
    }
}
