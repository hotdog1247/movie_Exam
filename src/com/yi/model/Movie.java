package com.yi.model;

public class Movie {
	private int mNo;
	private String mName;
	private String mContent;
	private String mImg;
	private String mTime;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int mNo) {
		super();
		this.mNo = mNo;
	}

	public Movie(int mNo, String mName, String mTime) {
		this.mNo = mNo;
		this.mName = mName;
		this.mTime = mTime;
	}

	public Movie(int mNo, String mName, String mContent, String mImg, String mTime) {
		super();
		this.mNo = mNo;
		this.mName = mName;
		this.mContent = mContent;
		this.mImg = mImg;
		this.mTime = mTime;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public String getmImg() {
		return mImg;
	}

	public void setmImg(String mImg) {
		this.mImg = mImg;
	}

	public String getmTime() {
		return mTime;
	}

	public void setmTime(String mTime) {
		this.mTime = mTime;
	}

	@Override
	public String toString() {
		return "Movie [mNo=" + mNo + ", mName=" + mName + ", mContent=" + mContent + ", mImg=" + mImg + ", mTime="
				+ mTime + "]";
	}

}
