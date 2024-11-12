package dataStucture;

import java.util.HashSet;

public class DataClass 
{
 
public static void main(String[] args) 
{ 
	HashSet<Student> data = new HashSet<>();
	
	data.add(new Student("Vivek", "vivek@gmail.com", 101));
	data.add(new Student("Aman", "aman@gmail.com", 102));

	for(Student s:data)
	{
		s.getAllData();
	}
	
	
}	
	
}
