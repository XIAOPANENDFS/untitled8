package Day20;

import Day20.te.Usrer;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Doen {

    @Test
    public void D() throws Exception{
        Class d = Usrer.class;
//        Constructor[] constructors = d.getConstructors ();
//        for (Object c : constructors) {
//            System.out.println (c);
//        }
//
//        Constructor[] declaredConstructors = d.getDeclaredConstructors ();
//        for (Object cs :declaredConstructors) {
//            System.out.println (cs);
//        }

//        Constructor constructor = d.getConstructor ();
//        System.out.println ( constructor );
//        Constructor constructor1 = d.getConstructor ( String.class , Integer.class );
//        System.out.println ( constructor1 );
//
//        Constructor declaredConstructor = d.getDeclaredConstructor ( String.class , String.class );
//        System.out.println (declaredConstructor);
        Usrer usrer = new Usrer ( "刘备",55,"男" );
        System.out.println (usrer);

        Constructor<Usrer> constructor2 = d.getConstructor ( String.class , Integer.class );
        Usrer usrer1 = constructor2.newInstance ( "刘备",25 );
        System.out.println (usrer1);


        Constructor<Usrer> declaredConstructor = d.getDeclaredConstructor ( String.class , String.class );
        declaredConstructor.setAccessible ( true );
        Usrer usrer2 = declaredConstructor.newInstance ( "关羽","男" );
        System.out.println (usrer2);

    }
}
