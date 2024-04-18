/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author PC
 */
public class KinhDoanh extends GiaDinh {

    protected float heSoSuDung;

    public KinhDoanh(int maKhachHang, String tenChuHo, int chiSoCu, int chiSoMoi, float heSoSuDung) {
        super(maKhachHang, tenChuHo, chiSoCu, chiSoMoi);
        this.heSoSuDung = heSoSuDung;
    }

    @Override
    public float tinhTienDien() {
        int a = this.chiSoMoi - this.chiSoCu;
        if (a > 500) {
            this.tienDien = KhachHang.loai3 * a * this.heSoSuDung;
        } else {
            this.tienDien = KhachHang.loai2 * a * this.heSoSuDung;
        }
        return this.tienDien;
    }

}
