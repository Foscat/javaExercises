
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
	
	public static ArrayList<Integer> numbers = new ArrayList<Integer>();  
	
	public static ArrayList<Integer> looperValues(){
		Scanner start = new Scanner(System.in);
		for(int i =0; i<5; i++){
			System.out.println("Enter a number");
			int starter = start.nextInt();
	
			numbers.add(starter);
			
		}
		System.out.println(numbers);
		return numbers;
	}
	
	public static int adder(){
		int totalValue = 0;
		for(int total: numbers){
			totalValue += total;
		}
		return totalValue;
    }
    
	public static int product(){
		int endProduct =1;
		for(int total: numbers){
			endProduct = endProduct * total;
		}
		return endProduct;
    }
    
	public static int biggest(){
		int biggest = 0;
		for(int big: numbers){
			if(big > biggest){
				biggest = big;
			}
		}
		return biggest;
	}
	
	public static int smallest(){
		int smallest = 999999999;
		for(int small: numbers){
			if(small <= smallest){
				smallest = small;
			}
		}
		return smallest;
	}


	public static void main(String[] args){
		looperValues();
		int mySum = adder();
        System.out.println("Sum of all fears: " + mySum);

        int myProduct = product();
        System.out.println("The just multiply: " + myProduct);
        
		int bigBoy = biggest();
        System.out.println("Biggis Dickkus is " + bigBoy);
        
		int littleBoy = smallest();
		System.out.println("The little guy is " + littleBoy);
		
		
		
	}
}