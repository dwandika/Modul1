
package Modul1_202357201044;


public class KolomGanjil {
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int JumlahData = 0;
        
        
        System.out.println("Kolom Ganjil : ");
        for (int a = 0; a < data.length; a++) {
            if(a % 2 == 0){
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
                JumlahData += data[a][b];
                
            }
            System.out.println();
        }
    }
        System.out.println("Total Elment pada kolom gajil = "+JumlahData);
    }  
}
