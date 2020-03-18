package com.nwnu.user;

public class Teacher {
	private Integer id;
	private String teno;      //��ʦ��ְ����
	private String teaname;  //��ʦ����
	private String college;  //��ʦ����ѧԺ
	
	private String time;        //�ύʱ��
	private String isinwh;     //�Ƿ����人
	private String isinhb;     //�Ƿ��ں���
	private String islike;     //�Ƿ�����
	private String isconfirm;   //�Ƿ�ȷ��
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Teacher(String teno, String teaname, String college, String time, String isinwh,
			String isinhb, String islike, String isconfirm) {
		super();
		this.teno = teno;
		this.teaname = teaname;
		this.college = college;
		
		this.time = time;
		this.isinwh = isinwh;
		this.isinhb = isinhb;
		this.islike = islike;
		this.isconfirm = isconfirm;
	}



	public Teacher(Integer id, String teno, String teaname, String college, String time, String isinwh,
			String isinhb, String islike, String isconfirm) {
		super();
		this.id = id;
		this.teno = teno;
		this.teaname = teaname;
		this.college = college;
		
		this.time = time;
		this.isinwh = isinwh;
		this.isinhb = isinhb;
		this.islike = islike;
		this.isconfirm = isconfirm;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeno() {
		return teno;
	}
	public void setTeno(String teno) {
		this.teno = teno;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIsinwh() {
		return isinwh;
	}
	public void setIsinwh(String isinwh) {
		this.isinwh = isinwh;
	}
	public String getIsinhb() {
		return isinhb;
	}
	public void setIsinhb(String isinhb) {
		this.isinhb = isinhb;
	}
	public String getIslike() {
		return islike;
	}
	public void setIslike(String islike) {
		this.islike = islike;
	}
	public String getIsconfirm() {
		return isconfirm;
	}
	public void setIsconfirm(String isconfirm) {
		this.isconfirm = isconfirm;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teno=" + teno + ", teaname=" + teaname + ", college=" + college + ", time=" + time + ", isinwh=" + isinwh + ", isinhb=" + isinhb + ", islike=" + islike
				+ ", isconfirm=" + isconfirm + "]";
	}
	
	
	
}
