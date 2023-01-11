package comunicaciones.ejemplokillergameprogramming;

import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;

public class ScoreClient extends JFrame {

    private static final int PORT = 1234;
    private static final String HOST = "localhost";

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;

    public ScoreClient() {

        super("High Score Client");

        // TODO | initializeGUI();
        this.makeContact();

        this.addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                closeLink();

            }

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }

        });

        this.setSize(300, 450);
        this.setVisible(true);

    }

    public static void main(String[] args) {

    }

    public void actionPerformed(ActionEvent actionEvent) {

        // TODO | Me faltan los objetos visuales
        // if (actionEvent.getSource() == jbGetScores) {
        // sendGet();
        // } else if (actionEvent.getSource() == jtfScore) {
        // sendScore();
        // }

    }

    private void makeContact() {

        try {

            this.socket = new Socket(HOST, PORT);
            this.bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.printWriter = new PrintWriter(this.socket.getOutputStream(), true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void sendGet() {

        try {

            this.printWriter.println("get");
            String line = this.bufferedReader.readLine();
            System.out.println(line);
            if ((line.length() >= 7) && (line.substring(0, 6).equals("HIGH$$"))) {

                // TODO | showHigh(line.substring(6).trim());
            } else {
                // TODO | jtaMesgs.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void closeLink() {

        try {

            this.printWriter.println("bye");
            this.socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(0);

    }

}
