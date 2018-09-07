
import java.util.Random;

public class ColoresPrincipal {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Pixel casilla[][] = new Pixel[1024][600];
        for (int i = 0; i < 1024; i++) {
            for (int j = 0; j < 600; j++) {
                casilla[i][j] = new Pixel();
                casilla[i][j].colocarColor(aleatorio.nextInt(255), aleatorio.nextInt(255), aleatorio.nextInt(255));

            }

        }
        for (int i = 0; i < 1024; i++) {
            for (int j = 0; j < 600; j++) {

                casilla[i][j].desaturar();

            }
        }

    }

}
