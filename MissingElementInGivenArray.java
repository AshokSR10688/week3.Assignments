package week3.Assignments;

import java.util.Arrays;

public class MissingElementInGivenArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		for (int i=0;i<a.length;i++)
		{  if((i+1)!=a[i]) {
			System.out.println("Missing Element :  " +(i+1));
			break;
		}
			}
	}

}
