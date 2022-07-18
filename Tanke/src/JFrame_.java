import javax.swing.*;
import java.awt.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/10
 */
public class JFrame_ extends JFrame {
    JFrame_(){
        this.add(new MyPanel());
        this.setSize(1000, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrame_();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(100,100,50,50);


    }


    public void f1(int a,int b,int c,int d){

    }
    class MyPanel extends Panel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawOval(100,100,50,50);
        }
    }
}
