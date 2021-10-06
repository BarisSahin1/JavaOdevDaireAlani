package JavaOdev;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double yaricap,alan,merkezaci;

        System.out.println("Lutfen hesaplamak istediginiz Daire alanin merkez acisi ve yaricapini giriniz .");

        merkezaci = scanner.nextDouble();
        yaricap = scanner.nextDouble();

        alan = (3.14 * (yaricap*yaricap)*merkezaci)/360;

        System.out.println("Hesaplamak istediginiz alan : " + alan);
    }
}
