package Modul1_202357201044;

public class NamaAlamatTelepon {

    public static void main(String[] args) {
        String data[][] = {
            {"ABDUL", "085646668991", "Kediri"},
            {"KUSNO","085646668992", "Trenggalek"},
            {"PONIRAN", "085646668999","Bojonegoro"}};

        System.out.println("NAMA\t\tTELEPON\t\t\tKOTA\n");
        for (String[] ke :data){
            System.out.print(ke[0]+"\t\t");
            System.out.print(ke[1]+"\t\t");
            System.out.print(ke[2]+"\t\t");
            System.out.println("");
        };
        
    }

}
