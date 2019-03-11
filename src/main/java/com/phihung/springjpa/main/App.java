package com.phihung.springjpa.main;

import java.util.Scanner;
import com.phihung.springjpa.util.ScreenUtil;
import com.phihung.springjpa.util.StudentUtil;

public class App {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Create Spring application context
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("classpath:/spring.xml");

		// Get service from context.
		// StudentService studentService = ctx.getBean(StudentService.class);

		int num = 0;
		do {
			ScreenUtil.printMenu();
			num = input.nextInt();

			switch (num) {
			case 1: {
				StudentUtil.addStudent();
				break;
			}
			case 2: {
				StudentUtil.updateStudent();
				break;
			}
			case 3: {
				StudentUtil.deleteStudent();
				break;
			}
			case 4: {
				StudentUtil.findStudent();
				break;
			}
			case 5: {
				StudentUtil.getListStudent();
				break;
			}

			case 6: {
				// studentUtil.sortStudent();
				break;
			}
			case 7:
				System.exit(0);
				break;
			}

		} while (num != 7);
	}
}
