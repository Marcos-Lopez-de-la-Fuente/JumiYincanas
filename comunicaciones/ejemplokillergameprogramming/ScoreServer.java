package comunicaciones.ejemplokillergameprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ScoreServer {

    public static final int PORT = 80;
    private HighScores highScores;

    public ScoreServer() {

        this.highScores = new HighScores();

        try {

            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket clientSocket;
            BufferedReader bufferedReader;
            PrintWriter printWriter;

            while (true) {

                System.out.println("Waiting for a client...");
                clientSocket = serverSocket.accept();
                // TODO | A partir de aquí la idea sería que 1 Thread nuevo se encarge de esto
                System.out.println("Client connection from " + clientSocket.getInetAddress().getHostAddress());

                bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                printWriter = new PrintWriter(clientSocket.getOutputStream(), true);

                this.processClient(bufferedReader, printWriter);

                clientSocket.close();
                System.out.println("Client connection closed\n");
                this.highScores.saveScores();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void processClient(BufferedReader bufferedReader, PrintWriter printWriter) {

        String line;
        boolean done = false;
        try {

            while (!done) {

                if ((line = bufferedReader.readLine()) == null) {
                    done = true;
                } else {

                    System.out.println("Client msg: " + line);

                    if (line.trim().equals("bye")) {
                        done = true;
                    } else {
                        this.doRequest(line, printWriter);
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void doRequest(String line, PrintWriter printWriter) {

        if (line.trim().toLowerCase().equals("get")) {
            System.out.println("Processing 'get'");
            printWriter.println(this.highScores.toString());

        } else if ((line.length() >= 6) && (line.substring(0, 5).toLowerCase().equals("score"))) {

            System.out.println("Processing 'score'");
            this.highScores.addScore(line.substring(5));

        } else {
            System.out.println("Ignoring input line");
        }

    }

}
