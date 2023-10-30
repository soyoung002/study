package javaexp.z01_homework;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
/*
**정답:**
1:1 관계는 한 객체가 다른 객체를 필드로 포함하는 관계를 의미합니다. 필드 선언은 해당 객체가 다른 객체를 포함한다는 것을 나타냅니다. 생성자는 객체가 생성될 때 초기화 작업을 수행하며, 메서드는 객체가 수행할 수 있는 작업을 정의합니다.

*/		
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
//			2) 학생과 담임교사 
//			3) Person 객체와 Address 객체의 관계
//			4) Book 객체와 Author 객체의 관계
//			5) Member 객체와 Team 객체의 관계
/*
// 1) 고객과 주문 
class Customer {
    private String name;
    private Order order;

    public Customer(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    public void showOrderDetails() {
        System.out.println(name + " has ordered " + order.getProduct());
    }
}

class Order {
    private String product;

    public Order(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}

// 2) 학생과 담임교사 
class Student {
    private String studentName;
    private Teacher teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public void showTeacherName() {
        System.out.println(studentName + "'s teacher is " + teacher.getTeacherName());
    }
}

class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

// 3) Person 객체와 Address 객체의 관계
class Person {
    private String personName;
    private Address address;

    public Person(String personName, Address address) {
        this.personName = personName;
        this.address = address;
    }

    public void showAddress() {
        System.out.println(personName + " lives in " + address.getFullAddress());
    }
}

class Address {
    private String street, city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city;
    }
}

// 4) Book 객체와 Author 객체의 관계
class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void showBookDetails() {
        System.out.println("Book: " + title + ", Author: " + author.getAuthorName());
    }
}

class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

// 5) Member 객체와 Team 객체의 관계
class Member {
    private String memberName;
    private Team team;

    public Member(String memberName, Team team) {
        this.memberName = memberName;
        this.team = team;
    }

    public void showTeamName() {
        System.out.println(memberName + " belongs to " + team.getTeamName() + " team.");
    }
}

class Team {
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
}

// Main method to demonstrate
public class MainDemo {
    public static void main(String[] args) {
        Order order = new Order("Laptop");
        Customer customer = new Customer("John", order);
        customer.showOrderDetails();

        Teacher teacher = new Teacher("Mrs. Smith");
        Student student = new Student("Alice", teacher);
        student.showTeacherName();

        Address address = new Address("123 Elm St", "Metropolis");
        Person person = new Person("Clark Kent", address);
        person.showAddress();

        Author author = new Author("J.K. Rowling");
        Book book = new Book("Harry Potter", author);
        book.showBookDetails();

        Team team = new Team("Warriors");
        Member member = new Member("Stephen Curry", team);
        member.showTeamName();
    }
}

*/		
		
	}

}
