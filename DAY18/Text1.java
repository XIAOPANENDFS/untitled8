package DAY18;

import java.io.*;
import java.util.*;


public class Text1 {
    public static void main(String[] args) throws IOException ,Exception{
//        text1 ();
//        text2 ();
//        text3 ();
//        text4 ();
//        text5 ();
//        text6 ();
//        text7 ();
//        text8 ();
//        text9 ();
//        text10 ();
        char ch[] = "gcasuigchasiuhaiu".toCharArray ();
        text11 ( ch );
    }

    public static void text1() throws IOException {
        FileOutputStream fos = new FileOutputStream ( "C:\\aaa\\b.txt" );
        fos.write ( 90 );
        fos.write ( 80 );
        fos.close ();
    }

    public static void text2() throws IOException {
        FileOutputStream fos = new FileOutputStream ( "C:\\aaa\\b.txt" , true );

        byte a[] = "aasdasfvadfw".getBytes ();

        for (byte va : a) {
            fos.write ( va );
            fos.write ( "\r\n".getBytes () );
        }
        fos.write ( 65 );
        fos.close ();
    }

    public static void text3() throws IOException {
        FileOutputStream fos = new FileOutputStream ( "d:\\c.txt" );

        byte a[] = "i love java".getBytes ();

        for (int i = 0; i < 5; i++) {
            for (int s : a) {
                fos.write ( s );
            }
            fos.write ( "\r\n".getBytes () );
        }
    }

    public static void text4() throws IOException {
        FileOutputStream fos = new FileOutputStream ( "D:\\a\\a.txt" , true );

        byte a[] = "ahjahuwiaxfw".getBytes ();

        for (int va : a) {
            fos.write ( va );
            fos.write ( "\r\n".getBytes () );
        }


        fos.close ();
    }

    public static void text5() throws IOException {
        FileInputStream fis = new FileInputStream ( "D:\\a\\a.txt" );

        while (true) {
            int a = fis.read ();
            if (a == -1) {
                break;
            }
            System.out.print ( (char) a );
        }
        fis.close ();
    }

    public static void text6() throws IOException {
        FileInputStream fis = new FileInputStream ( "D:\\a\\a.txt" );

        byte[] a = new byte[3];
        int va;
        while (true) {
            va = fis.read ( a );
            if (va == -1) {
                break;
            }
            System.out.print ( new String ( a , 0 , va ) );
        }
        fis.close ();
    }

    public static void text7() throws IOException {
        FileOutputStream fos = new FileOutputStream ( "D:\\a\\1.jpg" );
        FileInputStream fis = new FileInputStream ( "C:\\aaa\\1.jpg" );

        byte[] a = new byte[1024 / 2];

        while (true) {
            int len = fis.read ( a );
            if (len == -1) {
                break;
            }
            fos.write ( a , 0 , len );
        }
        fis.close ();
        fos.close ();
    }

    public static void text8() throws IOException {
        FileWriter fr = new FileWriter ( "d:\\a\\aaa.txt" );
        Scanner va = new Scanner ( System.in );
        while (true) {
            int vs = va.nextInt ();
            if (vs == 886) {
                break;
            } else {
                fr.write ( vs );
                continue;
            }
        }
        fr.close ();
    }

    public static void text9() throws IOException {
        File f = new File ( "D:\\d1" );
        File a[] = f.listFiles ();

        for (File file : a) {
            FileOutputStream fos = new FileOutputStream ( "D:\\b2" + "\\" + file.getName () );
            FileInputStream fis = new FileInputStream ( file.getParentFile () + "\\" + file.getName () );

            byte sa[] = new byte[2];
            while (true) {
                int s = fis.read ( sa );
                if (s == -1) {
                    break;
                }
                fos.write ( sa );
            }
            fos.close ();
            fis.close ();
        }
    }

    public static void text10() throws IOException {


        Scanner sc = new Scanner ( System.in );
        FileOutputStream fos = new FileOutputStream ( "D:\\d1\\stu.txt" );


        while (true) {
            String str = sc.nextLine ();
            if (str.contains ( "end" )) {
                break;
            }
            byte b[] = str.getBytes ();
            fos.write ( b );
            fos.write ( "\r\n".getBytes () );
        }

    }

    public static void text11(char[] ch) throws IOException,Exception

    {
        FileInputStream fis = new FileInputStream ( "d:\\a\\test.txt" );

        int nocut = 1;
        byte[] b = new byte[1];
        int i;
        HashMap hashMap = new HashMap ();
        while (true) {
            i = fis.read ( b );
            if (i == -1) {
                break;
            }
            ch = new String ( b , 0 , i ).toCharArray ();
        }

        for (int ii =0; ii<ch.length; ii++) {
            if (!hashMap.containsKey ( ch[i] )) {
                hashMap.put ( ch[i],nocut );
            }
            hashMap.put ( ch[i],++nocut );
        }
//        Set keys = hashMap.keySet ();
//        for (Object d : keys) {
//            Object in = hashMap.get ( d );
//            System.out.println (d+"出现"+in+"次");
//        }
    }
}