/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycard;

/**
 *
 * @author hoang
 */
public class info {
    private String sothe, hoten, ngaysinh, loaithe, pin, thoihan;
   private static byte[] rsaPubKey = new byte[256];
    private static byte[] avatar;
    public info(String sothe, String hoten, String ngaysinh, String loaithe, String thoihan,String pin,byte[] avatar) {
        this.sothe = sothe;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.loaithe = loaithe;
        this.pin = pin;
        this.thoihan = thoihan;
        this.avatar= avatar;
    }
    public info(){
        
    }

    public static byte[] getRsaPubKey() {
        return rsaPubKey;
    }

    public static void setRsaPubKey(byte[] rsaPubKey) {
        info.rsaPubKey = rsaPubKey;
    }

   

    public byte[] getAvatar() {
        return avatar;
    }

    public static void setAvatar(byte[] avatar) {
       info.avatar=avatar;
    }

    public String getSothe() {
        return sothe;
    }

    public void setSothe(String sothe) {
        this.sothe = sothe;
    }
    

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLoaithe() {
        return loaithe;
    }

    public void setLoaithe(String loaithe) {
        this.loaithe = loaithe;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getThoihan() {
        return thoihan;
    }

    public void setThoihan(String thoihan) {
        this.thoihan = thoihan;
    }
    
    
}
