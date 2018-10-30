import java.util.Scanner;

public class Grades2 {
    static Scanner sc = new Scanner(System.in);
    static int total,count, max, min;
    static int[] grades = new int[25];

    public static void main(String[] args){

        boolean exit = false;

        do{
            getManue();
            System.out.println("\n Enter: ");
            int choice = sc.nextInt();// we can make it string then try to parse it to avoid errors
            switch(choice){
                case 1 :
                    enterScores(); 
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
                System.out.println("\nBye..\n");
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
        System.out.println("Enter scores separated by spaces, enter -1 when you're done(MUST BE LESS THAN 25 GRADES)");
        sc.nextLine();// little trick to make scanner.nextLine wait for user input
        String entry = sc.nextLine();
        String[] inputArr = entry.split(" ");
        for(int i = 0 ; i < inputArr.length ; i++){
            grades[i] = Integer.parseInt(inputArr[i]);
            if(grades[i] == -1) break;
            total += grades[i];
            if(grades[i] > max) max = grades[i];
            if(grades[i] < min) min = grades[i];
            count++;
        }
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

        static void displayLetterGrades(){
        System.out.println("The letter grades.. \n");
        System.out.println("A: 90-100");
        System.out.println("B: 80-89.99");
        System.out.println("C: 70-79.99");
        System.out.println("D: 60-69.99");
        System.out.println("F: below 60\n");

        if(count <= 0) return;
        for(int i = 0 ; i < count ; i++){
            if(grades[i] >= 90) System.out.println("A");
            else if(grades[i] >= 80) System.out.println("B");
            else if(grades[i] >= 70) System.out.println("C");
            else if(grades[i] >= 60) System.out.println("D");
            else if(grades[i] < 60) System.out.println("F");            
            
        }
    }

}