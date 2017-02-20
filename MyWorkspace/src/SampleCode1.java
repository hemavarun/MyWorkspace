import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleCode1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int option;
		Session session = new Session();
		DateTime dateTime = new DateTime();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Session ID :");
		session.ID = Integer.parseInt(reader.readLine());
		System.out.println("Enter First Name :");
		session.FirstName = reader.readLine();
		System.out.println("Enter Last Name :");
		session.LastName = reader.readLine();
		System.out.println("Enter description :");
		session.Description =reader.readLine();
		session.custDate = dateTime.getDateTime();
		System.out.println();
		System.out.println("1. Beginner level");
		System.out.println("2. Intermediate level");
		System.out.println("3. Advanced level");
		System.out.println("Choose an option :");
		option = Integer.parseInt(reader.readLine());
		switch(option){
		
		case 1: session.level = "Beginner";
				break;
				
		case 2: session.level = "Intermediate";
		        break;
		
		case 3: session.level = "Advanced";
		        break;
		        
		default: System.out.println("Please enter a valid option");  
		}
		
		System.out.println("************************************************************");
		
		System.out.println("----------User Details----------");
		System.out.println("ID : "+ session.ID);
		System.out.println("First Name : "+ session.FirstName);
		System.out.println("Last Name : "+ session.LastName);
		System.out.println("Description : "+session.Description);
		System.out.println("Date : "+session.custDate);
		System.out.println("Level : "+session.level);
		System.out.println("************************************************************");
		
		
		
	}

}
