package Server;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
 
public class Emission implements Runnable {
 
    private PrintWriter out;
    private String message = null;
    private Scanner sc = null;
    private String login = null;
     
    public Emission(PrintWriter out) {
        this.out = out;
    }
    
    public Emission(PrintWriter out, String login) {
        this.out = out;
        this.login = login;
    }
 
     
    public void run() {
         
          /*sc = new Scanner(System.in);
           
          while(true){
                System.out.println("Votre message :");
                message = sc.nextLine();
                out.println(message);
                out.flush();
          }*/
          out.println("Bienvenue "+login);
          out.flush();
    }
}