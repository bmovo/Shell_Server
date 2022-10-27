package Socket_Connection;

import java.net.Socket;

public class Socket_DS {
    private int i_Socket;
    private String local_IP;


    public Socket_DS(int i) {
        this.i_Socket = i;
    }

    public int get_ISocket() {
        return this.i_Socket;
    }
}
