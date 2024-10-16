import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void exibeMatriz(char[][] mat) {
        for (char[] chars : mat) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public static void embaralhaMatriz(char[][] mat) {
        Vector<Integer> adjacentes = new Vector<>();
        Random gerador = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == ' ') {
                    if (i != 0) {
                        adjacentes.add((int) mat[i - 1][j]);
                    }
                    if (i != 2) {
                        adjacentes.add((int) mat[i + 1][j]);
                    }
                    if (j != 0) {
                        adjacentes.add((int) mat[i][j - 1]);
                    }
                    if (j != 2) {
                        adjacentes.add((int) mat[i][j + 1]);
                    }
                    int escolhido = gerador.nextInt(adjacentes.size());

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao Quebra-Cuca!");
        char[][] matriz = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        exibeMatriz(matriz);

        System.out.println("""
                1 - 20 embaralhamentos
                2 - 40 embaralhamentos
                3 - 60 embaralhamentos
                """);
        System.out.println("Escolha a dificuldade do jogo: ");
        int dificuldade = entrada.nextInt();

        for (int i = 0; i < dificuldade; i++) {
            embaralhaMatriz(matriz);
        }

    }
}