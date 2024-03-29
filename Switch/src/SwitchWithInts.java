import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SwitchWithInts {

	public static void main(String[] args) {
		String input = getInput("Enter the number between 1 and 12: ");
		int month = Integer.parseInt(input);
		
		switch (month) {
		case 1:
			System.out.println("The month is Januari");
			break;
		case 2:
			System.out.println("The month is Februari");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		default:
			break;
		}	
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
