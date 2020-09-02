package DAY18;

import java.io.*;

public class Texy1 {
    public static void main(String[] args) throws IOException {
//        test1 ();
//        test2 ();
//        test3 ();
        test4 ();
//        test5 ();
//        test6 ();
//        test7 ();
//        test8 ();
//        test9 ();
    }

    public static void test1() {
        FileOutputStream fos = null;
        try {
            byte[] b = { 'a' , 'c' , 'd' , 'f' };
            fos = new FileOutputStream ( "C:\\aaa\\b.txt" );
            for (int a : b) {
                fos.write ( a );
                fos.write ( "\r\n".getBytes () );
            }

        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (fos != null) {
                try {
                    fos.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    public static void test2() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream ( "C:\\aaa\\b.txt" );
            byte[] str = "asdfaasca".getBytes ();
            for (int a : str) {
                fos.write ( a );
                fos.write ( "\r\n".getBytes () );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (fos != null) {
                try {
                    fos.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    public static void test3() {
        FileInputStream fos = null;
        try {
            fos = new FileInputStream ( "c:\\aaa\\b.txt" );

            while (true) {
                int a = fos.read ();
                if (a == -1) {
                    break;
                }
                System.out.print ( (char) a );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (fos != null) {
                try {
                    fos.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    public static void test4() {
        FileInputStream fos = null;
        try {
            byte[] a = new byte[3];
            fos = new FileInputStream ( "c:\\aaa\\b.txt" );
            while (true) {
                int va = fos.read ( a );
                if (va == -1) {
                    break;
                } else {
                    System.out.print ( new String ( a , 0 , va ) );
                }
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public static void test5() {
        FileInputStream fos1 = null;
        FileOutputStream fos = null;
        try {
            fos1 = new FileInputStream ( "c:\\aaa\\1.jpg" );
            fos = new FileOutputStream ( "c:\\bbb\\1.jpg" );
            byte b[] = new byte[1024];
            while (true) {
                int a = fos1.read ( b );
                if (a == -1) {
                    break;
                }
                fos.write ( b , 0 , a );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (fos1 != null) {
                try {
                    fos.close ();
                    fos1.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    public static void test6() throws IOException {
        FileReader fr = new FileReader ( "C:\\aaa\\b.txt" );

        while (true) {
            int a = fr.read ();
            if (a == -1) {
                break;
            }
            System.out.println ( (char) a );
        }
    }

    public static void test7() throws IOException {
        FileReader fr = new FileReader ( "C:\\aaa\\b.txt" );
        char[] a = new char[3];
        int b;
        while (true) {
            b = fr.read ( a );
            if (b == -1) {
                break;
            }
            System.out.println ( new String ( a , 0 , b ) );
        }
    }

    public static void test8() throws IOException {
        FileWriter fw = new FileWriter ( "C:\\aaa\\b.txt" );

        fw.write ( "aaa" );
        fw.write ( 115 );
        fw.write ( 'o' );

        fw.flush ();
        char[] a = "gashjcghiuash".toCharArray ();
        fw.write ( new String ( a , 0 , a.length ) );
        fw.close ();
    }

    public static void test9() throws IOException {
        FileReader fr = new FileReader ( "C:\\aaa\\b.txt" );
        FileWriter fw = new FileWriter ( "C:\\bbb\\b.txt" );

        char[] a = new char[3];
        int as;
        while (true) {
            as = fr.read ( a );
            if (as == -1) {
                break;
            }
            fw.write ( a );
        }
        fw.close ();
        fr.close ();
    }


}