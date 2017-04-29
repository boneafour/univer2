package com.example.user.univer;

public class LectureData {

	int _id;
	String _name;
	String _teacher;
	String _student;
	String _subject;
	String _topic;
	String _data;
	String _time;
	String _teacherComment;
	String _studentComment;
	String _check;
	String _lecture;

	public LectureData(){
	}

	public LectureData(String _name, String _teacher, String _student, String _subject, String _topic, String _data, String _time, String _teacherComment, String _studentComment, String _check){
		this._name = _name;
		this._teacher = _teacher;
		this._student = _student;
		this._subject = _subject;
		this._topic = _topic;
		this._data = _data;
		this._time = _time;
		this._teacherComment = _teacherComment;
		this._studentComment = _studentComment;
		this._check = _check;
		this._topic = _lecture;
	}

	public int getLectureID(){
		return this._id;
	}
	public void setLectureID(int id){
		this._id = id;
	}

	public String getLectureName(){
		return this._name;
	}
	public void setLectureName(String _name){
		this._name = _name;
	}

	public String getLectureTeacher(){
		return this._teacher;
	}
	public void setLectureTeacher(String _teacher){
		this._teacher = _teacher;
	}

	public String getLectureStudent(){
		return this._student;	}
	public void setLectureStudent(String _student){
		this._student = _student;
	}

	public String getLectureSubject(){
		return this._subject;
	}
	public void setLectureSubject(String _subject){
		this._subject = _subject;
	}

	public String getLectureTopic(){
		return this._topic;
	}
	public void setLectureTopic(String _topic){
		this._topic = _topic;
	}

	public String getLectureData(){
		return this._data;
	}
	public void setLectureData(String _data){
		this._data = _data;
	}

	public String getLectureTime(){
		return this._time;	}
	public void setLectureTime(String _time){
		this._time = _time;
	}

	public String getLectureTeacherComment(){
		return this._teacherComment;
	}
	public void setLectureTeacherComment(String _teacherComment){
		this._teacherComment = _teacherComment;
	}

	public String getLectureStudentComment(){
		return this._studentComment;
	}
	public void setLectureStudentComment(String _studentComment){
		this._studentComment = _studentComment;
	}
	public String getLectureCheck(){
		return this._check;
	}
	public void setLectureCheck(String _check){
		this._check = _check;
	}


	public String getLectureLecture(){
		return this._lecture;
	}
	public void setLectureLecture(String _lecture){
		this._lecture = _lecture;
	}
}
