package hsp_thread.package1;

/**
 * @quthor Liuzhao
 * @date 2022/7/11
 */
public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        money_ m = new money_();
        Thread zs = new Thread(m, "张三");
        Thread ls = new Thread(m, "李四");
        zs.start();
        ls.start();
        /*Thread.sleep(10000);
        System.out.println(m.money);*/
    }
}

class money_ implements Runnable {
    int money = 10;
    String name;

    @Override
    public void run() {
        while (true) /*synchronized (this)*/ {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (money <= 0) {
                System.out.println("钱取完了！");
                break;
            }
            synchronized (this){
                money--;
                System.out.println(Thread.currentThread().getName() + "取了1块钱,卡上余额：" + money);
            }

        }
        System.out.println(money);
    }
}
