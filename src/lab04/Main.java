/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phuong a = new Phuong();
//        Object[][] data = a.getData();
//        for (int i = 0; i <= 6; i++) {
//            for (int j = 0; j <= 3; j++) {
//                System.out.println(data[i][j]);
//            }
//        }
        Object [][]nhanVienTimTheoMa=a.timKhachHangTheoMa(123);
        for(int i=0;i<=4;i++)
            System.out.println(nhanVienTimTheoMa[0][i]);
    }

}
