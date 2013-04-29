package Client;
import java.io.*;
import java.net.*;
 
public class Client {
 
    public static Socket socket = null;
    public static Thread t1;
     
    public static void main(String[] args) {
     
         
    try {
    	
    	InetAddress anais = InetAddress.getByName("192.168.0.9");
        System.out.println("Demande de connexion");
        socket = new Socket(anais,2222);
        System.out.println("Connexion établie avec le serveur, authentification :"); // Si le message s'affiche c'est que je suis connecté
         
        t1 = new Thread(new Connexion(socket));
        t1.start();
         
         
         
    } catch (UnknownHostException e) {
      System.out.println("Impossible de se connecter à l'adresse "+socket.getLocalAddress());
    } catch (IOException e) {
      System.out.println("Aucun serveur à l'écoute du port "+21315);
    }
     
     
 
    }
 
}