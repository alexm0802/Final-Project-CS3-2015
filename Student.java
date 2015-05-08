import java.util.*;
public class Student implements Comparable
{
   //ArrayList<Committee> committees;
   ArrayList<Region> regions;
   double grade;
   String name;
   char gender;
   public Student(ArrayList<Region> regions, double grade, String name, char gender)
   {
      this.regions = regions;
      this.grade = grade;
      this.name = name;
      this.gender = gender;
   }
   
   public double getGrade()
   {
      return grade;
   }
   
   public ArrayList<Region> getRegions()
   {
      return regions;
   }
   
   public String getName()
   {
      return name;
   }
   
   public char getGender()
   {
      return gender;
   }
   
   public int compareTo(Object other)
   {
      if(other instanceof Student)
      {
         Student s = (Student) other;
         int minLength = 0;
         if(name.length()<s.getName().length())
         {
            minLength = name.length();
         }
         else
         {
            minLength = s.getName().length();
         }
         for(int i = 0; i < minLength; i++)
         {
            if(name.charAt(i)!=s.getName().charAt(i))
               return name.charAt(i) - s.getName().charAt(i);
         }
      }
      return 0;
   }
}