package Day;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i<=1000; i++) {
            Socket chientTch1 = new Socket ( "localhost" , 6666 );
            OutputStream os1 = chientTch1.getOutputStream ();
            os1.write ( ("6666"+i).getBytes () );
            os1.close ();
            chientTch1.close ();
        }
    }
}
