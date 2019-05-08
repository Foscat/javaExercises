
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class hashMapping {
	
	static HashMap<String, String> curs = new HashMap<String, String>();
	
	public static void filler(){
		//Fill hash map with junk
		curs.put("Accord", "Honda");
		curs.put("F-150", "Ford");
		curs.put("El Comino", "Chevy");
		curs.put("Pinto", "Ford");
		curs.put("Civic", "Honda");
		curs.put("DeVille", "Cadalak");
	}
	
	public static String ask(){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter a car type");
		String starter = start.nextLine();
		return starter;
	}
	
	public static String getInfo(){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter a car type");
		String starter = start.nextLine();
		
		return starter;
	}
	
	public static void getCars(){
		String response = ask();
		//loop through the hash map and return each key/value pair
		for (Entry<String, String> entry : curs.entrySet()){
			
			if(entry.getValue().equals(response)){
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key + ":" + value);
			}
		}
	}
	
	public static void main(String[] args){

		filler();
		System.out.println(curs);
		getCars();
		
		
	}

}
