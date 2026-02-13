package com.sist.web.dto;
/*
 * 	private int contentid;
	
	private int no;
	private String title;
	private String image1;
	private String image2;
	private double x;
	private double y;
	private String address;
	private int contenttype;
	private int hit;
	
	private int no,contentid;
	private String infocenter,restdate,usetime,parking,msg;
 */
public interface CommonsDetailDTO {
	int getContentid();
	String getTitle();
	String getImage1();
	String getAddress();
	double getX();
	double getY();
	int getContenttype();
	int getHit();
	

	
}
