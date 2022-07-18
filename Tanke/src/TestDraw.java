import javax.swing.*;
import java.awt.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/10
 */
public class TestDraw extends JFrame {
    public static void main(String[] args) {
        new TestDraw();
    }
    TestDraw(){
        add(new MyPanel());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    class MyPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            g.drawOval(100,100,200,200);
        }
    }
}
