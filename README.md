# GradingApplication
grading application asking for user input of grades

Grading Application
You are creating a program for professor Toledo at Florida Atlantic University to analyze the performance of 5 students in ISM3230. You must write a program that allows the user to enter five student names, then prompts the user to enter the quiz 1 scores for each student, then asks for all the quiz 2 scores, and finally asks for the quiz 3 scores. The program should then calculate the averages for each student at the end of each student row in a separate column named “Quiz Average”. Finally, the program should output the overall average of the 5 students on the three quizzes.
Note: Consider 5 students taking the quiz and there are only 3 quizzes.
You must prompt the user to enter:
 The name of the student
 Quiz score for each student on 3 different quizzes
The program then outputs the following information:
 Students’ names in a column
 Quiz score for each student on quizzes 1-3 (Each in its own column)
 Quiz Average for each student
 Outputs the overall class average on all quizzes
Please refer to the Sample Output file for full details of what the program should look like when it runs.
Program requirements:
1. Your program MUST read all of the information about the students (names and score received) BEFORE doing anything else in the program (e.g. calculating the average of quiz scores)
2. You MUST store the following information in five different arrays:
     
Students’ Names;
Quiz 1 score for each student, Quiz 2 score for each student,
Quiz 3 score for each student;
The average for each student. (Not inputted by the user)
3. Your program MUST include the following user-defined method, in addition to the main method:
 A void method to enter the student’s names). It will be receiving an empty array that will be used to store names.
 A void method to enter the student quiz scores. It receives array with the names of the students and three empty arrays that should store the quizzes for the students
 A Method to compute and return to the main method an array with the average of the quizzes per student which will receive the arrays (Quiz 1, Quiz 2, and Quiz 3)
 A method to compute and return the total quiz average. This method will receive the array with the average of the quizzes for each student.
 Void method to print out the report and will receive all the arrays needed to print
Possible high-level outline for the logic of your program (you do NOT have to follow these steps – this is just a suggestion):
1
 Loop to read the name of each student into an array
 Another loop to store the quiz scores received into an array
 Call method that has loop to calculate the average quiz score per student.
 Call method with a loop to calculate the average score earned by the total class
 Call method to print the students’ names, scores on each quiz, and average quiz score for
each student
This assignment MUST be created individually. You must turn in your OWN source code and Java bytecode executable file. You MAY NOT share files!
Instructions
 Compile and execute your program to ensure that it works correctly.
 Be sure to run your final program using the sample data included in the Sample Output file
to ensure your program works properly.
 Make sure your output labels match those in the Sample Output file exactly.
Notes
 You MUST store any calculations in variables.
 You do NOT need to worry about formatting the decimal places on values you calculate
 You may perform the tasks in any order as long as your output follows the order of the
output in the example scenarios contained in the Sample Output file
 You must include the one user-defined method specified above. You may include additional
methods if you want, but you MUST include at least this method in addition to main.
 Do NOT use global variables unless you have a REALLY good reason for doing so.
ISM 6148 (20 points)
Determine the student with the highest score on each of the quizzes 1-3, and print the winner to the screen. Please refer to the Sample Output – BONUS file for formatting details. You do not need special syntax to do this – you will have to think logically about how to solve this problem.
ISM 6148 Requirements:
 Will require three different void methods that will calculate the winner for each quiz.
 You must find a way to compare the quizzes for each student and figure out who has
the highest
 At the end of each method make sure to print the student with the highest score
To receive full credit:
 Submit the following files to Canvas
o File with your Java source code (.java file)
o File with your Java bytecode executable file (.class file)
 ModulesNetBeans Information -> NetBeans -> where are my files for my hw?
 You must follow the appropriate Coding Standards listed in the Coding Standards document
under Modules on Canvas.
o 40% of your grade on the source code will be based on how well you follow these
standards and how well you comment your source code
 Submit your files to Canvas using the Assignment submission feature by 11:59pm
10/20/2019. Instructions for submission are available on Canvas where you downloaded this file (Assignments --> Homework 5).
2
