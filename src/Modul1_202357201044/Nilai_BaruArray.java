package Modul1_202357201044;

import java.util.Arrays;
import javax.swing.*;

public class Nilai_BaruArray {

    public static void main(String[] args) {

        int[][] data = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};

        JOptionPane.showInternalConfirmDialog(null, Arrays.deepToString(data));

        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Baris : "));

        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kolom : "));

       

        int nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai baru : "));

        if (baris >= 0 && baris < data.length && kolom >= 0 && kolom < data[0].length) {
            data[baris][kolom] = nilaibaru;
            JOptionPane.showInternalMessageDialog(null, "Nilai Pada Index " + " ( " + baris + " , " + kolom + " ) " + " diubah Menjadi " + nilaibaru);
            JOptionPane.showInternalConfirmDialog(null, Arrays.deepToString(data));
        } else {
            JOptionPane.showInternalMessageDialog(null, "Index" + "(" + baris + "," + kolom + ")" + " Tidak tersedia");
        }

    }

}
