package org.example.test15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceTest {
    private KhachHangService khachHangService = new KhachHangService();
    @BeforeEach
    void setUp() {
        khachHangService = new KhachHangService();
    }

    @Test
    void addKhachHang() {
        KhachHang khachHang = new KhachHang("hh01","dungdz",19,9,5,"IT");
        assertTrue(khachHangService.addKhachHang(khachHang));
    }
    @Test
    void addkhachHangnull(){
        assertThrows(IllegalArgumentException.class, ()->{khachHangService.addKhachHang(null);});
    }
    @Test
    void addkhachHang3(){
        assertThrows(IllegalArgumentException.class, ()->{khachHangService.addKhachHang(new KhachHang("","dungdz",19,9,5,"IT"));});
    }

    @Test
    void updateKhachHang(){
        KhachHang khachHang = new KhachHang("hh01","dungdz",19,9,5,"IT");
        khachHangService.addKhachHang(khachHang);
        KhachHang khachHang1 = new KhachHang("hh01","dungdz22",19,9,5,"IT");
        assertTrue(khachHangService.updateKhachHang(khachHang1));
    }

    @Test
    void khachHangnull(){
        assertThrows(IllegalArgumentException.class, ()->{khachHangService.addKhachHang(null);});
    }

    @Test
    void khachHang3(){
        KhachHang khachHang = new KhachHang("hh01","dungdz",19,9,5,"IT");
        khachHangService.addKhachHang(khachHang);
        KhachHang kh = new KhachHang("hh","dungdz",19,9,5,"IT");
        assertThrows(IllegalArgumentException.class, ()->{khachHangService.updateKhachHang(kh);});
    }
    @Test
    void deleteKhachHang(){
        KhachHang khachHang = new KhachHang("hh01","dungdz",19,9,5,"IT");
        khachHangService.addKhachHang(khachHang);
        assertTrue(khachHangService.deleteKhachHang("hh01"));
    }
    @Test
    void deletekhachHang3(){
        assertThrows(IllegalArgumentException.class, ()->{khachHangService.deleteKhachHang(null);});
    }
    @Test
    void KhachHang4(){
        assertFalse(khachHangService.deleteKhachHang("tgdcgg2"));
    }
}