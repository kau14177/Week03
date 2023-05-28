/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * Monday today
 * @author Gagandeep Kaur
 */
public class Printstudentdetails {

    /** user interactions - view class
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student [] list = new Student[3];  // Array of object declaration
        
        // define 3 student by creating object of student class
        
        Student s1= new Student();  //s1 - object 1
        s1.setName("peter");
        s1.setAge(21);
        
        Student s2= new Student();  //s2 - object 2
        s2.setName("Jasdeep");
        s2.setAge(22);
        
        Student s3= new Student();  //s3 - object 3
        s3.setName("Kiran");
        s3.setAge(20);
        
        //Store object in array
                list[0] = s1;
                list[1] = s2;
                list[2] = s3;
                
                for (int i=0; i<list.length; i++) //read the array 
                {
                System.out.println(list[i].getName() + " "+list[i].getAge());
                System.out.println ("Gagandeep Kaur"); 
                }
                // Changes to learn fetch and merge.
               //This is the change at the branch test.
    
    }
    
}
