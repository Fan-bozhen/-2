package com.nwnu.util;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import com.nwnu.user.Stu;
import com.nwnu.user.Teacher;

public class DBUtil {
	private static String url="jdbc:mysql://localhost:3306/db_num.sql";
	private static String user="root";
	private static String password = "root";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
    
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
		
	}
	
	public static void free(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e2) {
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void selectStuByIdAndTime() throws SQLException {
		String sql = "select * from tb_stu where sno=?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ��ѧ�ź�ѧ���ı����ύʱ�䣺");
		String sno1 = scanner.next();
		String time1 = scanner.next();
		ps.setString(1, sno1);
		ps.setString(2, time1);;
		List<Stu> res = new ArrayList<Stu>();

		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String sno = rs.getString("sno");
			String stuname = rs.getString("stuname");			
			String college = rs.getString("college");
			String stuclass = rs.getString("stuclass");
			String time = rs.getString("time");
			String isinwh = rs.getString("isinwh");
			String isinhb = rs.getString("isinhb");
			String islike = rs.getString("islike");
			String isconfirm = rs.getString("isconfirm");
			
			Stu stu = new Stu(id, sno, stuname, college, stuclass, time, isinwh, isinhb, islike, isconfirm);
			res.add(stu);
			System.out.println(stu);
			
		}
		System.out.println(res.size());		
		DBUtil.free(null, ps, conn);
	}
	
	public static void picture() throws SQLException {
		JFrame frame = new JFrame("�������ͳ�Ʊ�");
		frame.setLayout(new GridLayout(2, 2, 10, 10));
		frame.add(new picture().getChartPanel()); // �������ͼ
		frame.setBounds(0, 0, 900, 800);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("��ӭ����ѧ���������ϵͳ");
		String chose = null;
		while(chose != "3") {
			System.out.println("1������ѧ�ź����ڲ�ѯѧ���Ľ�����Ϣ");
			System.out.println("2������ѧ�ź����ڲ�ѯ��ʦ�Ľ�����Ϣ");
			System.out.println("3�����ɸ�Ⱦ�����״ͼ");	
			System.out.println("4���˳�ϵͳ");
			System.out.println("����������Ҫ�ķ����ţ�");
			Scanner scanner = new Scanner(System.in);
			chose = scanner.next();
			switch(chose) {
			case "1":
				selectStuByIdAndTime();
				break;
			case "2":
				selectTeaByIdAndTime();
				break;
			case "3":
				picture();
				break;
			case "5":
				insertStu();
			case "4":
				System.out.println("лл����ʹ��");
				System.exit(0);
				break;
			}
		}
	}

	private static void insertStu() {
		// TODO Auto-generated method stub
		
	}

	private static void selectTeaByIdAndTime() throws SQLException {
		String sql = "select * from tb_teacher where teno=? and time=?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ʦ�Ľ̹��ź���ʦ�ı����ύʱ�䣺");
		String teno1 = scanner.next();
		String time1 = scanner.next();
		ps.setString(1, teno1);
		ps.setString(2, time1);;
		List<Teacher> res = new ArrayList<Teacher>();

		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String teno = rs.getString("teno");
			String teaname = rs.getString("teaname");			
			String college = rs.getString("college");
			
			String time = rs.getString("time");
			String isinwh = rs.getString("isinwh");
			String isinhb = rs.getString("isinhb");
			String islike = rs.getString("islike");
			String isconfirm = rs.getString("isconfirm");
			
			Teacher teacher = new Teacher(id, teno, teaname, college, time, isinwh, isinhb, islike, isconfirm);
			res.add(teacher);
			System.out.println(teacher);
			
		}
			
		DBUtil.free(null, ps, conn);
		
	}
}
