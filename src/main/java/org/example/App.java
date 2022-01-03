package org.example;

import java.util.Scanner;

/*
 * Hello world!
 * fdskadfsdfjj
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        // System.out.println();
        // System.out.println("ezt fogom kiiratni");
        //// // adattípusok
        //// // int -> egész számok
        // int elsoSzamAdat = 5;
        //// elsoSzamAdat = 6;
        // System.out.println("elso szam: " + elsoSzamAdat);
        //// // float, double -> törtek

        // double number2 = 5.6;
        // System.out.println("Double number: " + number2);
        //// // char -> 1 karaktert tárol -> ''
        // char character1 = 'b';
        // System.out.println("Your character: " + character1);
        //// // String -> több karaktert tárol -> ""
        // String string1 = "ez egy strin52435435/%(/=%(=%=g";
        // System.out.println("Your string: " + string1);
        //// // boolean -> logikai változó -> true, false
        // boolean bool1 = true;

        //
        // System.out.println("Adja meg a korát: ");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // logikai kifejezések: >, <, ==, !=, <=, >=
        // && ||
        // true && true -> true
        // true && false -> false
        // false && false -> false

        // true || true -> true
        // true || false -> true
        // false || false -> false

        // int age = 15;
        // if(age >= 18) {
        // System.out.println("te nagy gyerek vagy!");
        // } else {
        // System.out.println("te még nem vagy nagy gyerek!");
        // }
        ////
        // if (age >= 70) {
        // System.out.println("Te öreg vagy!");
        // } else if (age >= 40) {
        // System.out.println("Te középkorú vagy!");
        // } else if (age >= 18) {
        // System.out.println("Te nagykorú vagy");
        // } else
        // System.out.println("Te kiskorú vagy");

        // bekérjük az első számot
        // System.out.println("Adja meg az első számot: ");
        // Scanner sc = new Scanner(System.in);
        // double number1 = sc.nextDouble();
        //
        // // bekérjük az első karaktert
        // System.out.println("Adja meg az operátort(+, -, *, /): ");
        // sc = new Scanner(System.in);
        // char operator = sc.nextLine().charAt(0);
        //
        // // bekérjük a második számot
        // System.out.println("Adja meg az második számot: ");
        // sc = new Scanner(System.in);
        // double number2 = sc.nextDouble();
        //
        // // a karaktertől függően kiírjuk az eredményt
        // double result;
        // if(operator == '+') {
        // result = number1 + number2;
        // } else if(operator == '-') {
        // result = number1 - number2;
        // } else if(operator == '*') {
        // result = number1 * number2;
        // } else if(operator == '/') {
        // result = number1 / number2;
        // } else {
        // System.out.println("You added wrong operator!");
        // return;
        // }
        // System.out.println("The result is: " + result);
        //

        // // tömbök
        // int array1[] = new int[10];
        //
        // int array2[] = {10,223,32313,412321};
        //// System.out.println("1st element: " + array2[0]);
        //// System.out.println("2nd element: " + array2[1]); // 1->index 2. elemre fog
        // utalni
        //// System.out.println("3rd element: " + array2[2]);
        //// System.out.println("4th element: " + array2[3]);
        // for (int i=0; i<4; i++) {
        // System.out.println("Element" + (i+1) + ": " + array2[i]);
        // }

        // for, while, do-while
        // for -> meghatározott db-szor fog lefutni
        // while -> egy feltételtől függően fog újra meg újra lefutni
        // do-while -> 1x mindenképp lefut, utána úgy fut mint a while
        //
        // int secretNumber = 25;
        // int userNumber = 0;
        //
        // while (secretNumber != userNumber) {
        // System.out.println("Adjon meg egy számot: ");
        // Scanner sc = new Scanner(System.in);
        // userNumber = sc.nextInt();
        // if(userNumber > secretNumber) {
        // System.out.println("nagyobb számot adtál meg!");
        // } else if(userNumber < secretNumber) {
        // System.out.println("kisebb számot adtál meg!");
        // }
        // }

        // double a = 2, b = -3, c = -4;
        // double x1, x2;
        //
        // // meghatározzuk a diszkriminánst
        // double d = b*b - 4*a*c;
        //
        // // a disztkrimináns alapján kiszámoljuk az x1 és x2t
        // if(d < 0) {
        // System.out.println(" ennek nincs megoldása");
        // } else if(d == 0) {
        // x1 = b / (2*a);
        // System.out.println("Az x1 és x2 értéke megegyezik: " + x1);
        // } else if(d > 0) {
        // // 2 megoldás lesz
        // x1 = (-b + Math.sqrt(d))/ (2*a);
        // x2 = (-b - Math.sqrt(d))/ (2*a);
        // System.out.println("x1: " + x1 + ", x2: " + x2);
        // }

        // double a = 14, b = 43, c = 20;
        // if(a+b>c && b+c>a && a+c>b) {
        // System.out.println("ez szerkeszthető");
        // } else {
        // System.out.println("ez nem szerkeszthető");
        // }

        // double r = 5, d = 10;
        // double tk = Math.PI * r * r;
        // double kk = Math.PI * 2 * r;
        // double A = kk * d;
        // double V = tk * d;
        // System.out.println("Felület: " + A);
        // System.out.println("Térfogat: " + V);

        // Scanner sc = new Scanner(System.in);
        // int titkos = 50;
        // int userNumber = 0;
        // while (titkos != userNumber) {
        // System.out.println("adjon meg egy új számot: ");
        // userNumber = sc.nextInt();
        // if(userNumber > titkos) {
        // System.out.println("túl nagy számot adott meg");
        // } else if(userNumber < titkos){
        // System.out.println("túl kicsi számot adott meg");
        // }
        // }
        // System.out.println("elataláltad!");

        // 0, 1
        int actualPlayerNumber = 0;

        char[][] table = initTable();

        char[] symbols = { 'X', 'O' };
        while (true) {
            printTable(table);

            int[] coordinates = getUserInput(actualPlayerNumber, table);
            int x = coordinates[0];
            int y = coordinates[1];
            table[y][x] = symbols[actualPlayerNumber];

            boolean won = checkIfLastPlayerWon(table);
            if (won) {
                System.out.println("Player " + (actualPlayerNumber + 1) + " won!");
                break;
            }

            actualPlayerNumber = changeTurn(actualPlayerNumber);
        }
    }

    public static int[] getUserInput(int actualPlayerNumber, char[][] table) {
        System.out.println("Player " + (actualPlayerNumber + 1) + " turn.");
        boolean badInput;
        int[] coordinates = new int[2];
        DO_WHILE: do {
            badInput = false;
            System.out.println("Please add input(A3): ");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine().toUpperCase();
            if(userInput.length() != 2) {
                System.out.println("You added wrong input!");
                badInput = true;
                continue;
            }
            char abc = userInput.charAt(0);
            coordinates[0] = (int) abc - 65;
            coordinates[1] = Character.getNumericValue(userInput.charAt(1)) - 1;
            for (int i = 0; i < coordinates.length; i++) {
                if(coordinates[i] < 0 || coordinates[i] > 2) {
                    System.out.println("You added bad input!");
                    badInput = true;
                    continue DO_WHILE;
                } 
            }
            int x = coordinates[0];
            int y = coordinates[1];
            if(table[y][x] != '.') {
                System.out.println("This location is already taken!");
                badInput = true;
                continue;
            }
        } while (badInput);

        return coordinates;
    }

    public static int changeTurn(int playerNumber) {
        if (playerNumber == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static char[][] initTable() {
        char[][] table = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = '.';
            }
        }
        return table;
    }

    public static void printTable(char[][] table) {
        System.out.println("  A B C");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkIfLastPlayerWon(char[][] table) {
        boolean hasWon = false;
        for (int i = 0; i < table.length; i++) {
            if (table[i][0] == table[i][1] && table[i][1] == table[i][2] && table[i][0] != '.') {
                hasWon = true;
            }
        }

        for (int i = 0; i < table[0].length; i++) {
            if (table[0][i] == table[1][i] && table[1][i] == table[2][i] && table[0][i] != '.') {
                hasWon = true;
            }
        }

        if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != '.') {
            hasWon = true;
        }

        if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != '.') {
            hasWon = true;
        }
        return hasWon;
    }
}
