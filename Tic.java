import java.util.Scanner;

public class Tic {

    static int[] bord ;
    static int turn ;

    static String xPlayer = "";
    static String oPlayer = "";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bord = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        welcome();

        while (xPlayer.isEmpty()){
        System.out.println("Enter the X Player: ");
        xPlayer = sc.nextLine();
        }

        while (oPlayer.isEmpty()) {
            System.out.println("Enter the O Player: ");
            oPlayer = sc.nextLine();
        }

        turn = 1 ;
        while (true){
            gamePlay();

            if(check()){
                break;
            }
        }
    }

    static boolean check() {
        if( bord[0] == 1 && bord[1] == 1 && bord[2] == 1 || bord[3] == 1 && bord[4] == 1 && bord[5] == 1  ||
                bord[6] == 1 && bord[7] == 1 && bord[8] == 1 ||  bord[0] == 1 && bord[3] == 1 && bord[6] == 1 ||
                bord[7] == 1 && bord[4] == 1 && bord[1] == 1 ||  bord[2] == 1 && bord[5] == 1 && bord[8] == 1 ||
                bord[0] == 1 && bord[4] == 1 && bord[8] == 1 ||  bord[2] == 1 && bord[4] == 1 && bord[6] == 1){
            System.out.println();
            System.out.println("THE WINNER IS " + xPlayer );
            System.out.println();
            return true;
        }

        if( bord[0] == 2 && bord[1] == 2 && bord[2] == 2 || bord[3] == 2 && bord[4] == 2 && bord[5] == 2  ||
                bord[6] == 2 && bord[7] == 2 && bord[8] == 2 ||  bord[0] == 2 && bord[3] == 2 && bord[6] == 2 ||
                bord[7] == 2 && bord[4] == 2 && bord[1] == 2 ||  bord[2] == 2 && bord[5] == 2 && bord[8] == 2 ||
                bord[0] == 2 && bord[4] == 2 && bord[8] == 2 ||  bord[2] == 2 && bord[4] == 2 && bord[6] == 2){
            System.out.println();
            System.out.println("THE WINNER IS " + oPlayer );
            System.out.println();
            return true;
        }

        if(indexOf(bord , 0) < 0 ){
            System.out.println();
            System.out.println("IT IS TIE LOOOOOOOOOL" );
            System.out.println();
            return true;
        }

        return false;
    }

    static int indexOf(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    static void drowBord (){
        System.out.println();
        System.out.println("                  |        |        " + "               GUIDE:");
        System.out.println("              "+ val(bord[0]) +"   |   "+ val(bord[1]) +"    |    "+ val(bord[2]) +"   " + "                 1  |  2  |  3  ");
        System.out.println("                  |        |        " + "               -----|-----|-----");
        System.out.println("          --------|--------|--------" + "                 4  |  5  |  6  ");
        System.out.println("                  |        |        " + "               -----|-----|-----");
        System.out.println("              "+ val(bord[3]) +"   |   "+ val(bord[4]) +"    |    "+ val(bord[5] )+"   " + "                 7  |  8  |  9  ");
        System.out.println("                  |        |        ");
        System.out.println("          --------|--------|--------");
        System.out.println("                  |        |        ");
        System.out.println("              "+ val(bord[6]) +"   |   "+ val(bord[7]) +"    |    "+ val(bord[8]) +"   ");
        System.out.println("                  |        |        ");
        System.out.println();

    }

    static String val (int x){
        if(x == 1 ) return "X";
        if(x == 2 ) return "O";
        return " ";
    }

    static void gamePlay() {

        drowBord();

        System.out.println("it is " + playerName() + " turn ");
        System.out.println("Where to play???");

        int place ;
        while(true){
            place = sc.nextInt();
            if(place >= 1 && place <= 9){
                if(bord[place - 1] == 0) {
                    break;
                }
            }
            System.out.println("enter correct number!!!!");
        }

        bord[place - 1] = turn;

        if(turn == 1 ) {
            turn++;
        }else {
            turn--;
        }

        return;
    }

    static String playerName() {
        if(turn == 1 ) return xPlayer;
        if(turn == 2 ) return oPlayer;

        return "";
    }

    static void welcome() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("||||||||||    ||||||    ||  ||");
        System.out.println("    ||          ||      || ||");
        System.out.println("    ||          ||      ||||");
        System.out.println("    ||          ||      ||  ||");
        System.out.println("    ||          ||      ||   ||");
        System.out.println("    ||        ||||||    ||    ||");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


    }


}



