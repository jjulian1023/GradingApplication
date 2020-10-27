/*
    julian arcila
*/
//importing scanner for user
import java.util.Scanner;
/*
    This program will analyze the performance of 5 students for ISM3230 for professor Toledo
    This will depend on the users input of different scores and their name.

*/
public class GradingApplication {
//starting class for main argument below
/*
        This program is ran with 5 user defined methods to be able to store all of the information the user is inputing.
        It will have methods containing the name enterStudentNames,enterScores,compaverageScoresPerStu,compTotalQuizAvg,printStuReport
        It will first ask the user to input the names of the 5 people who took the test and then it will prompt to write 3 quizes for each person you wrote.
        Then i place the information into methods were i am able to call it to be able to figure out the average of every quiz per person and then calculate the average for evyerone in total.
        
*/
    //constant for the amount of people asked which are 5 people
    public static final int SIZE = 5;
    //constant to use for the amount of quizes to divide by since there are only 3 quizes being done
    public static final double QUIZ = 3;
    
    //applying main method below where i will have arrays and be able to print out the input required
    public static void main(String[] args) {
        
        //declaring scanner into the program
        Scanner input = new Scanner(System.in);
        //Storing name of employees
        String[] saStudents = new String[SIZE];//array for entering student name
        double[] daQuiz1Stu = new double[SIZE];//array for quiz 1 student input
        double[] daQuiz2Stu = new double[SIZE];//array for quiz 2 student input
        double[] daQuiz3Stu = new double[SIZE];//array for quiz 3 student input
        double[] daAverageScorePerStudent = new double[SIZE];//array of average of all 3 quizes per student
        double dTotAvg = 0.0;//array to for average of all quizes
        
        //call method for enterStudentNames
        enterStudentNames(saStudents);
        
        
        //call method for enterScores
        enterScores(saStudents,daQuiz1Stu,daQuiz2Stu,daQuiz3Stu);
        
        
        //call method for average of scores(quizes)
        daAverageScorePerStudent = compaverageScoresPerStu(daQuiz1Stu, daQuiz2Stu, daQuiz3Stu);
        
        //call method total quiz average
        dTotAvg = compTotalQuizAvg(daAverageScorePerStudent);
        
        //call method to print report 
        printStuReport(saStudents, daQuiz1Stu,daQuiz2Stu,daQuiz3Stu, daAverageScorePerStudent, dTotAvg);
        
    }//end main method
    
    // this is a void method that contains information to be able to print the student report that is required to print what is required for the sample
    public static void printStuReport(String[] saStuNames, double[] daQz1, double[] daQz2, double[] daQz3, double[] daAvgScorePerStu, double daTotalAverage){
       //printing out student report
       System.out.println("STUDENT REPORT");
       //print space
        System.out.println("");
       //printing out in a line serparted by a printformat line for strings. 
       System.out.printf("%-30s %-30s %-30s %-30s %-30s\n","Name","Quiz1","Quiz2","Quiz3","Quiz Average");
       //printing out seperated for the sample output "_ _ _ _ _"
       System.out.printf("%-30s %-30s %-30s %-30s %-30s\n","_ _ _ _ _","_ _ _ _ _","_ _ _ _ _","_ _ _ _ _","_ _ _ _ _");
       //printing out extra space
       System.out.println("");
      
        //setting LCV for FOR loop
        int nIndex = 0;
        //for loop to be print out 5 times excalty which is the constant. 5 categories.
        for(nIndex = 0; nIndex < SIZE;nIndex++){
            //printing out the values that are stored for "Name","Quiz1","Quiz2","Quiz3","Quiz Average"
            System.out.printf("%-30s %-30s %-30s %-30s %-30s\n",saStuNames[nIndex],daQz1[nIndex],daQz2[nIndex],daQz3[nIndex],daAvgScorePerStu[nIndex]); 
            
        }//end of for loop
        //printing out the last thing they will ask for which is the class quiz average 
        System.out.printf("%-30s\n","Class Quiz Average: " + daTotalAverage);
        
    }// end of printStuReport method
    


