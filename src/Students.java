import java.util.ArrayList;
import java.util.Random;

public class Students {
	
	int classNo;
	
	Students(int classNo)
	{
		this.classNo=classNo;
	}
	
	ArrayList al= new ArrayList();
	public void addStudentAL(int numberOfStudents)
	{
		int number;
		for(int i=1;i<=numberOfStudents;i++)
		{
			Random r= new Random();
			
			number=r.nextInt(30);
			al.add(new Students(number));
		}
	}

}


