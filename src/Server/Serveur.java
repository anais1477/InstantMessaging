package Server;
import java.io.*;
import java.net.*;
import java.util.Map;
 
public class Serveur {
 public static ServerSocket ss = null;
 public static Thread t;
 public static Map<String, String> listClients;
 
  
    public static void main(String[] args) {
         
        try {
        	InetAddress ip = InetAddress.getLocalHost();
        	System.out.println(ip);
            ss = new ServerSocket(2222);
            System.out.println("Le serveur est � l'�coute du port "+ss.getLocalPort());
             
            t = new Thread(new Accepter_connexion(ss));
            t.start();
             
        } catch (IOException e) {
            System.err.println("Le port "+ss.getLocalPort()+" est d�j� utilis� !");
        }
     
    }
 
     
    }