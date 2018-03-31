/**
 * Created by MalhotR1 on 02/07/2018.
 */

import org.omg.CORBA.MARSHAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckWays {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                boolean kingFound = false;
                int kx = 0;
                int ky = 0;
                char[][] board = new char[8][8];
                for (int i = 0; i < 8; i++) {
                    board[i] = br.readLine().trim().toCharArray();

                    for (int j = 0; j < board[i].length && !kingFound; j++) {
                        if (board[i][j] == 'k') {
                            kx = i;
                            ky = j;
                            kingFound = true;
                        }
                    }
                }

                boolean solFound = true;
                int pawnCount = 0;
                for (int i = 0; i < 8; i++) {
                    if (board[1][i] == 'P' && board[0][i] == '#') {
                        pawnCount++;
                        board[1][i] = '#';
                        board[0][i] = 'P';
                        int py = i;

                        if (kx == 0) { //Same row
                            if (ky < py) {
                                solFound = checkRow(board, ky, py);
                            } else {
                                solFound = checkRow(board, py, ky);
                            }

                            if (solFound)
                                System.out.println(2);

                        } else {
                            if (ky == py) { //Same Column
                                for (int j = 1; j < kx; j++) {
                                    if (board[j][ky] != '#') {
                                        solFound = false;
                                        break;
                                    }
                                }
                                if (solFound) System.out.println(2);

                            } else { //Check Slope
                                int slope = (int) Math.abs((ky - py) / kx);
                                if (slope == 1) {
                                    int next = 1;
                                    int tempkx = kx - 1;
                                    if (ky > py) next = -1;
                                    for (int j = ky + next; tempkx > 0; j += next) {
                                        if (board[tempkx--][j] != '#') {
                                            solFound = false;
                                            break;
                                        }
                                    }
                                    if (solFound) System.out.println(2);

                                } else { //Check knight
                                    int ydiff = (int) Math.abs(ky - py);
                                    if (ydiff == 2 && kx == 1) System.out.println(1);
                                    else if (kx == 2 && ydiff == 1) System.out.println(1);
                                    else solFound = false;
                                }
                            }
                        }
                        if (solFound) break;
                        board[0][i] = '#';
                        board[1][i] = 'p';
                    }
                }

                if (!solFound && pawnCount < 2 && kx == 1) {
                    for (int i = 0; i < 8; i++) {
                        if (board[1][i] == 'Q' || board[1][i] == 'R') {
                            System.out.println(1);
                            solFound = true;
                        }
                    }
                }


                for (int i = 0; i < 8 && !solFound; i++) {
                    if ((board[0][i] == 'B' || board[0][i] == 'Q') &&
                            ((i == 0 && board[1][i + 1] == 'p') ||
                                (i == 7 && board[1][i - 1] == 'p') ||
                                (i != 0 && i != 7 && (board[1][i + 1] == 'p' || board[1][i - 1] == 'p')))) {

                        int row = 2;
                        int c1 = i - 2;
                        int c2 = i + 2;
                        while (row < 8 && c1 >= 0) {
                            if (board[row][c1] == 'k') {
                                solFound = true;
                                System.out.println(1);
                                break;
                            }
                            row++;
                            c1--;
                        }

                        while (!solFound && row < 8 && c2 < 8) {
                            if (board[row][c1] == 'k') {
                                solFound = true;
                                System.out.println(1);
                                break;
                            }
                            row++;
                            c1++;
                        }
                    }
                }

                if (!solFound) {
                    System.out.println(0);
                }

            }
        }

    }

    private static boolean checkRow(char[][] board, int start, int end) {
        for (int j = start + 1; j < end; j++) {
            if (board[0][j] != '#') {
                return false;
            }
        }
        return true;
    }

}
