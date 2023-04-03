package J31_Map.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task11 {

	public static void main(String[] args) {
		//Task ->  Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste return eden method create edinizn

		Map<Integer,String> map1 = new HashMap<>();			
		map1.put(101, "Ali, Can, java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
				

		
		List<String> isimList = javaBilenler(map1,"JAVA");
		System.out.println(isimList);
	}
	
	private static List<String> javaBilenler(Map<Integer, String> map1, String a) {

		List<String> isimListesi=new ArrayList<>();
		
		for (String each : map1.values()) {
			
			String arr[] = each.split(", ");
			
			if(arr[2].equalsIgnoreCase(a)) {
				isimListesi.add(arr[0]);
			}	
		}	
		return isimListesi;
	}
}