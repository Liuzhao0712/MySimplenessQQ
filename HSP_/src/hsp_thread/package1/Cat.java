package hsp_thread.package1;

/**
 * @quthor Liuzhao
 * @date 2022/7/11
 */
public class Cat {
    public static void main(String[] args) {
        new Thread_().start();
        System.out.println("主程序结束了");
    }
    public void cry(){
        System.out.println("喵喵喵");
    }
}


class Thread_ extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("线程睡眠出错了");
            }
            new Cat().cry();
        }
    }
}
