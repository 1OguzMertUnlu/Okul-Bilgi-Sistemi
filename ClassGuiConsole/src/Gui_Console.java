import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gui_Console {
	
	static Scanner input=new Scanner(System.in);
	static ArrayList<Student> arrayStudent=new ArrayList<Student>();
	static ArrayList<Teacher> arrayTeacher=new ArrayList<Teacher>();
	static ArrayList<Class> arrayClass=new ArrayList<Class>();

    public static void main(String[] args) {
    	
    	String option = JOptionPane.showInputDialog(null, "Console:1, Gui:2");
    	Scanner input=new Scanner(System.in);
    	
    	if(option.equals("1"))
    		
    		while(true)
        	{
    	
    		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    		System.out.println("Add Student:1, List Student:2, Add Teacher:3, List Teacher:4, Add Class:5, List Class:6, Add Class-Teacher-Student:7, List Class-Teacher-Student:8, Gui Application:9, Exit:10");
    		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    		System.out.println(">>");
    		int selection = input.nextInt();
    		
    		switch(selection) {
    		case 1:
    			addStudent();
    			break;
    		case 2:
    			listStudent();
    			break;
    		case 3:
    			addTeacher();
    			break;
    		case 4:
    			listTeacher();
    			break;
    		case 9:
    			//System.exit(0);
    			new Gui_Application();
    			break;
    		
    		}
    	}
    	
    	else if (option.equals("2"))
    	{
    		new Gui_Application();
    	}
	}
    
    
    public static void addStudent()
    {
    	System.out.print("Name?");
    	String name=input.next();
    	System.out.println("Surname?");
    	String surname=input.next();
    	System.out.println("Age?");
    	int age=input.nextInt();
    	arrayStudent.add(new Student(name,surname,age));
    	System.out.println("The student is added succsesfuly...");
    }
    
    public static void listStudent()
    {
    	for(Student s:arrayStudent)
    		System.out.println(s.toString());
    		
    }
    
    
    public static void addTeacher()
    {
    	System.out.print("Name?");
    	String name=input.next();
    	System.out.println("Surname?");
    	String surname=input.next();
    	System.out.println("Age?");
    	int age=input.nextInt();
    	arrayTeacher.add(new Teacher(name,surname,age));
    	System.out.println("The teacher is added succsesfuly...");
    }
    
    public static void listTeacher()
    {
    	for(Teacher t:arrayTeacher)
    		System.out.println(t.toString());
    		
    }
    
    public static void addClass()
    {
    	System.out.println("ClassNmae?");
    	String cName = input.next();
    	System.out.println("Capacity?");
    	int cap=input.nextInt();
    	
    	arrayClass.add(new Class(cName, cap));
    }
    
    public static void listClass()
    {
    	for(Class c:arrayClass)
    		System.out.println(c);
    }
    
    

}
