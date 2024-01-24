package client;

import java.net.*;
import java.io.*;
 
public class Client {
    public static void main(String[] args) {
        String hostname = "127.0.0.1";
        int port = 9070;
 
        try (Socket socket = new Socket(hostname, port)) {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println(reader.readLine());
        } catch (UnknownHostException e) { 
            System.out.println("Unknown Server: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}