
package Modul1_202357201044;

import java.util.Arrays;
import javax.swing.*;


public class Nilai_BaruArray {

    public static void main(String[] args) {

        int[][] data = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};

        JOptionPane.showInternalConfirmDialog(null, Arrays.deepToString(data));

        String input = JOptionPane.showInputDialog("Masukkan Baris : ");
        int bariss = Integer.parseInt(input);
        int baris = bariss - 1;

        input = JOptionPane.showInputDialog("Masukkan Kolom : ");
        int kolomm = Integer.parseInt(input);
        int kolom = kolomm - 1;

        input = JOptionPane.showInputDialog("Masukkan Nilai baru : ");
        int nilaibaru = Integer.parseInt(input);

        if (baris >= 0 && baris < data.length && kolom >= 0 && kolom < data[0].length) {
            data[baris][kolom] = nilaibaru;
            JOptionPane.showInternalMessageDialog(null, "Nilai Pada Index " + " ( " + baris + " , " + kolom + " ) " + " diubah Menjadi " + nilaibaru);
            JOptionPane.showInternalConfirmDialog(null, Arrays.deepToString(data));
        } else {
            JOptionPane.showInternalMessageDialog(null, "Index Tidak tersedia");
        }

    }

}
