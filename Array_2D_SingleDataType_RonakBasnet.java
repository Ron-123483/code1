/**
 * File: [Array_2D_SingleDataType_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/9/2024]
 * Description: [This program prints 2d jagged and ragged array]
 */

public class Array_2D_SingleDataType_RonakBasnet {


    public static void displayAlph(char[][] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            StringBuilder organization = new StringBuilder();
            for (int j = 0; j < alphabet[i].length; j++) {
                organization.append(alphabet[i][j]).append("   ");
            }
            if (i == 1) {
                System.out.print("           " + " ");
            } else if (i == 2) {
                System.out.print("       " + " ");
            } else if (i == 3) {
                System.out.print("               " + " ");

            } else if (i == 4) {
                System.out.print("               " + " ");

            } else if (i == 5) {
                System.out.print("                   " + " ");

            } else if (i == 6) {
                System.out.print("                   " + " ");
            }
            System.out.println(organization);


        }

    }
    public static void displayJagged(String[][] jaggedArr, char[][] alphabet) {

        System.out.println("\nDisplaying contents in any 2D arrays: ");


        for (String[] k : jaggedArr) {
            for (String m : k) {
                if (m.equals("H")) {
                    System.out.print("            ");
                } else if (m.equals("L")) {
                    System.out.print("        ");
                } else if (m.equals("Q")) {
                    System.out.print("                ");
                } else if (m.equals("T")) {
                    System.out.print("                ");
                } else if (m.equals("W")) {
                    System.out.print("                    ");
                } else if (m.equals("Y")) {
                    System.out.print("                    ");
                }

                System.out.print(m + "   ");
            }
            System.out.println();
        }




        }
        public static void main(String[] args) {
        System.out.println("Displaying contents in any 2D arrays: ");
        char[][] alphabet = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                {'H', 'I', 'J', 'K'},
                {'L', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S'},
                {'T', 'U', 'V'},
                {'W', 'X'},
                {'Y', 'Z'}


        };

        String[][] jaggedArr = new String[7][];


        jaggedArr[0] = new String[7];
        jaggedArr[1] = new String[4];
        jaggedArr[2] = new String[5];
        jaggedArr[3] = new String[3];
        jaggedArr[4] = new String[3];
        jaggedArr[5] = new String[2];
        jaggedArr[6] = new String[2];


        jaggedArr[0][0] = "A";
        jaggedArr[0][1] = "B";
        jaggedArr[0][2] = "C";
        jaggedArr[0][3] = "D";
        jaggedArr[0][4] = "E";
        jaggedArr[0][5] = "F";
        jaggedArr[0][6] = "G";
        jaggedArr[1][0] = "H";
        jaggedArr[1][1] = "I";
        jaggedArr[1][2] = "J";
        jaggedArr[1][3] = "K";
        jaggedArr[2][0] = "L";
        jaggedArr[2][1] = "M";
        jaggedArr[2][2] = "N";
        jaggedArr[2][3] = "O";
        jaggedArr[2][4] = "P";
        jaggedArr[3][0] = "Q";
        jaggedArr[3][1] = "R";
        jaggedArr[3][2] = "S";
        jaggedArr[4][0] = "T";
        jaggedArr[4][1] = "U";
        jaggedArr[4][2] = "V";
        jaggedArr[5][0] = "W";
        jaggedArr[5][1] = "X";
        jaggedArr[6][0] = "Y";
        jaggedArr[6][1] = "Z";

        displayAlph(alphabet);
        displayJagged(jaggedArr, alphabet);


    }
}




//        for (int i = 0; i < jaggedArr.length; i++) {
//            StringBuilder rowContent = new StringBuilder();
//            for (int j = 0; j < jaggedArr[i].length; j++) {
//                rowContent.append(jaggedArr[i][j]).append("   ");
//
//
//                if(i == 1){
//                    System.out.printf("%3s", " ");
//                }
//                else if(i == 2){
//                    System.out.print("  ");
//                } else if(i == 3){
//                    System.out.printf("%5s", "  " + "    ");
//                }else if(i == 4){
//                    System.out.printf("%5s", "  " + "    ");
//                }
//                else if (i == 5) {
//                    System.out.printf("%10s", " ");
//                } else if (i == 6) {
//                    System.out.printf("%10s", " ");
//                }
//
//                rowContent.append(alphabet[i][j]).append("   ");

//        for (int i = 0; i < jaggedArr.length; i++) {
//            StringBuilder rowContent = new StringBuilder();
//            for (int j = 0; j < jaggedArr[i].length; j++) {
//                rowContent.append(jaggedArr[i][j]).append("   ");
//
//                if(i == 1){
//                    System.out.printf("%3s", " ");
//                }
//                else if(i == 2){
//                    System.out.print("  ");
//                } else if(i == 3){
//                    System.out.printf("%5s", "  " + "    ");
//                }else if(i == 4){
//                    System.out.printf("%5s", "  " + "    ");
//                }
//                else if (i == 5) {
//                    System.out.printf("%10s", " ");
//                } else if (i == 6) {
//                    System.out.printf("%10s", " ");
//                }
//            }
//
//            System.out.println(rowContent);
//
//        }





//        for (int k = 0; k < alphabet.length; k++) {
//            StringBuilder rowConTwo = new StringBuilder();
//            for (int l = 0; l < alphabet[k].length; l++) {
//                rowConTwo.append(alphabet[k][l]).append("   ");
//            }
//            if (k == 1) {
//                System.out.print("           " + " ");
//            } else if (k == 2) {
//                System.out.print("       " + " ");
//            } else if (k == 3) {
//                System.out.print("               " + " ");
//
//            } else if (k == 4) {
//                System.out.print("               " + " ");
//
//            } else if (k == 5) {
//                System.out.print("                   " + " ");
//
//            } else if (k == 6) {
//                System.out.print("                   " + " ");
//            }
//            System.out.println(rowConTwo);


