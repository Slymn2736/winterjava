package day34maps;
import java.util.HashMap;
public class Maps02 {
    public static void main(String[] args) {
        
        HashMap <String, Integer> hm1 = new HashMap<>();
        hm1.put("dog", 3);
        hm1.put("chicken", 7);
        hm1.put("horse", 5);
        hm1.put("elephant", 8);
        System.out.println(hm1);
        HashMap <String, Integer> hm2 = new HashMap<>();
        hm2.put("dog", 3);
        hm2.put("chicken", 7);
        hm2.put("horse", 5);
        hm2.put("elephant", 8);
        System.out.println(hm2);
        //equal() checks just the value
        System.out.println(hm1.equals(hm2));//true
        //hm1.putAll(hm2) puts all the value in hm2 into hm1
        hm1.putAll(hm2);
        System.out.println(hm1);
        
        //entryKey() converts map to a set
        System.out.println(hm1.entrySet());
        
        //compute() updates the value
        hm1.compute("horse", (key,value)->value=9);//{horse=9, chicken=7, dog=3, elephant=8}
        System.out.println(hm1);
        hm1.compute("chicken", (key,value)->value+2);
        System.out.println(hm1);//{horse=9, chicken=9, dog=3, elephant=8}
        
        //try to use compute() with non-existing key
        //hm1.compute("dogx",(key,value)->value+2 );//NullPointerException
        //System.out.println(hm1);
        
        hm1.compute("chicken", (key,value)->key.length()-5);//{horse=9, chicken=2, dog=3, elephant=8}
        System.out.println(hm1);
        
        hm1.compute("chickenxxxxxxx", (key,value)->key.length()-5);//{horse=9, chicken=2, chickenxxxxxxx=9, dog=3, elephant=8}
        System.out.println(hm1);
        
        //computeIfPresent() method updates the value if key exists
        //If the key does not exist it does nothing
        hm1.computeIfPresent("dog", (key,value)->value+8);
        System.out.println(hm1);
        
        //computeIfAbsent() executes if the key does not exist
        //If the the key exists it does nothing
        hm1.computeIfAbsent("bee", k->7);
        System.out.println(hm1);
        hm1.computeIfAbsent("horse", k->999);
        System.out.println(hm1);
    
    }
}
