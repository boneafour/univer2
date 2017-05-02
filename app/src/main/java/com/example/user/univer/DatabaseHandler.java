package com.example.user.univer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

	// All Static variables
	// Database Version
	private static final int DATABASE_VERSION = 8;

	// Database Name
	private static final String DATABASE_NAME = "contactsManager";

	// Contacts table name
	private static final String TABLE_TEACHERS = "teachers";
	private static final String TABLE_STUDENTS = "students";
	private static final String TABLE_MARK = "mark";
	// Contacts Table Columns names

	private static final String TEACHER_ID = "teacher_id";
	private static final String TEACHER_NAME = "teacher_name";
	private static final String TEACHER_NUMBER = "teacher_number";
	private static final String TEACHER_COMMENT = "teacher_comment";

	private static final String STUDENT_ID = "student_id";
	private static final String STUDENT_NAME = "student_name";
	private static final String STUDENT_NUMBER = "student_number";
	private static final String STUDENT_COMMENT = "student_comment";


	private static final String MARK_ID = "mark_id";
	private static final String MARK_NAME = "mark_name";
	private static final String MARK_MARKS = "mark_marks";


	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_TABLE_TEACHERS = "CREATE TABLE " + TABLE_TEACHERS + "("
				+ TEACHER_ID + " INTEGER PRIMARY KEY," + TEACHER_NAME  + " TEXT,"
				+ TEACHER_NUMBER +" TEXT,"+ TEACHER_COMMENT +" TEXT"+  ")";
		db.execSQL(CREATE_TABLE_TEACHERS);

		String CREATE_TABLE_STUDENTS = "CREATE TABLE " + TABLE_STUDENTS + "("
				+ STUDENT_ID + " INTEGER PRIMARY KEY," + STUDENT_NAME + " TEXT,"
				+ STUDENT_NUMBER +" TEXT,"+ STUDENT_COMMENT +" TEXT" +  ")";
		db.execSQL(CREATE_TABLE_STUDENTS);


		String CREATE_TABLE_MARK = "CREATE TABLE " + TABLE_MARK + "("
				+ MARK_ID + " INTEGER PRIMARY KEY,"
				+ MARK_NAME + " TEXT,"+ MARK_MARKS + " TEXT"+  ")";
		db.execSQL(CREATE_TABLE_MARK);

	}

	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TEACHERS);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MARK);
		onCreate(db);
	}

	void addTeacher(TeacherData teacher) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(TEACHER_NAME, teacher.getTeacherName());
		values.put(TEACHER_NUMBER, teacher.getTeacherPhone());
		values.put(TEACHER_COMMENT, teacher.getTeacherComment());
		db.insert(TABLE_TEACHERS, null, values);
		db.close();
	}

	void addStudent(StudentData student) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(STUDENT_NAME, student.getStudentName());
		values.put(STUDENT_NUMBER, student.getStudentPhone());
		values.put(STUDENT_COMMENT, student.getStudentComment());
		db.insert(TABLE_STUDENTS, null, values);
		db.close();
	}



	public void addMark(MarkData mark) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(MARK_NAME, mark.getMarkName());
		values.put(MARK_MARKS, mark.getMark());
		db.insert(TABLE_MARK, null, values);
		db.close();
	}

	public List<TeacherData> getAllTeachers() {
		List<TeacherData> teacherList = new ArrayList<TeacherData>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_TEACHERS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				TeacherData teacher = new TeacherData();
				teacher.setTeacherID(Integer.parseInt(cursor.getString(0)));
				teacher.setTeacherName(cursor.getString(1));
				teacher.setTeacherPhone(cursor.getString(2));
				teacher.setTeacherComment(cursor.getString(3));
				teacherList.add(teacher);
			} while (cursor.moveToNext());
		}

		// return contact list
		return teacherList;
	}
	public List<StudentData> getAllStudents() {
		List<StudentData> studentList = new ArrayList<StudentData>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_STUDENTS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				StudentData student = new StudentData();
				student.setStudentID(Integer.parseInt(cursor.getString(0)));
				student.setStudentName(cursor.getString(1));
				student.setStudentPhone(cursor.getString(2));
				student.setStudentComment(cursor.getString(3));
				studentList.add(student);
			} while (cursor.moveToNext());
		}
		return studentList;
	}




	public List<MarkData> getAllMarks() {
		List<MarkData> markList = new ArrayList<MarkData>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_MARK;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		if (cursor.moveToFirst()) {
			do {
				MarkData mark = new MarkData();
				mark.setMarkID(Integer.parseInt(cursor.getString(0)));
				mark.setMarkName(cursor.getString(1));
				mark.setMark(cursor.getString(2));
				markList.add(mark);
			} while (cursor.moveToNext());
		}
		return markList;
	}

/*
	// Deleting single contact
	public void deleteContact(ContactData contact) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_CONTACTS, CONTACT_ID +NAME +ADRESS+ORGAN+ROLE +PHONE+COMMENT+ " = ?",
				new String[] { String.valueOf(contact.getID()) });
		db.close();
	}



	// Getting contacts Count
	public int getContactsCount() {
		String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

*/

}
