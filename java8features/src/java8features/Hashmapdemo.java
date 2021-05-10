package java8features;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {
    public static int getkey(int key)
    {
    	return key+2;
    	
    }
    
    public static int getvalue(int v2)
    {
    	return v2+2;
    }
	public static void main(String[] args) {
		parent p1=new parent(1);
		parent p2=new parent(1);
		Map<parent,String> h=new HashMap<parent,String>();
        h.put(p1,"jack");
       String k=h.put(p2,"ram");//returns old value associated with the key
        System.out.println(h.size());
        System.out.println(k);
        
        
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        map2.put(2, 3);
        map2.put(3, 4);
        map2.forEach((k1,v) -> System.out.println("key"+getkey(k1)+"value"+getvalue(v)));
	}

}
