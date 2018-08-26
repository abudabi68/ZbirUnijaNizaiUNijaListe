package cetvrto.poglavlje;

import java.util.ArrayList;
import java.util.HashSet;

public class UnijaSkupa {

	public static void printUnion(int arr1[],int arr2[]){
		ArrayList<Integer> hs= new ArrayList<>();
		for(int i=0;i<arr1.length;i++){
			hs.add(arr1[i]);
		
		}
		for(int i=0;i<arr2.length;i++){
			hs.add(arr2[i]);
		}
		System.out.println(hs);
	}
	
	
	public static void main(String[] args) {
		int arr1[]={22,4,8,46,36,63,88};
		int arr2[]={2,25,15,23};
		System.out.print("Unija dva skupa ondosno liste je :");
		printUnion(arr1,arr2);
	}

}
