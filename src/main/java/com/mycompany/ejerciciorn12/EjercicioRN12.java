package com.mycompany.ejerciciorn12;
import java.util.Scanner;
public class EjercicioRN12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String NOM = scanner.nextLine();
        System.out.print("Ingrese el número de horas trabajadas: ");
        int NHT = scanner.nextInt();
        System.out.print("Ingrese el valor por hora de trabajo: ");
        double VHN = scanner.nextDouble();

        double SALARIO;

        if (NHT > 40) {
            int HET = NHT - 40;
            if (HET > 8) {
                int HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }

        System.out.println("EL TRABAJADOR " + NOM + " DEVENGO: $" + SALARIO);

        scanner.close();
    }
}
