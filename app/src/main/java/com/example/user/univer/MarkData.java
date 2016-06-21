package com.example.user.univer;

public class MarkData {

	int _id;
	String _teacher;
	String _student;
	String _subject;
	String _name;
	String _mark;

	public MarkData(){
	}

	public MarkData(String _teacher, String _student, String _subject, String _name, String _mark){
		this._teacher = _teacher;
		this._student = _student;
		this._subject = _subject;
		this._name = _name;
		this._mark = _mark;
	}

	public int getMarkID(){
		return this._id;
	}
	public void setMarkID(int id){
		this._id = id;
	}

	public String getMarkTeacher(){
		return this._teacher;
	}
	public void setMarkTeacher(String _teacher){
		this._teacher = _teacher;
	}


	public String getMarkStudent(){
		return this._student;	}
	public void setMarkStudent(String _student){
		this._student = _student;
	}


	public String getMarkSubject(){
		return this._subject;
	}
	public void setMarkSubject(String _subject){
		this._subject = _subject;
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
