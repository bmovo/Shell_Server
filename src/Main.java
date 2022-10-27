import java.io.*;
import Socket_Connection.*;

public class Main {
    public static void main(String[] args) {
        try {
            Server_Socket socket = new Server_Socket(8000);
            socket.Socket_Connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}