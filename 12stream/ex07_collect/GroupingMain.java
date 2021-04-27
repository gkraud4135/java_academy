package com.lec206.ex07_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
	요소를 그룹핑해서 수집하기
	
	collect()메서드는 단순히 요소를 수집하는 기능이외에 컬렉션의 요스들을 그룹핑해서
	Map객체를 생성하는 기능을 제공한다.
	
	collect()메서드를 호출할 때 Collector의 groupingBy() or groupingByConcurrent()가
	리턴하는 Collector를 매개값으로 전달하면 된다.
	
	groupingBy()는 쓰레드에 안전하지 않은 Map을 생성하지만 groupingByConcurrent()는
	쓰레드에 안전한 ConcurrentMap을 생성한다.
	
	일반 collect로는 그안 stream에서 끝내지만 Grouping을 통해 새로운 Map을 생성가능하다
*/
public class GroupingMain { //Student class생성후

	public static void main(String[] args) {

		List<Student> list = Arrays.asList( //컬렉션활용 리스트 생성
				new Student("홍길동", 10, Student.Gender.MALE, Student.City.SEOUL),
				new Student("홍길순", 6, Student.Gender.FEMALE, Student.City.BUSAN),
				new Student("홍길녀", 10, Student.Gender.FEMALE, Student.City.SEOUL),
				new Student("홍길상", 60, Student.Gender.MALE, Student.City.BUSAN)
			);
	
		Map<Student.Gender, List<Student>>  //Map<성별,List>만받는 객체생성
			mapByGender = list.stream() 
							  .collect(Collectors.groupingBy(Student::getGender));
															//젠더로만 구분할것
		// 1. 남학생
		mapByGender.get(Student.Gender.MALE)//젠더가 남자인사람들만
		           .stream()//정렬할것
		           .forEach(s -> System.out.print("남학생 : " + s.getName() + ", "));
		System.out.println();//학생의 이름을 
		
		// 2. 여학생
		mapByGender.get(Student.Gender.FEMALE)
		           .stream()
		           .forEach(s -> System.out.print("여학생 : " + s.getName() + ", "));
		System.out.println();
		// 3. 도시별 그룹핑(부산, 서울)
		Map<Student.City, List<Student>> 
		   mapByCity = list.stream().collect(Collectors.groupingBy(Student::getCity));
		   mapByCity.get(Student.City.SEOUL).stream().forEach(s->System.out.print(s.getName()+ ", "));
		   System.out.println();
		   mapByCity = list.stream().collect(Collectors.groupingBy(Student::getCity));
		   mapByCity.get(Student.City.BUSAN).stream().forEach(s->System.out.print(s.getName()+ ", "));
		// 4. 기타
		Map<Student.City, List<String>> 
			mapByCity1 = list.stream()
			                 .collect(Collectors.groupingBy(
			                		 	Student::getCity,
			                		    Collectors.mapping(Student::getName, Collectors.toList())));
		System.out.println();
		mapByCity1.get(Student.City.SEOUL).stream().forEach(s -> System.out.print(s + ", "));
		System.out.println();
		mapByCity1.get(Student.City.BUSAN).stream().forEach(s -> System.out.print(s + ", "));
	
	
	}

}










