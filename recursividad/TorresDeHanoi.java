package recursividad;

public class TorresDeHanoi {

    static void torreHanoi(int n, char from_rod, char to_rod, char helper_rod) {
        if (n == 1) {
            System.out.println("1: Take disk 1 from rod " + from_rod + " to rod " + to_rod);
        } else {
            torreHanoi(n - 1, from_rod, helper_rod, to_rod);
            System.out.println("2: Take disk " + n + " from rod " + from_rod + " to rod " + to_rod);
            torreHanoi(n - 1, helper_rod, to_rod, from_rod);
        }
    }


    public static void main(String args[]) {
        int n = 3;
        torreHanoi(n, 'A', 'C', 'B');
        // torre(3, 'A', 'B', 'C');
    }
}
