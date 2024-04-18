/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author PC
 */
public class KhachHang {

    protected int maKhachHang;
    protected String tenChuHo;
    protected int chiSoMoi;
    protected int chiSoCu;
    protected float tienDien;
    protected static final float loai1 = 3.500f;
    protected static final float loai2 = 5.500f;
    protected static final float loai3 = 7.000f;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, String tenChuHo, int chiSoCu, int chiSoMoi) {
        this.maKhachHang = maKhachHang;
        this.tenChuHo = tenChuHo;
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.tienDien = 0;
    }

    public Object[] getThongTin() {
        Object[] thongTinKhachHang = {this.maKhachHang, this.tenChuHo, this.chiSoCu, this.chiSoMoi, this.tienDien};
        return thongTinKhachHang;
    }

    public float tinhTienDien() {
        return 0;
    }

    public KhachHang timKhachHangTheoMa(int ma) {
        return null;
    }
    
    public float getTienDien(){
        return this.tienDien;
    }

}
