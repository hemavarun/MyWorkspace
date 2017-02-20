import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleCode2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int option;
		SpeakerModel session = new SpeakerModel();
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
		System.out.println("Enter email :");
		session.Email =reader.readLine();
		System.out.println("Enter event  :");
		session.Event =reader.readLine();
		System.out.println("Enter created by  :");
		session.CreatedBy =reader.readLine();
		System.out.println("Enter Speaker Name  :");
		session.SpeakerName =reader.readLine();

		
		System.out.println("************************************************************");
		
		System.out.println("----------User Details----------");
		System.out.println("ID : "+ session.ID);
		System.out.println("First Name : "+ session.FirstName);
		System.out.println("Last Name : "+ session.LastName);
		System.out.println("Email : "+session.Email);
		System.out.println("Event : "+session.Event);
		System.out.println("Created BY : "+session.CreatedBy);
		System.out.println("Speaker Name : "+session.SpeakerName);
		
		System.out.println("Description : "+session.Description);
		System.out.println("Date : "+session.custDate);
		System.out.println("************************************************************");
		
		
		
	}

}
