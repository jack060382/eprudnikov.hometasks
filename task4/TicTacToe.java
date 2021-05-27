package task4;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Уйти от проверок в лоб, переделать на циклы
 * 2. Увеличить поле до 5
 * 3. добавить ИИ
 */

public class TicTacToe {

    private static char CELL_EMPTY = '-';


    public static void start() {
        char[][] field = {
                {CELL_EMPTY,CELL_EMPTY,CELL_EMPTY,},
                {CELL_EMPTY,CELL_EMPTY,CELL_EMPTY,},
                {CELL_EMPTY,CELL_EMPTY,CELL_EMPTY,}
        };

        drawField(field);

        do {
            doMove(field);
            drawField(field);
            if (isWin(field,'X')) {
                System.out.println("Congratulation!!! You are winner!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!!");
                break;
            }

            doBot(field);
            drawField(field);
            if (isWin(field,'0')) {
                System.out.println("Sorry!!! You are winner!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!!");
                break;
            }

        } while (true);
    }

    private static boolean isDraw(char[][] field) {
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if (isEmptyCell(field, v, h)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWin(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }
        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }
        return false;
    }

    private static void drawField(char[][] field) {
        for (int i=0; i < field.length; i++) {
            for (int j=0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void doBot(char[][] field) {
        Random random = new Random();

        int v,h;

        do {
            v = random.nextInt(3);
            h = random.nextInt(3);
        } while (isNotEmptyCell (field, v, h));

        field[v][h] = '0';
    }

    static void doMove(char[][] field) {
        int v, h;
        do {
            v = getCoordinate(field, 'V');
            h = getCoordinate(field, 'H');
        } while (isNotEmptyCell (field, v, h));

        field[v][h] = 'X';
    }

    private static boolean isEmptyCell(char[][] field, int v, int h) {
        return field[v][h] == CELL_EMPTY;
    }

    private static boolean isNotEmptyCell(char[][] field, int v, int h) {
        return !isEmptyCell(field, v, h);
    }

    private static int getCoordinate(char[][] field, char coord_name) {
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Enter %s-coordinate [1..%s]%n",coord_name, field.length);
            coord = scanner.nextInt() - 1;
        } while (coord >= field.length || coord < 0);
        return coord;
    }

}
