/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Phuong {

    private ArrayList<KhachHang> danhSachKhachHang;

    public Phuong() {
        danhSachKhachHang = new ArrayList<>();
    }

    public void nhap() {
        danhSachKhachHang.add(new KinhDoanh(123, "A", 120, 960, 1.8f));
        danhSachKhachHang.add(new GiaDinh(124, "B", 400, 450));
        this.danhSachKhachHang.add(new KinhDoanh(125, "C", 300, 689, 1.3f));
        this.danhSachKhachHang.add(new SanXuat(126, "D", 150, 965, 1.5f));
        this.danhSachKhachHang.add(new GiaDinh(127, "E", 500, 999));
        this.danhSachKhachHang.add(new SanXuat(128, "F", 350, 987, 1.6f));
        this.danhSachKhachHang.add(new SanXuat(129, "G", 100, 989, 1.9f));
    }

    public Object[][] getData() {
        this.nhap();
        Object[][] data = new Object[this.danhSachKhachHang.size()][5];
        for (int i = 0; i <= this.danhSachKhachHang.size() - 1; i++) {
            for (int j = 0; j <= 4; j++) {
                data[i][j] = this.danhSachKhachHang.get(i).getThongTin()[j];
            }
        }

        return data;
    }

    public Object[][] tinhTienDien() {
        Object[][] tienDien = this.getData();
        for (int i = 0; i <= this.danhSachKhachHang.size() - 1; i++) {
            tienDien[i][4] = this.danhSachKhachHang.get(i).tinhTienDien();
        }
        return tienDien;
    }

    public Object[][] timKhachHangTheoMa(int ma) {
        this.nhap();
        Object[][] khachHangTheoMa = new Object[1][5];
        KhachHang khTheoMa = new KhachHang();
        for (KhachHang khachHang : this.danhSachKhachHang) {
            if (khachHang.timKhachHangTheoMa(ma) != null) {
                khTheoMa = khachHang.timKhachHangTheoMa(ma);
            } else {
                khachHangTheoMa[0][0] = "Khong tim thay khach hang theo ma";
            }
        }
        khTheoMa.tinhTienDien();
        for (int i = 0; i <= 4; i++) {
            khachHangTheoMa[0][i] = khTheoMa.getThongTin()[i];
        }
        return khachHangTheoMa;
    }

    public Object[][] tinhTienDienTrungBinh() {
        this.nhap();
        Object tienDienTrungBinh[][] = new Object[1][1];
        float tongTienDien = 0;
        for (KhachHang khachHang : this.danhSachKhachHang) {
            khachHang.tinhTienDien();
            tongTienDien += khachHang.getTienDien();
        }

        tienDienTrungBinh[0][0] = tongTienDien / this.danhSachKhachHang.size();

        return tienDienTrungBinh;
    }

    private float timTienDienLonNhat() {
        this.nhap();
        for (KhachHang khachHang : this.danhSachKhachHang) {
            khachHang.tinhTienDien();
        }
        float tienDienLonNhat = this.danhSachKhachHang.get(0).getTienDien();
        for (KhachHang khachHang : this.danhSachKhachHang) {
            if (khachHang.getTienDien() > tienDienLonNhat) {
                tienDienLonNhat = khachHang.getTienDien();
            }
        }
        return tienDienLonNhat;
    }

    private ArrayList timDSKHCoTienDienLonNhat() {
        float tienDienLonNhat = this.timTienDienLonNhat();
        ArrayList<KhachHang> danhSachKHCoTienDienLonNhat = new ArrayList();
        for (KhachHang khachHang : this.danhSachKhachHang) {
            if (khachHang.getTienDien() == tienDienLonNhat) {
                danhSachKHCoTienDienLonNhat.add(khachHang);
            }
        }
        return danhSachKHCoTienDienLonNhat;
    }

    public Object[][] timCacKHCoTienDienLonNhat() {
        ArrayList<KhachHang> danhSachKhachHangCoTienDienLonNhat = this.timDSKHCoTienDienLonNhat();
        Object[][] danhSachKhachHangCoTienDienLonNhatTrongObject = new Object[danhSachKhachHangCoTienDienLonNhat.size()][5];
        for (int i = 0; i <= danhSachKhachHangCoTienDienLonNhat.size() - 1; i++) {
            for (int j = 0; j <= 4; j++) {
                danhSachKhachHangCoTienDienLonNhatTrongObject[i][j] = danhSachKhachHangCoTienDienLonNhat.get(i).getThongTin()[j];
            }
        }

        return danhSachKhachHangCoTienDienLonNhatTrongObject;
    }

    private ArrayList timDanhSachHoSanXuat() {
        this.nhap();
        ArrayList<SanXuat> danhSachHoSanXuat = new ArrayList();
        for (KhachHang khachHang : this.danhSachKhachHang) {
            if (khachHang instanceof SanXuat) {
                danhSachHoSanXuat.add((SanXuat) khachHang);
            }
        }
        return danhSachHoSanXuat;
    }

    private float timTienDienNhoNhatCuaHoSanXuat(ArrayList<SanXuat> danhSachHoSanXuat) {
        for (KhachHang khachHang : this.danhSachKhachHang) {
            khachHang.tinhTienDien();
        }
        float tienDienNhoNhat = danhSachHoSanXuat.get(0).getTienDien();
        for (SanXuat sanXuat : danhSachHoSanXuat) {
            if (sanXuat.getTienDien() < tienDienNhoNhat) {
                tienDienNhoNhat = sanXuat.getTienDien();
            }
        }
        return tienDienNhoNhat;
    }

    private ArrayList timDanhSachHoSanXuatCoTienDienNhoNhat() {
        ArrayList<SanXuat> danhSachHoSanXuat = this.timDanhSachHoSanXuat();
        float tienDienNhoNhat = this.timTienDienNhoNhatCuaHoSanXuat(danhSachHoSanXuat);
        ArrayList<SanXuat> danhSachHoSanXuatCoTienDienNhoNhat = new ArrayList();
        for (SanXuat sanXuat : danhSachHoSanXuat) {
            if (sanXuat.getTienDien() == tienDienNhoNhat) {
                danhSachHoSanXuatCoTienDienNhoNhat.add(sanXuat);
            }
        }
        return danhSachHoSanXuatCoTienDienNhoNhat;
    }

    public Object[][] timDanhSachHoSanXuatCoTienDienNhoNhatTrongObject() {
        ArrayList<SanXuat> danhSachHoSanXuatCoTienDienNhoNhat = this.timDanhSachHoSanXuatCoTienDienNhoNhat();
        Object[][] danhSachHoSanXuatCoTienDienNhoNhatobject = new Object[danhSachHoSanXuatCoTienDienNhoNhat.size()][5];
        for (int i = 0; i <= danhSachHoSanXuatCoTienDienNhoNhat.size() - 1; i++) {
            for (int j = 0; j <= 4; j++) {
                danhSachHoSanXuatCoTienDienNhoNhatobject[i][j] = danhSachHoSanXuatCoTienDienNhoNhat.get(i).getThongTin()[j];
            }
        }
        return danhSachHoSanXuatCoTienDienNhoNhatobject;
    }

}
