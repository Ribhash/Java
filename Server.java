import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Send a message to the client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from the Server!");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
