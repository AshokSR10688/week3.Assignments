package week3.Assignments;

public class changeOddToUpperCase {

	public static void main(String[] args) {
		String testString = "education";
        String output = " ";
        for (int i = 0; i < testString.length(); i++) {
            if(i%2 == 0)
            {
                output += Character.toUpperCase(testString.toCharArray()[i]);
            }else
            {
                output += Character.toLowerCase(testString.toCharArray()[i]);
            }
        }

        System.out.println("Modified string is : "+ output);

	}

}
