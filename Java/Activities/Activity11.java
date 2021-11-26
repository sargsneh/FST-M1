package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map=new HashMap <Integer,String>();
		hash_map.put(1,"RED");
		hash_map.put(2,"Green");
		hash_map.put(3,"Blue");
		hash_map.put(4,"White");
		hash_map.put(5,"Black");
		
		System.out.println("Hash Map values are: " + hash_map);
		
		hash_map.remove(4);
		
		System.out.println("Hash Map values after removal are: " + hash_map); 
		
		if(hash_map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
		System.out.println("Hash Map size: " + hash_map.size()); 

	}

}
