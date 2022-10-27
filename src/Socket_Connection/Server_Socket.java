package Socket_Connection;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket; // 服务端使用的Socket包
import java.net.Socket; // 客户端使用的包 ?

public class Server_Socket extends Thread { // Java OO思想中的继承问题
    private Socket_DS socket = new Socket_DS(0); // 试着在这边放上一个Socket数据结构相关类，看后续是否有内容可以进行完整的抽象
    private ServerSocket server_Socket;

    public Server_Socket(int port) throws IOException {
        this.server_Socket = new ServerSocket(port);  // ServerSocket内需要进行抛出异常处理 => 对应的类需要进行导入
        this.server_Socket.setSoTimeout(10000);// 设置了一个超时时间
    }

    public void Socket_Connect() {
        try {
            // this.socket.set_iSocket =
            Socket server = this.server_Socket.accept();

            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("Hello, world!");
        } catch(Exception s){

        }
    }

}
