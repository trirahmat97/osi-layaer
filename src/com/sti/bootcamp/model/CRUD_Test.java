package com.sti.bootcamp.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CRUD_Test {
	String notif = "";
	Customer2 data = new Customer2();
	
	DB_connection obj_DB_Connection = new DB_connection();
	Connection connection = (Connection) obj_DB_Connection.get_connection();
	
	public String create_data(Customer2 aa) {
			
		PreparedStatement ps=null;	
		try {
			String query = "insert into customer (norek,nama,alamat) values (?, ?, ?)";
			ps = (PreparedStatement) connection.prepareStatement(query);
			ps.setString(1, aa.getNorek());
			ps.setString(2, aa.getNama());
			ps.setString(3, aa.getAlamat());
			System.out.println(ps);
			ps.executeUpdate();
			
			notif = "behasil";
		}catch(Exception e) {
			notif = "gagal";
		}
		
		return notif;
	}
	
	public List<Customer2> select() {
		PreparedStatement ps=null;
		
		List<Customer2> list = new ArrayList<>();
		
		try {
			String query = "select * from customer";
			ps = (PreparedStatement) connection.prepareStatement(query);					
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer2 customer = new Customer2();
				
				customer.setNorek(rs.getString("norek"));
				customer.setNama(rs.getString("nama"));
				customer.setAlamat(rs.getString("alamat"));
				
				list.add(customer);
			}
		}catch(Exception e) {
		}
		return list;
		
	}
	
	public void delete_data(String norek) {
		//koneksi database
		DB_connection obj_DB_Connection = new DB_connection();
		Connection connection = (Connection) obj_DB_Connection.get_connection();
		
		PreparedStatement ps=null;	
		try {
			String query = "delete from customer where norek = ?";
			ps = (PreparedStatement) connection.prepareStatement(query);
			ps.setString(1, norek); 
			
			System.out.println(ps);
			ps.executeUpdate();
		}catch(Exception e) {
		}
	}
	
	
	public void update_data(String norek, String nama, String alamat) {
		//koneksi database
		DB_connection obj_DB_Connection = new DB_connection();
		Connection connection = (Connection) obj_DB_Connection.get_connection();
		
		PreparedStatement ps=null;	
		try {
			String query = "update customer set nama=?, alamat=? where norek=?";
			ps = (PreparedStatement) connection.prepareStatement(query);
			ps.setString(2, nama);
			ps.setString(3, alamat);
			ps.setString(1, norek); 
			
			System.out.println(ps);
			ps.executeUpdate();
		}catch(Exception e) {
		}
	}
	
	
	public void read_data(String norek) {
		//koneksi database
		DB_connection obj_DB_Connection = new DB_connection();
		Connection connection = (Connection) obj_DB_Connection.get_connection();
		
		PreparedStatement ps = null;	
		ResultSet rs=null;
		try {
			String query = "select * from customer where norek=?";
			ps = (PreparedStatement) connection.prepareStatement(query);
			ps.setString(1, norek);
			System.out.println(ps);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("norek  : "+ rs.getString("norek"));
				System.out.println("nama   : "+ rs.getString("nama"));
				System.out.println("alamat : "+ rs.getString("alamat"));
			}
		}catch(Exception e) {
		}
	}
	
	

}