    //this method does recieve an array of double and based on that compute the total of the average and returns it to the main message
    public static double compTotalQuizAvg(double[] dAvgQuiz) {
        //declaring variable
        double dTotalQuizAvg = 0.0;
        //declaring variable
        double dTotalAvg = 0.0;
        //declaring LCV for FOR loop
        int nCount = 0;
        //starting for loop to be able to calculate the quizses all together and find the total quiz average of everyone
        for(nCount = 0; nCount < SIZE; nCount++){
            dTotalAvg = dTotalAvg + dAvgQuiz[nCount];
        }//end of for loop
        dTotalQuizAvg = dTotalAvg/SIZE;
        //return the total quiz average for everyone
        return dTotalQuizAvg;
        
        
    }//end of compTotalQuizAvg method
    
    
    
    
    //this method recives a double and returns a double  to get average of scores for each student and returns it to the main message
    public static double[] compaverageScoresPerStu(double[] daQ1, double[] daQ2, double[] daQ3) {
        //double array that will not pass 5 elements
        double[] daAvgScorePerStu = new double[SIZE];
        int nCount = 0;
        //for loop to compute the quizes average divided by a constant of 3
        for (nCount = 0; nCount< SIZE; nCount++){
            daAvgScorePerStu[nCount] = (daQ1[nCount] + daQ2[nCount] + daQ3[nCount]) / QUIZ;
        }//end of for loop to compute the quizes average of the student
        
        //return the average score per student
        return daAvgScorePerStu;
    } //end of averageScoresPerStu method
    
    
    //this method returns nothing but it is to input the scores for each quiz from to 1 to 3.
    public static void enterScores(String[] saStuNames, double[] daQuiz1, double[] daQuiz2, double[] daQuiz3) {
        //input scanner for void method below
        Scanner input = new Scanner(System.in);
        
        //intialize LCV for FOR loop
        int nCount2 = 0;
        //starting for loop to be enter the scores for quiz1
        for (nCount2 = 0; nCount2 < SIZE; nCount2++){
            System.out.print("Enter quiz1 for "+saStuNames[nCount2]+": ");
            daQuiz1[nCount2] = input.nextDouble();//user input
        }//end of for loop for quiz 1 data of scores
        
        System.out.println("");//printing space
        
        //intialize LCV for FOR loop
        int nIndex = 0;
        //starting for loop to be enter the scores for quiz2
        for (nIndex = 0; nIndex < SIZE; nIndex++){
            System.out.print("Enter quiz2 for "+saStuNames[nIndex]+": ");
            daQuiz2[nIndex] = input.nextDouble();//user input
        }//end of for loop for quiz 2 data
        
        System.out.println("");//printing space
        
        //intialize LCV for FOR loop
        int nIndex1 = 0;
        //starting for loop to be enter the scores for quiz3
        for (nIndex1 = 0; nIndex1 < SIZE; nIndex1++){
            System.out.print("Enter quiz3 for "+saStuNames[nIndex1]+": ");
            daQuiz3[nIndex1] = input.nextDouble();//user input
        }//end of for loop for quiz 3 data
        
        System.out.println("");//printing space
        
    }//end of enterScores method
    
    
    
    //this method returns nothing but this is to enter the names of the students
    public static void enterStudentNames(String[] saStudentNames) {
        //input scanner for void method below
        Scanner input = new Scanner(System.in);
        //intialize LCV for FOR loop
        int nCount = 0;
        
        //for loop to input student names
        for (nCount = 0; nCount < SIZE; nCount++){
            System.out.print("Enter Student Name: ");
            saStudentNames[nCount] = input.next();
        }//end of for loop
        System.out.println("");//printing space
    }//end of enterStudentNames void method
    


}//end of class Grading Application
