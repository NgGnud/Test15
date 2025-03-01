package org.example.test15;

public class KhachHang {
    private String maKhachHang;
    private String ten;
    private  Integer tuoi;
    private  float diemTB;
    private  Integer kiHoc;
    private  String chuyenNganh;

    public KhachHang(String maKhachHang, String ten, Integer tuoi, float diemTB, Integer kiHoc, String chuyenNganh) {
        setMaKhachHang(maKhachHang);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTB(diemTB);
        setKiHoc(kiHoc);
        setChuyenNganh(chuyenNganh);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        if (maKhachHang == null || maKhachHang.isEmpty()) {
            throw new IllegalArgumentException("maKhachHang is null");
        }
        this.maKhachHang = maKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Integer getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(Integer kiHoc) {
        this.kiHoc = kiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
