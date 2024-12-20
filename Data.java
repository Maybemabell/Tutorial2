/**
 * Metavee Aeinjang 672115039
 * This program is for 953102 ADT & Problem solving section 701 Tutorial 2
*/
package Tutorial2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Vector;

public class Data {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("953102_list.csv");
        Scanner input = new Scanner(f);
        for(int i = 0;i < 7; i++){
            input.nextLine();
        }

        Vector<Student> student = new Vector<>();
        while(input.hasNextLine()){
            String dataLine = input.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken())); 
        }
        
        System.out.println("total student : " + student.size()); 
        for(char i = 'A';i <= 'Z' ; i++){
            displayResult(student, i);
        }
    }

    public static void displayResult(Vector<Student> students ,char letter){
        char Letter ;
        Vector<Student> toString = new Vector<>();
        int std_amount = 0;
        String firstname ;


        for(int i = 0;i <students.size();i++){
            firstname = students.elementAt(i).getfirtname();
            Letter = firstname.charAt(0);
            
            if (Letter == letter) {
                toString.addElement(students.elementAt(i));
                std_amount++ ;
            }
        }

        System.out.println();
        System.out.println("students name that start with " + letter + " : " + std_amount );
        
        for(Student i : toString){
            System.out.println(i);
        }
        
        }
        
    
}