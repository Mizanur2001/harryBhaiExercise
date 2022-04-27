// 10.	Define a class Students with marks as one of the data member. In the main method create an array of Student Object and calculate the average marks obtained by all the students. Take input using BufferedReader class object.

import java.io.*;
class Student{
    int[] marks = new int[100];
    int len ;
    Student(int []arr,int no_s){
        len = no_s;
        for(int i=0 ;i <arr.length; i++){
            marks[i]=arr[i];
        }
    }
    public float avg(){
        int sum = 0;
        for (int i= 0 ;i<marks.length;i++){
            sum = sum+marks[i];
        }
        return (float)sum/len;
    }
}

class Mani{
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter No of Students : ");
            int no_s = Integer.parseInt(br.readLine());
            int[] marks = new int[no_s];
            for(int i = 0 ; i<no_s; i++){
                System.out.printf("Enter Marks of student %d : ",i);
                int totalMarks = Integer.parseInt(br.readLine());
                marks[i] = totalMarks;
            }
            Student st = new Student(marks,no_s);
            System.out.println(st.avg());

        }catch(Exception e){
            System.out.println(e);
        }
    }

}