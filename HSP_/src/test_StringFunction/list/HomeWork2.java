package test_StringFunction.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @quthor Liuzhao
 * @date 2022/7/2
 */
@SuppressWarnings({"all"})
public class HomeWork2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("小说1",20));
        list.add(new Book("小说2",50));
        list.add(new Book("小说3",30));
        System.out.println(list);
        System.out.println("排序前");
        for (Object ob: list){
            System.out.println(ob);
        }
        System.out.println("排序后");

        stor(list);
        for (Object ob: list){
            System.out.println(ob);
        }
        list.add("");
        list.add(null);
        System.out.println(list);


    }


    public static void stor(List list){
        int listSize= list.size();
        for (int i=0;i<listSize-1;i++){
            for (int j =0;j<listSize-1-i;j++){
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()> book2.getPrice()){
                    list.set(j+1,book1);
                    list.set(j,book2);
                }

            }
        }
    }
}
@SuppressWarnings({"all"})
class Book{
    String naem ;
    int price;

    public Book(String naem, int price) {
        this.naem = naem;
        this.price = price;
    }


    public String getNaem() {
        return naem;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "naem='" + naem  + ", price=" + price;
    }
}
