

public class Matriz{

    public static void main (String[] args){

        String [][] matriz = new String[6][6];

        matriz[0][0] = "       ";
        matriz[0][1] = "   0   ";
        matriz[0][2] = "   1   ";
        matriz[0][3] = "   2   ";
        matriz[0][4] = "   3   ";
        matriz[0][5] = "   4   ";

        matriz[1][0] = "   0   ";
        matriz[1][1] = "| ___ |";
        matriz[1][2] = "| ___ |";
        matriz[1][3] = "| ___ |";
        matriz[1][4] = "| ___ |";
        matriz[1][5] = "| ___ |";

        matriz[2][0] = "   1   ";
        matriz[2][1] = "| ___ |";
        matriz[2][2] = "| ___ |";
        matriz[2][3] = "| ___ |";
        matriz[2][4] = "| ___ |";
        matriz[2][5] = "| ___ |";

        matriz[3][0] = "   2   ";
        matriz[3][1] = "| ___ |";
        matriz[3][2] = "| ___ |";
        matriz[3][3] = "| ___ |";
        matriz[3][4] = "| ___ |";
        matriz[3][5] = "| ___ |";
        
        matriz[4][0] = "   3   ";
        matriz[4][1] = "| ___ |";
        matriz[4][2] = "| ___ |";
        matriz[4][3] = "| ___ |";
        matriz[4][4] = "| ___ |";
        matriz[4][5] = "| ___ |";

        matriz[5][0] = "   4   ";
        matriz[5][1] = "| ___ |";
        matriz[5][2] = "| ___ |";
        matriz[5][3] = "| ___ |";
        matriz[5][4] = "| ___ |";
        matriz[5][5] = "| ___ |";




        for(int i = 0; i < 6;i++){

            System.out.println();

            for(int o = 0; o < 6; o++){

                System.out.print(matriz[i][o] + " ");
            }

        }

        System.out.println("\n");
    }

}