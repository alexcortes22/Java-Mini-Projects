/*
Title: Grade Analyzer
Author: Alex Cortes
Purpose: To determine the average, min, and max of numbers stored in a given ArrayList.
Methods: getAverage()
				 getMin()
         getMax()
*/
import java.util.ArrayList;

class GradeAnalyzer{
  public GradeAnalyzer(){
    
  }
  
  public int getAverage(ArrayList<Integer> grades){
    int size = grades.size();
    
    if (size < 1){
      System.out.println("The Array List is empty!");
      return 0;
    }
    else{
      int sum = 0;
      for(int grade: grades){
        sum = sum + grade;
      }
      int average = sum/size;
      System.out.println("The average is: " + average);
      return average;
    }
  }
  
  public int getMin(ArrayList<Integer> grades){
    int min = grades.get(0);
    for(int grade: grades){
      if (grade < min){
        min = grade;
      }
    }
    System.out.println("The minimum is: " + min);
    return min;
  }
  
  public int getMax(ArrayList<Integer> grades){
    int max = grades.get(0);
    for(int grade: grades){
      if (grade > max){
        max = grade;
      }
    }
    System.out.println("The mmaximum is: " + max);
    return max;
  }
  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getMin(myClassroom);
    myAnalyzer.getMax(myClassroom);
  }
}