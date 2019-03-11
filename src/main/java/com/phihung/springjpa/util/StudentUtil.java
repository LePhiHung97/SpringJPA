package com.phihung.springjpa.util;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phihung.springjpa.model.Student;
import com.phihung.springjpa.service.StudentService;

public class StudentUtil {

	// application context
	static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

	// Get service from context.
	static StudentService studentService = ctx.getBean(StudentService.class);

	static Scanner input = new Scanner(System.in);

	public static void inputInformation(Student student) {
		input.nextLine();
		System.out.println("Nhap vao hoten : ");
		student.setHoten(input.nextLine());

		System.out.println("Nhap vao nam sinh : ");
		student.setNamsinh(input.nextInt());

		input.nextLine();
		System.out.println("Nhap vao lop : ");
		student.setLop(input.nextLine());

		System.out.println("Nhap vao diem : ");
		student.setDiem(input.nextDouble());
	}

	public static void addStudent() {
		Student student = new Student();
		inputInformation(student);
		studentService.addStudent(student);
	}

	public static void deleteStudent() {
		System.out.println("Nhap vao ma sinh vien : ");
		int masv = input.nextInt();
		Student student = (Student) studentService.getById(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien !");
		else
			studentService.deleteStudent(student);
	}

	public static void findStudent() {
		System.out.println("Nhap vao ma sinh vien :");
		int masv = input.nextInt();
		Student student = (Student) studentService.getById(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien");
		else
			System.out.println(student);
	}

	public static void updateStudent() {
		System.out.println("Nhap vao ma sinh vien : ");
		int masv = input.nextInt();
		Student student = (Student) studentService.getById(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien !");
		else {
			inputInformation(student);
			studentService.updateStudent(student);
		}
	}

	public static void getListStudent() {
		List<Student> list = studentService.getAllStudent();
		if (list.isEmpty())
			System.out.println("Khong co sinh vien nao trong danh sach !");
		else
			for (Student student : list)
				System.out.println(student);
	}

	public void sortStudent() {

	}
}
