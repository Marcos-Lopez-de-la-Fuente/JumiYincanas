package ejerciciosprimerdia;

public class prueba {

    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {

        int x = 0;
        int y = 0;

        if (m1.length > m2.length) {
            x = m1.length;
        } else {
            x = m2.length;
        }

        if (m1[0].length > m2[0].length) {
            y = m1[0].length;
        } else {
            y = m2[0].length;
        }

        int[][] result = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int suma = 0;
                int z = 0;

                if (x > y) {
                    z = x;
                } else {
                    z = y;
                }

                for (int k = 0; k < z - 1; k++) {
                    suma = suma + (m1[i][k] * m2[k][j]);
                }

                result[i][j] = suma;
            }
        }

        return result;

    }





    public static void main(String[] args) {

        int[][] m1 = new int[3][2];
        m1[0][0] = 1;
        m1[0][1] = -1;
        m1[1][0] = 2;
        m1[1][1] = 3;
        m1[2][0] = 0;
        m1[2][1] = 4;

        int[][] m2 = new int[2][3];
        m2[0][0] = 4;
        m2[0][1] = -1;
        m2[0][2] = 2;
        m2[1][0] = 0;
        m2[1][1] = 5;
        m2[1][2] = 3;

        int[][] resultado = multiplicarMatrices(m1, m2);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.println(resultado[i][j]);
            }
        }

    }
}
