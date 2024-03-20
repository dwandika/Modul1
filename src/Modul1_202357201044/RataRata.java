package Modul1_202357201044;

public class RataRata {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int JumlahData = 0;
        double JumlahElment = 0;

        System.out.println("Deret Angka :");
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
                JumlahData += data[a][b];
                JumlahElment++;
            }
            System.out.println();
        }

        double rataRATA = JumlahData / JumlahElment;
        System.out.println("Total Dari Array data \t\t: " + JumlahData);
        System.out.println("Jumlah Dari Elment Array data \t: " + JumlahElment);
        System.out.println("Rata-rata Dari Array Data \t: " + rataRATA);

    }
}
