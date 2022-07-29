package week3.Assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";
	        
	        System.out.println("Actual String: ");
	        System.out.println(str);
	        String[] strWords = str.split("\\s+");
	        
	        LinkedHashSet<String> SetWords = new LinkedHashSet<String>( Arrays.asList(strWords) );
	       
	        StringBuilder Java = new StringBuilder();
	        int index = 0;
	        
	        for(String s : SetWords){
	            
	            if(index > 0)
	                Java.append(" ");
	        
	            Java.append(s);
	            index++;
	        }
	        
	        str = Java.toString();
	        
	        System.out.println("After removing duplicate words: ");
	        System.out.println(str);
	 
	    }
	}


