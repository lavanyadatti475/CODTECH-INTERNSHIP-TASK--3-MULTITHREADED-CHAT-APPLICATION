import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    // List to store all client writers
    private static final Set<PrintWriter> clientWriters =
            new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Chat Server Started...");

        try (ServerSocket serverSocket =
                     new ServerSocket(5000)) {

            while (true) {

                // Accept client connection
                Socket clientSocket =
                        serverSocket.accept();

                System.out.println("New client connected.");

                // Create new thread for client
                ClientHandler clientThread =
                        new ClientHandler(clientSocket);

                clientThread.start();
            }

        } catch (IOException e) {

            System.out.println("Server Error:");
            e.printStackTrace();
        }
    }

    // Thread class for handling clients
    static class ClientHandler extends Thread {

        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {

            try {

                // Input and Output streams
                in = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));

                out = new PrintWriter(
                        socket.getOutputStream(),
                        true);

                // Add client writer to list
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                String message;

                // Read messages continuously
                while ((message = in.readLine()) != null) {

                    System.out.println("Received: "
                            + message);

                    // Broadcast message to all clients
                    synchronized (clientWriters) {

                        for (PrintWriter writer :
                                clientWriters) {

                            writer.println(message);
                        }
                    }
                }

            } catch (IOException e) {

                System.out.println("Client disconnected.");

            } finally {

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}