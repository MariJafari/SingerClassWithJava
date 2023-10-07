
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		
		Singers singer1 = new Singers();
        System.out.println("Before insert data");
        singer1.Display();
        
        System.out.println();
        
        System.out.println("Please enter the singersId: ");
        singer1.setSingersId(input.nextInt());
        input.nextLine();
        System.out.println("Please enter the singersName: ");
        singer1.setSingersName(input.nextLine());
        //input.nextLine();
        System.out.println("Please enter the singersAddress: ");
        singer1.setSingersAddress(input.nextLine());
        //input.nextLine();
        System.out.println("Please enter the singersDateOfBirth: ");
        singer1.setSingersDateOfBirth(input.nextLine());
        //input.nextLine();
        System.out.println("Please enter the albumNumbers: ");
        singer1.setAlbumNumbers(input.nextInt());
        //input.nextLine();
        
        System.out.println();
        System.out.println("After insert data");
        singer1.Display();
        


        

	}

}
