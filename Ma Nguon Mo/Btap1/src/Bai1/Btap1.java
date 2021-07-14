package Bai1;

import Bai1.SanPham;
import java.sql.*;
import java.util.*;


public class Btap1 {
	private Connection con=null;
	public static List<SanPham> sanpham = new ArrayList<>();
	PreparedStatement statement = null;
	
	public Btap1() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=SanPham";
			con = DriverManager.getConnection(url,"sa","");
			
			String query = "select * from SP inner join LoaiSP on SP.MaLoaiSP = LoaiSP.MaLoaiSp";
			statement = con.prepareCall(query);
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				String MaLoaiSP = resultSet.getString("MaLoaiSP");
				String TenLoaiSp = resultSet.getString("TenLoaiSP");
				String MaSP = resultSet.getString("MaSP");
				String TenSP = resultSet.getString("TenSP");
				String NhaSX = resultSet.getString("NhaSanXuat");
				
				SanPham sp = new SanPham(MaLoaiSP,TenLoaiSp,MaSP,TenSP,NhaSX);
				sanpham.add(sp);
				
				}
			}catch(SQLException | ClassNotFoundException ex){
				System.out.print(ex);
			}finally {
	            if(statement != null) {
	                try {
	                    statement.close();
	                } catch (SQLException ex) {
	                	System.out.print(ex);
	                }
	            }
			}
	}
	public void out(List<SanPham> sanpham2) throws Exception{
		String query = "select * from SP inner join LoaiSP on SP.MaLoaiSP = LoaiSP.MaLoaiSp";
		statement = con.prepareCall(query);
		
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println(sanpham2);
		}
	}
	public void main(String[] args) throws Exception {
		out(sanpham);
	}
}
