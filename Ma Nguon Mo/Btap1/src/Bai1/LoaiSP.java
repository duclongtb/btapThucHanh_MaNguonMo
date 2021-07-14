package Bai1;

public class LoaiSP {
	protected String MaLoaiSP;
	protected String TenLoaiSP;
	
	public LoaiSP(String MaSP, String TenLoaiSP) {
		setMaLoaiSP(MaSP);
		setTenLoaiSP(TenLoaiSP);
	}
	
	public String getMaLoaiSP() {
		return MaLoaiSP;
	}
	public void setMaLoaiSP(String maLoaiSP) {
		MaLoaiSP = maLoaiSP;
	}
	public String getTenLoaiSP() {
		return TenLoaiSP;
	}
	public void setTenLoaiSP(String tenLoaiSP) {
		TenLoaiSP = tenLoaiSP;
	}
}
