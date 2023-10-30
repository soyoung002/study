package javaexp.z01_homework;

public class A0921_Homework {

   public static void main(String[] args) {
//      1. **책 정보 클래스**(생성자X)
//      - 필드: 제목, 저자, 출판사, 가격, 페이지 수
//      Title
//      author
//      publish
//      price
//      pages
      Book book = new Book();
      book.title = "신간일론 머스크"; // String "";
      book.author = "월터아이작슨";
      book.publish = "21세기북스";
      book.price = 34200; // int ;
      book.pages = 760;
      System.out.println("# 책의 정보 #\n" + "제목:" + book.title + "\n저자:" + book.author + "\n출판사:" + book.publish
            + "\n가격:" + book.price + "원" + "\n페이지수:" + book.pages + "P\n");

//      2. **학생 정보 클래스**(생성자X)
//     - 필드: 학번, 이름, 전공, 학년, 평균 성적   
//      number
//      name
//      major      
//      year
//      grade
//      Student st = new Student();
      Student st = new Student();
      st.number = 23;
      st.name = "홍길동";
      st.major = "컴퓨터공학과";
      st.year = 1;
      st.grade = 80.3;

      System.out.println("# 학생 정보 #\n" + "학번:" + st.number + "학번" + "\n이름:" + st.name + "\n전공:" + st.major + "\n학년:"
            + st.year + "학년" + "\n평균 성적:" + st.grade + "점\n" + "");

//     3. **자동차 클래스**(생성자X)
//      - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
//      brand
//      model
//      year
//      color
//      speedMax
//      speedNow
      Car car = new Car();
      car.brand = "아우디";
      car.model = "a6";
      car.color = "black";
      car.speedMax = 100;
      car.speedNow = 50;

      System.out.println("# 자동차 정보 #\n" + "브랜드:" + car.brand + "\n모델:" + car.model + "\n색상:" + car.color + "\n최대속도:"
            + car.speedMax + "\n현재속도:" + car.speedNow + "\n");

//     4. **계좌 정보 클래스**(생성자O)
//     - 필드: 계좌번호, 예금주, 잔액, 개설일
//      number
//      name
//      amount
//      open
      Bank bank = new Bank("1234-5678-9101", "홍길동", "100", "2023.09.21");

      System.out.println("# 계좌 정보 #\n계좌번호:" + bank.number);
      System.out.println("예금주:" + bank.owner);
      System.out.println("잔액:" + bank.amount);
      System.out.println("개설일자:" + bank.open + "\n");

//      5. **상품 정보 클래스**(생성자O)
//     - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사      
//      code
//      name
//      price
//      stock
//      made

      Product p = new Product("1234", "삼성노트북", 1000000, 50, "Samsung");

      System.out.println("# 상품 정보 #\n상품코드:" + p.code);
      System.out.println("상품명:" + p.name);
      System.out.println("가격:" + p.price + "원");
      System.out.println("재고수량:" + p.stock + "개");
      System.out.println("제조사:" + p.made);

//     6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//     - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//      title
//      director
//      actor
//      open
//      time
//      genre

      Movie movie = new Movie("엔드게임", "조루소외1명", "로버트다우니주니어 외 다수..", "2019.04.24", 181, "액션");

      System.out.println("\n# 영화 정보 #\n제목:" + movie.title);
      System.out.println("감독:" + movie.director);
      System.out.println("배우:" + movie.actor);
      System.out.println("개봉일:" + movie.open);
      System.out.println("상영시간:" + movie.time + "분");
      System.out.println("장르:" + movie.genre);

//     7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//     - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
      Sport sport = new Sport("홍길동", "야구", "LG", "투수", 2, 7);

      System.out.println("\n# 운동선수 정보 #\n이름:" + sport.name);
      System.out.println("스포츠종류:" + sport.kind);
      System.out.println("팀명:" + sport.team);
      System.out.println("포지션:" + sport.role);
      System.out.println("경력년수:" + sport.year + "년");
      System.out.println("선수번호:" + sport.number);

//     8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//     - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명      
      Music track1 = new Music("라일락", "IU");
      Music track2 = new Music(120, "댄스");
      Music track3 = new Music("LILAC");

      System.out.println("\n# 음악 앨범 정보 #\n곡 제목:" + track1.song);
      System.out.println("아티스트:" + track1.artist);
      System.out.println("재생시간:" + track2.time);
      System.out.println("장르:" + track2.genre);
      System.out.println("앨범명:" + track3.name);

//     9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//     - 필드: (이름), (종류, 나이), 체중, 색상
      Animal animal = new Animal();
      Animal animal1 = new Animal("뽀리");
      Animal animal2 = new Animal("폼피츠", 3);
      Animal animal3 = new Animal(4.7);
      Animal animal4 = new Animal("흰색");
//      Animal animal4 = new Animal("흰색");
      System.out.println("\n# 동물 정보 #\n이름:" + animal1.name);
      System.out.println("종류:" + animal2.kind);
      System.out.println("나이:" + animal2.age+"살");
      System.out.println("체중:" + animal3.weight+"kg");
      System.out.println("색상:" + animal4.color);

//     10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//       - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//      id
//      pw
//      name
//      mail
//      number
//      year
      User user = new User();
      
      User user1 = new User("abc123");
      User user2 = new User("abc456");
      User user3 = new User("홍길동");
      User user4 = new User("abc789@gmail.com");
      User user5 = new User("010-1234-5678");
      User user6 = new User("2023년09월21일");
      
      System.out.println("\n# 사용자 프로필 #\n아이디:" + user1.id);
      System.out.println("비밀번호:" + user2.pw);
      System.out.println("이름:" + user3.name);
      System.out.println("이메일:" + user4.email);
      System.out.println("생년월일:" + user5.year);
   }
}

