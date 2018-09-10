package FunctionInterface;
import java.util.List;
import java.util.function.Function;

import java.util.ArrayList;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
}

public class StudentExample {
	List<String> getStudentNames(List<Student> list, Function<Student, String> function) {
		List<String> result = new ArrayList<>();
		for (Student student : list) {
			result.add(function.apply(student));
		}
		return result;
	}

	public static void main(String[] args) {
		StudentExample studentExample=new StudentExample();
		List<Student> list=new ArrayList<>();
		list.add(new Student("Harishma",22));
		list.add(new Student("Kiran",15));
		List<String> names=studentExample.getStudentNames(list,new Function<Student, String>() {
			@Override
			public String apply(Student student)
			{
			return student.getName();	
			}
		});
		System.out.println(names);

}}
