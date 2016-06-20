package com.example.user.univer;

public class TeacherData {

	int _id;
	String _name;
	String _phone;
	String _comment;

	public TeacherData(){
	}

	public TeacherData(String _name, String _phone, String _comment){
		this._name = _name;
		this._phone = _phone;
		this._comment = _comment;
	}

	public int getTeacherID(){
		return this._id;
	}
	public void setTeacherID(int id){
		this._id = id;
	}

	public String getTeacherName(){
		return this._name;
	}
	public void setTeacherName(String _name){
		this._name = _name;
	}

	public String getTeacherPhone(){
		return this._phone;
	}
	public void setTeacherPhone(String _phone){
		this._phone = _phone;
	}


	public String getTeacherComment(){
		return this._comment;	}
	public void setTeacherComment(String _comment){
		this._comment = _comment;
	}
}
