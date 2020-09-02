package Day20;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Doen1 {
        @Test
    public  void init() {
        System.out.println ("hello");
    }

    @Before
    public void text(){
        System.out.println ("woald");
    }
    @After
    public void text1(){
        System.out.println ("aa");
    }
}
