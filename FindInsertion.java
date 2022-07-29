package week3.Assignments;

public class FindInsertion {

	public static void main(String[] args) {
		int[] No1 = {3,2,11,4,6,7};
		 int[] No2 = {1,2,8,4,9,7};
		 for (int i=0; i<No1.length; i++) {
			 for(int j=0; j<No2.length; j++) {
				 if(No1[i] == No2[j] ){
					 System.out.println(No1[i]);
				 }
			 }
		 }

	}

}
