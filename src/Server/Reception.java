package Server;
import java.io.BufferedReader;
import java.io.IOException;
 
 
public class Reception implements Runnable {
 
    private BufferedReader in;
    private String message = null, login = null;
    protected volatile boolean running = true;
     
    public Reception(BufferedReader in, String login){
         
        this.in = in;
        this.login = login;
    }
     
    public void run() {
         
        while(running){
            try {
                 
            message = in.readLine();
            System.out.println(login+" : "+message);
             
            } catch (IOException e) {
                running = false;
                System.out.println(login +"s'est déconnecté ");
                //e.printStackTrace();
            }
        }
    }
 
}