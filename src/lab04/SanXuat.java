/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author PC
 */
public class SanXuat extends KinhDoanh {

    public SanXuat(int maKhachHang, String tenChuHo, int chiSoCu, int chiSoMoi, float heSoSuDung) {
        super(maKhachHang, tenChuHo, chiSoCu, chiSoMoi, heSoSuDung);
    }

    @Override
    public float tinhTienDien() {
        int a = this.chiSoMoi - this.chiSoCu;
        return this.tienDien = a * KhachHang.loai3 * this.heSoSuDung;
    }
}
