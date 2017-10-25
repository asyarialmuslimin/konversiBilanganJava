package ga.ridhoapps;

import javax.swing.JOptionPane;

public class Main {

    public static void tampil(int dec){

        String bin = Integer.toBinaryString(dec);
        String hex = Integer.toHexString(dec);
        String oct = Integer.toOctalString(dec);

        JOptionPane.showMessageDialog(null, "Bilangan Desimal : " + dec +"\n" +
                "Bilangan Biner : " + bin + "\n" +
                "Bilangan Hexadesimal : " + hex + "\n" +
                "Bilangan Octal : " + oct);
    }

    public static void main(String[] args) {

        boolean quit = false;

        do{

            try {

                int dec;
                String a;

                String pilihan = JOptionPane.showInputDialog("Pilih Jenis bilangan yang akan anda konversikan \n" +
                        "1. Desimal \n" +
                        "2. Biner \n" +
                        "3. Hexadesimal \n" +
                        "4. Octal \n");
                switch (pilihan){
                    case "1":
                        a = JOptionPane.showInputDialog("Masukkan nilai Desimal");
                        dec = Integer.parseInt(a);
                        tampil(dec);
                        break;
                    case "2":
                        a = JOptionPane.showInputDialog("Masukkan nilai Biner");
                        dec = Integer.parseInt(a,2);
                        tampil(dec);
                        break;
                    case "3":
                        a = JOptionPane.showInputDialog("Masukkan nilai Hexadesimal");
                        dec = Integer.parseInt(a, 16);
                        tampil(dec);
                        break;
                    case "4":
                        a = JOptionPane.showInputDialog("Masukkan nilai Octal : ");
                        dec = Integer.parseInt(a, 8);
                        tampil(dec);
                        break;
                    default:
                        quit = true;
                        break;

                }

            } catch (Exception e){
                quit = true;
            }


        } while (quit == false);

    }
}
