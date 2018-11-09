import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Marc Lussier
 * Period 7
 * GettysburgAddressProject
 *
 */
public class GettysburgAddressProject
{

	public static void main(String[] args) 
	throws FileNotFoundException
	{
		//making array
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> address = new ArrayList<String>();
		while(file.hasNext())
			{
				address.add(file.next());
			}
		
		//showing address
		for (String word : address)
		{
			System.out.print(word + " ");
		}
		
		System.out.println("");
		
		//finding longest word
		System.out.print("The longest word in the Gettysburg Address is: ");
		String longestWord = address.get(0);
		for (String word : address)
		{
			int length = word.length();
			if (longestWord.length() < length)
			{
				longestWord = word;
			}			
					
		}
		System.out.println(longestWord);
		
		
		//finding average word length
		System.out.print("The average word length in the Gettysburg Address is: ");
		double avg = 0;
		double total=0;
		for (String word : address)
		{
			total += word.length();
		}
		avg = total/address.size();
		System.out.println(avg);	
	}
}
