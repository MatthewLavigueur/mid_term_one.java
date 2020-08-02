package ca.concordia.ccecejv.excersises;

import java.util.Scanner;

public class Grade_Calculator {


    public static void main(String[] args) {


        System.out.println("" +
                "\n \n  --- -- - Welcome to the grade calculator - -- --- \n  ");


        System.out.println(" Here are ten auto generated grades \n " +
                "with their appropriate letter grade : \n");


        int scoreCount; //counts all grade/scores enter and generated
        int totScore;

        int averageScore;
        int totPass; // passing students
        int totFail; // failing students
        int totC;  // C students/Warning

        int maxScore;
        int minScore;

        String userInput; // for exit
        int userGrade;  // for extra grade input
        String answer; // for restart

        Scanner sc = new Scanner(System.in); // scanner for String answers
        Scanner sc1 = new Scanner(System.in); // scanner for number answers



        do {
            //set to zero upon program reset.
             maxScore = 0;
             minScore = 100;
             scoreCount = 0;
             totScore = 0;
             totPass = 0;
             totFail = 0;
             totC = 0;



            for (int i = 1; i <= 10; i++) {                               //prints 10 random numbers between 0 and 100
                int random = (int) (Math.random() * 100 + 1);
                {
                    totScore += random;
                    scoreCount++;




                                                                            //give random number letter grade

                    if (random <= 59)
                    { System.out.println("        " + random + " = Fail");

                        totFail++;        //counts fails for random num

                    } else if (random <= 69)
                    { System.out.println("        " + random + " = C");

                        totC++;         // counts total warnings for random num
                        totPass++;      // counts total Passes for random num


                    } else if (random <= 74)
                    { System.out.println("        " + random + " = B- ");

                        totPass++;

                    } else if (random <= 79)
                    { System.out.println("        " + random + " = B");

                        totPass++;

                    } else if (random <= 84)
                    { System.out.println("        " + random + " = B+");

                        totPass++;

                    } else if (random <= 89)
                    { System.out.println("        " + random + " = A-");

                        totPass++;

                    } else if (random <= 94)
                    { System.out.println("        " + random + " = A");

                        totPass++;

                    } else
                        { System.out.println("        " + random + " = A+");

                        totPass++;
                    }



                    // determines the lowest grade and highest grade for random
                    if ( random > maxScore)
                    {
                        maxScore = random;
                    }

                    if ( random < minScore)
                    {
                        minScore = random;
                    }


                }

            }
                    System.out.println("\n");


                System.out.println("To exit, press X/Q/R. Otherwise press any OTHER key to continue... ");
                userInput = sc.nextLine();



                while (!(userInput.equalsIgnoreCase("R")
                        || userInput.equalsIgnoreCase("X")
                        || userInput.equalsIgnoreCase("Q"))) {

                System.out.println("Please enter a grade : ");                       //Begin userGrade input program
                userGrade = sc1.nextInt();  //ask for user grade

                    System.out.println("\n");

                                                                    //give stats for userInputs plus generated numbers



                    totScore += userGrade;
                    scoreCount++;

                    // determines lowest grade and highest grade for userGrade input
                    if ( userGrade > maxScore)
                    {
                        maxScore = userGrade;
                    }

                    if ( userGrade < minScore)
                    {
                        minScore = userGrade;
                    }
                        // setting counters for userGrade inputs
                    if (userGrade <= 59) {

                        totFail++; //counts fails for userInputs

                    } else if (userGrade <= 69) {

                        totC++;    // counts total warnings student for userInputs
                        totPass++;  // counts total Passes for userInputs


                    } else if (userGrade <= 74) {

                        totPass++;

                    } else if (userGrade <= 79) {

                        totPass++;

                    } else if (userGrade <= 84) {

                        totPass++;

                    } else if (userGrade <= 89) {

                        totPass++;

                    } else if (userGrade <= 94) {

                        totPass++;

                    } else {

                        totPass++;
                    }


                    // ask user again between entries
                System.out.println("to exit press x q r to exit or press any OTHER key to continue ");
                userInput = sc.nextLine();

            }



            averageScore = totScore / scoreCount;    // sums average

            // calculations for average , count, min, max, fail, pass, and warning students

            System.out.println( "Total entries = " + scoreCount );

                //give letter grade to average score calculation

            if (averageScore <= 59)
            { System.out.print("Average Score = F ");
            } else if (averageScore <= 69)
            { System.out.print("Average Score = C ");
            } else if (averageScore <= 74) {
                System.out.print("Average Score = B- ");
            } else if (averageScore<= 79)  {
                System.out.print("Average Score = B ");
            } else if (averageScore <= 84) {
                System.out.print("Average Score = B+ ");
            } else if (averageScore <= 89) {
                System.out.print("Average Score = A- ");
            } else if (averageScore <= 94){
                System.out.print("Average Score = A ");
            } else {
            System.out.println( " Average Score = A+" );
            }System.out.println(averageScore);


                            //Rest of calculations for display


            System.out.println("Highest Grade =  " + maxScore);

            System.out.println("Lowest Grade = " + minScore);

            System.out.println("Warning = " +totC );

            System.out.println("Total Fails = " + totFail );

            System.out.println("Total Passes = " + totPass );

            System.out.println("\n");




                System.out.println("Restart? Y/N");             // restarts program, setting counters back to zero
                answer = sc.nextLine();




             } while (answer.equals("y") || answer.equals("Y"));


                System.out.println("\n");
                System.out.println("====== By Matthew Lavigueur ======");

    }
}




     









