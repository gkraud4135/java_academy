package com.lec206.ex06_wildcard;

import java.util.Arrays;

/*
	와일드카드타입(<?>, <? extends 상위타입>, <? super 하위타입>)
	
	코드에서 ?를 일반적으로 와일드카드라고 한다. 제네릭타입을 매개값이나
	리턴타입으로 사용할 때 구체적인 타입대신에 와일드카드를 아래와 같이
	3가지 형태로 사용할 수 있다.
	
	1. <?> : 제한이 없다.
	2. <? extends 상위타입> : 상위타입이나 하위타입만 가능(상위클래스는 제한)
	3. <? super 하위타입>   : 하위타입이나 상위타입만 가능(하위클래스는 제한)
*/
public class WildCardMain {
	//  수강생등록
	// 1. 모든 수강생등록
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " +
					Arrays.toString(course.getStudents()));
	}
	
	// 2. 학생 수강생만 등록
	public static void registerStudentsCourse(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));		
	}
	
	// 3. 근로자만 등록
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));		
	}
	
	public static void main(String[] args) {
		
		// 1. 모두 수강등록이 가능한 코스
		Course<Person> 일반인 = new Course<>("일반인과정", 5);
		일반인.add(new Person("아저씨"));
		일반인.add(new Worker("김대리"));
		일반인.add(new Student("학생"));
		일반인.add(new HighStudent("고딩이"));
		
		// 2. 학생만 등록가능한 코스
		Course<Student> 학생 = new Course<>("학생과정", 5);
		학생.add(new Student("학생"));
		학생.add(new HighStudent("고딩이"));
		
		// 3. 고등학생만 등록이 가능한 코스
		Course<HighStudent> 고등학생 = new Course<>("고등학생과정", 5);
		고등학생.add(new HighStudent("고딩이"));
		
		// 4. 직장인만 등록가능한 코스
		Course<Worker> 직장인 = new Course<>("직장인과정", 5);
		
		// 일반인과정 수강등록
		registerCourse(일반인);
		registerCourse(직장인);
		registerCourse(학생);
		registerCourse(고등학생);
		System.out.println();
		
		// 학생과정 수강등록
		// registerStudentsCourse(일반인); (x)
		// registerStudentsCourse(직장인); (x)
		registerStudentsCourse(학생);
		registerStudentsCourse(고등학생);
		System.out.println();
		
		// 직장인 수강등록
		registerWorkerCourse(일반인);
		registerWorkerCourse(직장인);
		// registerWorkerCourse(학생); (x)
		// registerWorkerCourse(고등학생); (x)
	}

}











