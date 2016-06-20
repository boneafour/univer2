package com.example.user.univer;

public class StudentData {

	int _id;
	String _name;
	String _phone;
	String _comment;

	public StudentData(){
	}

	public StudentData(String _name, String _phone, String _comment){
		this._name = _name;
		this._phone = _phone;
		this._comment = _comment;
	}

	public int getStudentID(){
		return this._id;
	}
	public void setStudentID(int id){
		this._id = id;
	}

	public String getStudentName(){
		return this._name;
	}
	public void setStudentName(String _name){
		this._name = _name;
	}

	public String getStudentPhone(){
		return this._phone;
	}
	public void setStudentPhone(String _phone){
		this._phone = _phone;
	}


	public String getStudentComment(){
		return this._comment;	}
	public void setStudentComment(String _comment){
		this._comment = _comment;
	}
}
