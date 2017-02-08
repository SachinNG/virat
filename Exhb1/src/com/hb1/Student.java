package com.hb1;
import javax.persistence.*;

@Entity
@Table(name="Student420")
public class Student 
{
@Id
private int StudentId;
private String StudentName,StudentSchool;
private int No;
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getStudentSchool() {
	return StudentSchool;
}
public void setStudentSchool(String studentSchool) {
	StudentSchool = studentSchool;
}
	

}
