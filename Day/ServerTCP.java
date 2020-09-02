package Day;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket ( 6666 );
        ExecutorService executorService = Executors.newFixedThreadPool ( 5 );
       Thread thread = new Thread ( new Runnable () {
           @Override
           public void run() {
               while (true){
                   Socket server = null;
                   InputStream is = null;
                   byte b[] = new byte[5];
                   int len = 0;
                   try {
                       server = serverSocket.accept ();
                       is = server.getInputStream();
                       System.out.println ( "连接成功" );
                       len = is.read ( b );
                   } catch (IOException e) {
                       e.printStackTrace ();
                   }
                   System.out.println (new String ( b , 0 , len ) );
                   try {
                       Thread.sleep ( 5000 );
                   } catch (InterruptedException e) {
                       e.printStackTrace ();
                   }
               }
           }
       } );
       executorService.submit ( thread );
       executorService.submit ( thread );
    }
}
