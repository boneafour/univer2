package com.example.user.univer;

public class MarkData {

	int _id;
	String _lecture;
	String _name;
	String _marks;

	public MarkData(){
	}

	public MarkData(String _lecture, String _name, String _marks){
		this._lecture = _lecture;
		this._name = _name;
		this._marks = _marks;
	}

	public int getMarkID(){
		return this._id;
	}
	public void setMarkID(int id){
		this._id = id;
	}



	public String getMarkLecture(){
		return this._lecture;
	}
	public void setMarkLecture(String _lecture){
		this._lecture = _lecture;
	}

	public String getMarkName(){
		return this._name;
	}
	public void setMarkName(String _name){
		this._name = _name;
	}

	public String getMarks(){
		return this._marks;
	}
	public void setMarks(String _marks){
		this._marks = _marks;
	}


}
