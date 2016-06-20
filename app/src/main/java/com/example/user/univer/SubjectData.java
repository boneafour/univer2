package com.example.user.univer;

public class SubjectData {

	int _id;
	String _name;
	String _comment;

	public SubjectData(){
	}

	public SubjectData(String _name,  String _comment){
		this._name = _name;
		this._comment = _comment;
	}

	public int getSubjectID(){
		return this._id;
	}
	public void setSubjectID(int id){
		this._id = id;
	}

	public String getSubjectName(){
		return this._name;
	}
	public void setSubjectName(String _name){
		this._name = _name;
	}

	public String getSubjectComment(){
		return this._comment;	}
	public void setSubjectComment(String _comment){
		this._comment = _comment;
	}
}
