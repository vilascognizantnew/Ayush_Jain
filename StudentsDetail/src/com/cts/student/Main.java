package com.cts.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Ayush", 23, new Address("abcd"),
				Arrays.asList(new MobileNumber("8976"), new MobileNumber("54321")));

		Student s2 = new Student("abhay", 24, new Address("efghi"),
				Arrays.asList(new MobileNumber("1234"), new MobileNumber("2244")));

		Student s3 = new Student("dev", 25, new Address("xyz"),
				Arrays.asList(new MobileNumber("1234"), new MobileNumber("9999")));

		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);

		
		for (Student s : l) {
			if (s.getName().equals("abhay"))
				System.out.println("Student Matching Name \"Abhay\" : " + s.getName() + "; Age: " + s.getAge());
		}

		for (Student s : l) {
			if (s.getAddress().getZipcode().equals("abcd"))
				System.out.println("Student Matching Address \"abcd\" : " + s.getName() + "; Age: " + s.getAge());
		}

		
		List<String> list = new ArrayList<>();
		for (Student s : l) {
			for (MobileNumber str : s.getMobileNumbers()) {
				if (str.getNumber().equals("1234"))
					list.add(s.getName());
			}
		}
		System.out.println("Students having Mobile Numbers \"1234\" : " + list);

		
		Set<String> list1 = new HashSet<String>();
		for (Student s : l) {
			for (MobileNumber str : s.getMobileNumbers()) {
				if (str.getNumber().equals("8976") || str.getNumber().equals("54321"))
					list1.add(s.getName());
			}
		}
		System.out.println("Students having Mobile Numbers \"8976 and 54321\" : " + list1);

	
		TempStudent ts1 = new TempStudent("chgandu", 22, new Address("abcd"),
				Arrays.asList(new MobileNumber("8976"), new MobileNumber("54321")));

		TempStudent ts2 = new TempStudent("Raju", 24, new Address("efghi"),
				Arrays.asList(new MobileNumber("1234"), new MobileNumber("2244")));

		List<TempStudent> tempStudentList = Arrays.asList(ts1, ts2);

		List<Student> studentList = tempStudentList.stream().map(tempStudent -> new Student(tempStudent.name,
				tempStudent.age, tempStudent.address, tempStudent.mobileNumbers)).collect(Collectors.toList());

		System.out.println("Student as List from TempStudent" + studentList);


		List<String> studNames = new ArrayList<>();
		for (Student s : l) {
			studNames.add(s.getName());
		}

		System.out.println("List of Student Names: " + studNames);

	
		String name = studentList.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println("List<students> to String : " + name);

	

		List<String> ls = Arrays.asList("Tanmay", "Modh", "Hello", "sir");
		System.out.println("Change the Case Of List<String> : ");
		for (String s : ls) {
			System.out.println(s.toUpperCase());
		}
		
		
		System.out.println("List Before Sort : "+ls);
		Collections.sort(ls);
		
		System.out.println("List After Sort : "+ls);
		
	
		boolean ConditionFlag = true;
		
		Stream<Student> result = l.stream().filter(stu->stu.getName().startsWith("T"));
		
		if(ConditionFlag)
			result = result.sorted(Comparator.comparing(Student::getName));
		
		System.out.println("Before Sorting: ");
		l.forEach(s -> System.out.println(s.getName()));
		
		List<Student> comparedList = result.collect(Collectors.toList());
		System.out.println("After filter and Conditional Sorting : ");
		comparedList.forEach(s -> System.out.println(s.getName()));
		
	}	
		
		
		
	

}
