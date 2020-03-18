package com.nwnu.util;//������������������Լ������İ������Խ����޸�

import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.nwnu.user.Stu;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

public class picture {
	ChartPanel frame1;

	public picture() throws SQLException {
		CategoryDataset dataset = getDataSet();// ����õ����ݴ��ݸ�CategoryDataset��Ķ���
		JFreeChart chart = ChartFactory.createBarChart3D("ʮ���Ⱦ�����", // ͼ�����
				"��Ⱦ���", // Ŀ¼�����ʾ��ǩ
				"��Ⱦ����", // ��ֵ�����ʾ��ǩ
				dataset, // ���ݼ�
				PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
				true, // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
				false, // �Ƿ����ɹ���
				false // �Ƿ�����URL����
		);

		CategoryPlot plot = chart.getCategoryPlot();// ��ȡͼ���������
		CategoryAxis domainAxis = plot.getDomainAxis(); // ˮƽ�ײ��б�
		domainAxis.setLabelFont(new Font("����", Font.BOLD, 14)); // ˮƽ�ײ�����
		domainAxis.setTickLabelFont(new Font("����", Font.BOLD, 12)); // ��ֱ����
		ValueAxis rangeAxis = plot.getRangeAxis();// ��ȡ��״
		rangeAxis.setLabelFont(new Font("����", Font.BOLD, 15));
		chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
		chart.getTitle().setFont(new Font("����", Font.BOLD, 20));// ���ñ�������

		frame1 = new ChartPanel(chart, true); // ����Ҳ������chartFrame,����ֱ������һ��������Frame

	}

	private static CategoryDataset getDataSet() throws SQLException {
		
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String sql = "select * from tb_stu where islike = 'yes'";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			
			count++;
		}
		
		String sql2 = "select * from tb_stu where isconfirm ='yes'";
		Connection conn2 = DBUtil.getConnection();
		PreparedStatement ps2 = conn2.prepareStatement(sql2);
		ResultSet rs2 = ps2.executeQuery();
		//System.out.println("hello");
		while(rs2.next()) {
			count2++;
			
		}
		
		String sql3 = "select * from tb_teacher where islike = 'yes'";
		Connection conn3 = DBUtil.getConnection();
		PreparedStatement ps3 = conn3.prepareStatement(sql3);
		ResultSet rs3 = ps3.executeQuery();
		while(rs3.next()) {
			count3++;
		}
		
		String sql4 = "select * from tb_teacher where isconfirm = 'yes'";
		Connection conn4 = DBUtil.getConnection();
		PreparedStatement ps4 = conn4.prepareStatement(sql4);
		ResultSet rs4 = ps4.executeQuery();
		while(rs4.next()) {
			count4++;
		}
		dataset.addValue(count, "ѧ�����Ƹ�Ⱦ����", "ѧ�����Ƹ�Ⱦ����");
		dataset.addValue(count2, "ѧ��ȷ������", "ѧ��ȷ������");
		dataset.addValue(count3, "��ʦ���Ƹ�Ⱦ����", "��ʦ���Ƹ�Ⱦ����");
		dataset.addValue(count4, "��ʦȷ������", "��ʦȷ������");
		/*dataset.addValue(100, "��ѧ", "��ѧ");// �ɼ�1
		dataset.addValue(95, "Java", "Java");// �ɼ�2
		dataset.addValue(80, "Ӣ��", "Ӣ��");// �ɼ�3
		dataset.addValue(93, "����", "����");// �ɼ�4*/
		return dataset;
	}

	public ChartPanel getChartPanel() {
		return frame1;

	}

	public static void main(String args[]) throws SQLException {
		JFrame frame = new JFrame("�����Ⱦ���ͳ�Ʊ�");
		frame.setLayout(new GridLayout(2, 2, 10, 10));
		frame.add(new picture().getChartPanel()); // �������ͼ
		frame.setBounds(0, 0, 900, 800);
		frame.setVisible(true);
	}
}
