/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author PC
 */
public class GiaDinh extends KhachHang {

    public GiaDinh(int maKhachHang, String tenChuHo, int chiSoCu, int chiSoMoi) {
        super(maKhachHang, tenChuHo, chiSoCu, chiSoMoi);
    }

    @Override
    public float tinhTienDien() {
        int a = this.chiSoMoi - this.chiSoCu;
        if (a > 100) {
            this.tienDien = KhachHang.loai2 * a;
        } else {
            this.tienDien = KhachHang.loai1 * a;
        }
        return this.tienDien;
    }

    @Override
    public KhachHang timKhachHangTheoMa(int ma) {
        if (this.maKhachHang == ma) {
            return this;
        }
        return null;
    }

}
