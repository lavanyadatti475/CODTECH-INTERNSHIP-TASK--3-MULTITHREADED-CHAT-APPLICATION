import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {

        try {

            // Connect to server
            Socket socket =
                    new Socket("localhost", 5000);

            System.out.println(
                    "Connected to Chat Server");

            // Input and Output streams
            BufferedReader keyboard =
                    new BufferedReader(
                            new InputStreamReader(System.in));

            PrintWriter out =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true);

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            // Thread to receive messages
            Thread receiveThread = new Thread(() -> {

                String serverMessage;

                try {

                    while ((serverMessage =
                            in.readLine()) != null) {

                        System.out.println(
                                "\nMessage: "
                                + serverMessage);
                    }

                } catch (IOException e) {

                    System.out.println(
                            "Connection closed.");
                }
            });

            receiveThread.start();

            // Send messages
            String userMessage;

            while ((userMessage =
                    keyboard.readLine()) != null) {

                out.println(userMessage);
            }

        } catch (IOException e) {

            System.out.println("Client Error:");
            e.printStackTrace();
        }
    }
}