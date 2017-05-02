package com.example.user.univer;

public class MarkData {

	int _id;
	String _name;
	String _mark;

	public MarkData(){
	}

	public MarkData(String _name, String _mark){
		this._name = _name;
		this._mark = _mark;
	}

	public int getMarkID(){
		return this._id;
	}
	public void setMarkID(int id){
		this._id = id;
	}



	public String getMarkName(){
		return this._name;
	}
	public void setMarkName(String _name){
		this._name = _name;
	}

	public String getMark(){
		return this._mark;
	}
	public void setMark(String _mark){
		this._mark = _mark;
	}


}
