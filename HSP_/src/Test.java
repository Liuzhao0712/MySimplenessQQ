import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static int num = 1;//算法复杂度统计
    public static int count = 1;//计数器
    public static int dir = 0;//确定方向
    //1为向右走
    //2为向下走
    //3为向左走
    //4为向上走

    public static void main(String[] args) {
        System.out.println(new Random().nextInt(100));

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[][] map = newMap(i, j);
        //int[][] map ={{1,2,3},{6,7,8},{7,8,9}};
        writeMap(0, 0, map);
        //writeMap(i,j,map);
        Test.printMap(map);
        System.out.println("算法进入次数："+num);
    }

    public static void writeMap(int i, int j, int map[][]) {
        num++;
        try {
            int p = map[i][j];
        } catch (Exception e) {
            dir = (dir + 1) % 4;
            return;
        }
        if (map[i][j] != 0) {
            dir = (dir + 1) % 4;
            return;
        } else {
            map[i][j] = count;
            count++;
        }

        if (dir == 0) {
            writeMap(i, j + 1, map);
        }
        if (dir == 1) {
            writeMap(i + 1, j, map);
        }
        if ((dir == 2)) {
            writeMap(i, j - 1, map);
        }
        if (dir == 3) {
            writeMap(i - 1, j, map);
        }
        if (dir == 0) {
            writeMap(i, j + 1, map);
        }


    }

    public static int[][] newMap(int i, int j) {
        return new int[i][j];
    }

    public static void printMap(int[][] map) {
        for (int[] mapx : map) {
            for (int x : mapx) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
