package hw_day7_suggestion.data;

import java.util.ArrayList;

public class User {
	String id;
	String password;
	String name;
	ArrayList<Course> registeredCourses;
	int failedCount;
	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public int getFailedCount() {
		return failedCount;
	}
	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
