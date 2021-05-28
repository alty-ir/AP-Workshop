package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * A class to handle multi Clients for Server.
 *
 * @author Ali Tabesh
 * @version 1.0
 */
class Handler implements Runnable {
    // connection socket
    private Socket connectionSocket;
    // client number
    private int clientId;

    /**
     * Create a Handler.
     *
     * @param connectionSocket   connection socket
     * @param clientId        client Id
     */
    public Handler(Socket connectionSocket, int clientId) {
        this.connectionSocket = connectionSocket;
        this.clientId = clientId;
    }

    /**
     * An override method for handle multi threading.
     *
     */
    @Override
    public void run() {
        try {
            System.out.println("Client" + clientId + " entered...");
            OutputStream out = connectionSocket.getOutputStream();
            InputStream in = connectionSocket.getInputStream();
            byte[] buffer = new byte[2048];
            StringBuilder output = new StringBuilder();
            while (true) {
                try {
                    int read = in.read(buffer);
                    System.out.println("- From Client" + clientId + ": " + new String(buffer, 0, read));
                    output.append(" - ").append(new String(buffer, 0, read));
                    System.out.println("+ To Client" + clientId + ": " + output);
                    out.write(output.toString().getBytes());
                } catch (Exception exception) {
                    break;
                }
            }
            System.out.print("Client" + clientId + " exited.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connectionSocket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}