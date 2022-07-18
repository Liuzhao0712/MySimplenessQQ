package hsp_thread.package1;

/**
 * @quthor Liuzhao
 * @date 2022/7/11
 */
public class Homework {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+(++count));
            if (count == 5 ){
                T t = new T();
                Thread thread = new Thread(t);
                thread.start();
                thread.join();
            }
        }
    }
}

class T implements Runnable{
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello" + (count++));
        }
    }
}