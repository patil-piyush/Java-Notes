
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {

            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);
            int i=0;
            while(i<5){
                arr[i] = sc.nextInt();
                i++;
            }
            sc.close();
            Student s = new Student(arr[0], arr[1], arr[2], arr[3], arr[4]);
            System.out.println("Total marks: " + s.getTotal());
            System.out.println("Average: " + s.getAvg());
            System.out.println("Percentage: " + s.getPercentage());
            System.out.println("Grade: " + s.setGrade());
    }
}


class Student{
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;
    char grade;

    public Student(){}

    public Student(int s1, int s2, int s3, int s4, int s5){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
    }

    public int getTotal(){
        return s1+s2+s3+s4+s5;
    }

    public float getAvg(){
        float avg = (s1+s2+s3+s4+s5)/5;
        return avg;
    }

    public float getPercentage(){
        return (getTotal()*100/500);
    }

    public char setGrade(){
        float percentage = getPercentage();

        if(percentage>=90) grade = 'A';
        else if(percentage>=80) grade = 'B';
        else if(percentage>=70) grade = 'C';
        else if(percentage>=60) grade = 'D';
        else grade = 'F';

        return grade;
    }    
}
