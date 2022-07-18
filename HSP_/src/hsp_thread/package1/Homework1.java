package hsp_thread.package1;

import java.util.Random;
import java.util.Scanner;

/**
 * @quthor Liuzhao
 * @date 2022/7/11
 */
public class Homework1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t2.t1= t1;

        //t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}

class T1 extends Thread{
    boolean b =true;
    @Override
    public void run() {
        Random random = new Random();

        while(b) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(random.nextInt(100));
        }
    }
}

class T2 extends Thread{
    T1 t1;
    Boolean b  = true;
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        while(true){
            if (in.next().equals("Q")) {
                t1.b = false;
                break;
            }
        }
    }
}
