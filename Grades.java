import java.util.Scanner;

public class Grades {
    static Scanner sc = new Scanner(System.in);
    static int total,count, max, min;
    static String letterGrades;

    public static void main(String[] args){

        boolean exit = false;

        do{
            getManue();
            System.out.println("\n Enter: ");
            int choice = sc.nextInt();// we can make it string then try to parse it to avoid errors
            switch(choice){
                case 1 :
                    //enterScores(); // I think this is the best way
                    enterScoresAsTheySaid(); // The sheet like this stupid way
                    break;
                case 2 :
                    findHighestScore();
                    break;
                case 3 :
                    findLowestScore();
                    break;
                case 4 :
                    calculateAverageScore();
                    break;
                case 5 :
                    displayLetterGrades();
                    break;
                case 6 :
                    exit = true; // change th flag to exit
                    break;
                default:
                    System.out.println("/n invalid entry!!!");
            }

            if(exit) {
                System.out.println("Bye..");
                break;
            }

        }while(true);
    }

    private static void getManue() {
        System.out.println("What do you want to do?\n");
        System.out.println("(1) Enter scores");
        System.out.println("(2) Find highest score");
        System.out.println("(3) Find lowest score");
        System.out.println("(4) Calculate average score");
        System.out.println("(5) Display letter grades");
        System.out.println("(6) Exit");

    }


    static void enterScores(){
        total = 0;
        max = 0;
        min = 100;
        count = 0;
        letterGrades = "";
        System.out.println("\nEnter every grade then press enter (Enter -1 to exit)");
        do{
            int enterd = sc.nextInt();
            if(enterd == -1){
                System.out.println("Done..\n");
                break;
            }
            saveTheLettergrades(enterd);            
            total += enterd;
            if(enterd > max) max = enterd;
            if(enterd < min) min = enterd;
            count++;
        }while (true);
    }

    static void findHighestScore(){
        if(count < 1) {
            System.out.println("You need to enter grades first..\n");
            return;
        }
        System.out.println("\nThe highest grade is: " + max);
        System.out.println("");
    }

    static void findLowestScore(){
        if(count < 1) {
            System.out.println("You need to enter grades first..\n");
            return;
        }
        System.out.println("\nThe lowest grade is: " + min);
        System.out.println("");
    }

    static void calculateAverageScore(){
        if(count < 1) {
            System.out.println("You need to enter grades first..\n");
            return;
        }
        double avg = total / count;
        System.out.println("\nThe average is: " + avg);
        System.out.println("");
    }
    
    static void saveTheLettergrades(int grade){
    
            if(grade >= 90)letterGrades += grade + ":A\n";
            else if(grade >= 80) letterGrades += grade + ":B\n";
            else if(grade >= 70) letterGrades += grade + ":C\n";
            else if(grade >= 60) letterGrades += grade + ":D\n";
            else if(grade < 60) letterGrades += grade + ":F\n";
    }

    static void displayLetterGrades(){
        System.out.println("The letter grades.. \n");
        System.out.println("A: 90-100");
        System.out.println("B: 80-89.99");
        System.out.println("C: 70-79.99");
        System.out.println("D: 60-69.99");
        System.out.println("F: below 60\n");

        System.out.println(letterGrades + "\n");


    }

    static void enterScoresAsTheySaid(){
        total = 0;
        max = 0;
        min = 100;
        count = 0;
        letterGrades = "";        
        System.out.println("Enter scores separated by spaces, enter -1 when you're done");
        sc.nextLine();// little trick to make scanner.nextLine wait for user input
        String entry = sc.nextLine();
        String[] inputArr = entry.split(" ");
        for(int i = 0 ; i < inputArr.length ; i++){
            int grade = Integer.parseInt(inputArr[i]);
            if(grade == -1) break;
            saveTheLettergrades(grade);
            total += grade;
            if(grade > max) max = grade;
            if(grade < min) min = grade;
            count++;

        }
    }
    
}