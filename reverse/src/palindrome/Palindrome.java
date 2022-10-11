package palindrome;

public class Palindrome {

	public static void main(String[] args, Object cityName) {
		
		String language = "Malayalam";
		
		StringBuffer palindrome = new StringBuffer(language);
		
		palindrome.reverse();
		
		String data = palindrome.toString();
		
		if (cityName.equals(data)) {
			
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

	}
}

	

