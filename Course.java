package hw_day7_suggestion.data;

import java.util.ArrayList;
import java.util.Date;

public class Course {

	int id;
	String name;
	ArrayList<Mentor> teachingMentors;
	Date begin;
	Date end;
	int fee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Mentor> getTeachingMentors() {
		return teachingMentors;
	}
	public void setTeachingMentors(ArrayList<Mentor> teachingMentors) {
		this.teachingMentors = teachingMentors;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
