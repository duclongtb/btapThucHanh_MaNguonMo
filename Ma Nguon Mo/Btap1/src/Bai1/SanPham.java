package Bai1;
import Bai1.LoaiSP;

public class SanPham extends LoaiSP{
	private String MaSP;
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	private String TenSP;
	private String NhaSX;
	
	public SanPham(String maLoaiSP,String tenloaisp, String maSP2, String tensp, String nhasx) {
		super(maLoaiSP,tenloaisp);
		setMaSP(maSP2);
		setTenSP(tensp);
		setNhaSX(nhasx);
	}
	

	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public String getNhaSX() {
		return NhaSX;
	}
	public void setNhaSX(String nhaSX) {
		NhaSX = nhaSX;
	}
}
