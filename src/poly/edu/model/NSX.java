/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author Administrator
 */
public class NSX {
private String idNXS; 
private String maNXS;
private String tenNXS;

    public NSX() {
    }

    public NSX(String idNXS, String maNXS, String tenNXS) {
        this.idNXS = idNXS;
        this.maNXS = maNXS;
        this.tenNXS = tenNXS;
    }

    public String getIdNXS() {
        return idNXS;
    }

    public void setIdNXS(String idNXS) {
        this.idNXS = idNXS;
    }

    public String getMaNXS() {
        return maNXS;
    }

    public void setMaNXS(String maNXS) {
        this.maNXS = maNXS;
    }

    public String getTenNXS() {
        return tenNXS;
    }

    public void setTenNXS(String tenNXS) {
        this.tenNXS = tenNXS;
    }


}
