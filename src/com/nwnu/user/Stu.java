package com.nwnu.user;

public class Stu {
	private Integer id;
	private String sno;      //ѧ��ѧ��
	private String stuname;  //ѧ������
	private String college;  //ѧ������ѧԺ
	private String stuclass; //ѧ���༶
	private String time;        //�ύʱ��
	private String isinwh;     //�Ƿ����人
	private String isinhb;     //�Ƿ��ں���
	private String islike;     //�Ƿ�����
	private String isconfirm;   //�Ƿ�ȷ��
	
	
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Stu(String sno, String stuname, String college, String stuclass, String time, String isInWh, String isInHb,
			String isLike, String isConfirm) {
		super();
		this.sno = sno;
		this.stuname = stuname;
		this.college = college;
		this.stuclass = stuclass;
		this.time = time;
		this.isinwh = isInWh;
		this.isinhb = isInHb;
		this.islike = isLike;
		this.isconfirm = isConfirm;
	}



	public Stu(Integer id, String sno, String stuname, String college, String stuclass, String time, String isInWh,
			String isInHb, String isLike, String isConfirm) {
		super();
		this.id = id;
		this.sno = sno;
		this.stuname = stuname;
		this.college = college;
		this.stuclass = stuclass;
		this.time = time;
		this.isinwh = isInWh;
		this.isinhb = isInHb;
		this.islike = isLike;
		this.isconfirm = isConfirm;
	}



	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIsInWh() {
		return isinwh;
	}
	public void setIsInWh(String isInWh) {
		this.isinwh = isInWh;
	}
	public String getIsInHb() {
		return isinhb;
	}
	public void setIsInHb(String isInHb) {
		this.isinhb = isInHb;
	}
	public String getIsLike() {
		return islike;
	}
	public void setIsLike(String isLike) {
		this.islike = isLike;
	}
	public String getIsConfirm() {
		return isconfirm;
	}
	public void setIsConfirm(String isConfirm) {
		this.isconfirm = isConfirm;
	}
	
	@Override
	public String toString() {
		return "Stu [id=" + id + ", sno=" + sno + ", stuname=" + stuname + ", college=" + college + ", stuclass="
				+ stuclass + ", time=" + time + ", isInWh=" + isinwh + ", isInHb=" + isinhb + ", isLike=" + islike
				+ ", isConfirm=" + isconfirm + "]";
	}
	
}
