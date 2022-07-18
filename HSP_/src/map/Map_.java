package map;

import java.util.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/7
 */
@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        String[] st ;
        HashSet hs =new HashSet();
        hs.add("abcde");
        hs.add("abceg");
        hs.add("abef");
        hs.add(12345);
        for (Object ob: hs){
            System.out.println(ob);
        }
        System.out.println("================================");
        HashMap hm = new HashMap();
        hm.put("a","A");
        hm.put("b","B");
        Set set1 = hm.keySet();
        for (Object ob: set1){
            System.out.println(ob+"-"+hm.get(ob));
        }
        Collection values = hm.values();
        for (Object ob: values){
            System.out.println(ob);
        }
        Set entry = hm.entrySet();
        for (Object ob:
             entry) {
            Map.Entry me = (Map.Entry) ob;
            System.out.println(me.getKey()+"-"+me.getValue());
        }

    }
}
