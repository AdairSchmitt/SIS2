import java.util.ArrayList;
import java.util.Collections;

public class SortStudent 
{
	public static ArrayList<Student> sortByLastName()
	{
		ArrayList <Student> sorted = new ArrayList <Student>();
		
		for(Student s: SIS.roster)
		{
			sorted.add(s);
		}
		
		Collections.sort(sorted, new LastNameSort());
		return sorted;

	}
	
	public static ArrayList<Student> sortByPeriod1()
	{
		ArrayList <Student> sortedBy1 = new ArrayList <Student>();
		
		
		for(Student s: SIS.roster)
		{
			sortedBy1.add(s);
		}
		
		Collections.sort(sortedBy1, new Period1Sort());
		
		return sortedBy1;
	}
	
	
}