class Book {
   String title;
   String author;
   String publish;
   int price;
   int pages;

}

class Student {
   int number;
   String name;
   String major;
   int year;
   double grade;

}

class Car {
   String brand;
   String model;
   int year;
   String color;
   int speedMax;
   int speedNow;

}

class Bank {
   String number;
   String owner;
   String amount;
   String open;

Bank(String number, String owner, String amount, String open){
      this.number = number;
      this.owner = owner;
      this.amount = amount;
      this.open = open;
   }

	// TODO Auto-generated constructor stub
}


class Product {
   String code;
   String name;
   int price;
   int stock;
   String made;

   Product(String code, String name, int price, int stock, String made) {
      this.code = code;
      this.name = name;
      this.price = price;
      this.stock = stock;
      this.made = made;
   }

}


class Movie {
   String title;
   String director;
   String actor;
   String open;
   int time;
   String genre;

   Movie() {
   }

   Movie(String title, String director, String actor, String open, int time, String genre) {
      this.title = title;
      this.director = director;
      this.actor = actor;
      this.open = open;
      this.time = time;
      this.genre = genre;
   }
//    Movie m01=newMovie();
//    Movie m02=newMovie("영화제목","감독명","배우명"...);
   
}

class Sport {
   String name;
   String kind;
   String team;
   String role;
   int year;
   int number;

   Sport() {

   }

   Sport(String name, String kind, String team, String role, int year, int number) {

      this.name = name;
      this.kind = kind;
      this.team = team;
      this.role = role;
      this.year = year;
      this.number = number;
   }
}

class Music {

   String song;
   String artist;
   int time;
   String genre;
   String name;

   Music() {
   }
   //매개변수..생성자나 메서드는 호출시 매개변수의 갯수로 식별하여 호출이 가능하기 때문에 동일한 이름(Music(){})이라도 선언할 수 있다.
   Music(String song, String artist) { 	//==> ()에 들어간것 매개변수
      this.song = song;
      this.artist = artist;
   }

   Music(int time, String genre) {
      this.time = time;
      this.genre = genre;
   }

   Music(String name) {
      this.name = name;
   }
}

class Animal {
   String name;
   String kind;
   int age;
   double weight;
   String color;
   Animal(){}
   Animal(String name){
      this.name=name;
   }
   Animal(String kind, int age){
      this.kind=kind;
      this.age=age;
   }
   Animal(double weight) {
      this.weight=weight;
   }
   Animal(String color,double weight) {
      this.color=color;
      this.weight=weight;
   }
}

class User{
   String id;
   String pw;
   String name;
   String email;
   String phone;
   String year;
   User(){}
   User(String id){
      this.id=id;
   }
   User(String pw, String name){
      this.pw=pw;
      this.name=name;
   }
   User(String email,String phone, String year){
   this.email=email;
      this.phone=phone;
      this.year=year;
   }
   User(String id, String pw, String name,String email,String phone, String year){
      this.id=id;
      this.pw=pw;
      this.name=name;
      this.email=email;
      this.phone=phone;
      this.year=year;
      }
   
   
}