package org.example.test15;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {
    private List<KhachHang> khachHangs  = new ArrayList<>();
    public  boolean addKhachHang(KhachHang khachHang) {
       if (khachHang == null) {
           throw new IllegalArgumentException("khachHang is null");
       }
       for (KhachHang kh : khachHangs) {
           if (kh.getMaKhachHang().equals(khachHang.getMaKhachHang())) {
               throw new IllegalArgumentException("khachHang already exist");
           }
       }
       return khachHangs.add(khachHang);
    }

    public boolean updateKhachHang(KhachHang khachHang) {
        if (khachHang == null) {
            throw new IllegalArgumentException("khachHang is null");
        }
        for (int i = 0; i < khachHangs.size(); i++) {
            if (khachHangs.get(i).getMaKhachHang().equals(khachHang.getMaKhachHang())) {
                khachHangs.set(i, khachHang);
                return true;
            }
        }
        throw new IllegalArgumentException("khachHang does not exist");
    }

    public boolean deleteKhachHang(String maKhachHang) {
        if (maKhachHang == null) {
            throw new IllegalArgumentException("maKhachHang is null");
        }
        return khachHangs.removeIf(kh -> kh.getMaKhachHang().equals(maKhachHang));
    }
}
