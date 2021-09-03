//Evan White
import javax.swing.*;
import java.util.Calendar;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ClassesReview {
    String name = " ";
    int age = 0;
    int id = 0;
    int grade = 0;
    double gpa = 0.0;

    ClassesReview()
    {
       name = "";
       age = 0;
       id = 0;
       grade = 0;
       gpa = 0.0;
    }
    
	ClassesReview(String nam, int ag, int I, int grad, double gp)
	{
		name = nam;
		age = ag;
		id = I;
		grade = grad;
		gpa = gp;
	}
	
	
	public String getName()    // accessor "getter" methods
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
    //=======================================================================
	
	public void setName(String n)                // mutator "setter" methods
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setId(int i)
	{
		id = i;
	}
	
	public void setGrade(int g)
	{
		grade = g;
	}
	
	public void setGpa(double h)
	{
		gpa = h;
	}
	
	
	/*public String toString()
	{
		return String.format("%-15s %-20s %8.2f %3d", getName(), 
				getAge(), getId(), getGrade(), getGpa());
	}
	
	
	*/
	
	public boolean isHonorRoll()
	{
		if(gpa >= 3.0)
			return true;
		else
			return false;
	}
	
	public boolean isUpperClassman()
	{
		if(grade >= 11)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
}
