public class cs123 {

	public static void main(String[] args) {
		//Array declaration    
		int [] Grades = {75, 85, 80, 90, 70};
	
		
		    //For loop to put the grades in reverse 
			for(int i = Grades.length-1; i>=0; i--)
			{
				System.out.println(i+" "+Grades[i]);
			}
	}

}
