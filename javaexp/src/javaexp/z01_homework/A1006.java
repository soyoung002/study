package javaexp.z01_homework;

public class A1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
마감 : 월요일 ~18:00까지 개인톡으로 전달..

# 미니프로젝트
1. 주제 : 조원 협의 해서 동일한 주제/개인별로(java/javascript 1씩) 
2. 아래내용 연습을 위한 내용(필수2개이상씩)

# 자바프로그램
1. **도서관 관리 시스템**:
    - 도서 추가, 삭제, 검색 기능
    - 사용자 회원 가입, 대출 및 반납 기능

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getters, setters, toString...
}

class User {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // getters, setters, toString...
}

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void lendBookToUser(Book book, User user) {
        if (books.contains(book)) {
            books.remove(book);
            user.borrowBook(book);
        }
    }

    public void retrieveBookFromUser(Book book, User user) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            books.add(book);
        }
    }

    // other methods...
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        User user1 = new User("John Doe");

        library.addBook(book1);
        library.registerUser(user1);
        library.lendBookToUser(book1, user1);
        library.retrieveBookFromUser(book1, user1);
    }
}


2. **은행 계좌 관리 애플리케이션**:
    - 계좌 생성, 입금, 출금, 잔액 조회 기능

class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}


3. **학생 성적 관리 시스템**:
    - 학생 정보 및 성적 입력, 수정, 삭제, 조회 기능
    - 평균, 등급 계산 기능

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }
}

public class GradeApp {
    public static void main(String[] args) {
        Student student1 = new Student("John", 85);
        System.out.println(student1.getGrade());
    }
}


4. **간단한 쇼핑몰 시스템**:
    - 상품 목록, 장바구니, 주문 기능
    - 사용자 로그인 및 회원 가입 기능
    
import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - $" + price;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }
}

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
		int tot = 0;
		for(Product p:products) {
		tot+=p.getPrice()
    }
    return; 
    }
}

    public void displayCart() {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total: $" + getTotalCost());
    }
}

class ShopSystem {
    private List<User> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private ShoppingCart cart = new ShoppingCart();
    private User currentUser = null;

    public ShopSystem() {
        // Sample products for the demo
        products.add(new Product(1, "T-shirt", 20));
        products.add(new Product(2, "Jeans", 50));
    }
    
	//사용자 등록
    public void signUp(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("Signup successful for: " + username);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.verifyPassword(password)) {
                currentUser = user;
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Login failed!");
        return false;
    }

    public void addProductToCart(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                cart.addProduct(product);
                System.out.println(product.getName() + " added to cart.");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void checkout() {
        cart.displayCart();
    }
}

public class ShoppingMallApp {
    public static void main(String[] args) {
        ShopSystem shop = new ShopSystem();
        shop.signUp("user1", "password1"); // Sample signup
        if (shop.login("user1", "password1")) { // Sample login
            shop.displayProducts();
            shop.addProductToCart(1);
            shop.checkout();
        }
    }
}

    

5. **일정 관리 애플리케이션**:
    - 일정 추가, 삭제, 수정, 조회 기능
    - 알림 설정 기능

class Schedule {
    String title;
    String description;
    String date;
    boolean hasReminder;

    Schedule(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    void setReminder(boolean flag) {
        this.hasReminder = flag;
    }
}

class ScheduleManager {
    List<Schedule> schedules = new ArrayList<>();

    void addSchedule(Schedule s) {
        schedules.add(s);
    }

    void removeSchedule(Schedule s) {
        schedules.remove(s);
    }

    void updateSchedule(Schedule oldSchedule, Schedule newSchedule) {
    //리스트객체.indexOf(객체)
	//리스트객체에 객체를 포함하고 있는 index값을 리턴해준다
	//[(),(),()];
	//없으면 -1리턴
        int index = schedules.indexOf(oldSchedule);
        //객체 해당 리스트 포함되어 있는 경우
        if(index != -1) {
            schedules.set(index, newSchedule);
        }
    }

    List<Schedule> viewSchedules() {
        return schedules;
    }
}



6. **투두 리스트 애플리케이션**:
    - 할 일 추가, 삭제, 수정 기능
    - 우선순위 및 완료 체크 기능

class Todo {
    String task;
    boolean isComplete;
    int priority;

    Todo(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    void completeTask() {
        this.isComplete = true;
    }
}

class TodoManager {
    List<Todo> todos = new ArrayList<>();

    void addTask(Todo t) {
        todos.add(t);
    }

    void removeTask(Todo t) {
        todos.remove(t);
    }

    void updateTask(Todo oldTodo, Todo newTodo) {
        int index = todos.indexOf(oldTodo);
        if(index != -1) {
            todos.set(index, newTodo);
        }
    }

    List<Todo> viewTasks() {
        return todos;
    }
}


7. **커피 주문 시스템**:
    - 메뉴 선택, 재료 선택, 결제 기능

class Coffee {
    String name;
    double price;
    String ingredient;

    Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void addIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}

class OrderSystem {
    List<Coffee> menu = new ArrayList<>();

    void addCoffeeToMenu(Coffee c) {
        menu.add(c);
    }

    Coffee orderCoffee(String name) {
        for(Coffee c: menu) {
            if(c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }

    void makePayment(Coffee c) {
        System.out.println("Payment for " + c.name + " of $" + c.price + " received.");
    }
}


8. **영화 티켓 예매 시스템**:
    - 영화 선택, 시간 선택, 좌석 선택, 결제 기능
class Movie {
    String title;
    String showTime;
    boolean[] seats = new boolean[100];  // Simplified 100 seats for every movie

    Movie(String title, String showTime) {
        this.title = title;
        this.showTime = showTime;
    }

    boolean bookSeat(int seatNumber) {
        if(!seats[seatNumber]) {
            seats[seatNumber] = true;
            return true;
        }
        return false;
    }
}

class MovieBookingSystem {
    List<Movie> movies = new ArrayList<>();

    void addMovie(Movie movie) {
        movies.add(movie);
    }

    Movie selectMovie(String title, String showTime) {
        for(Movie movie : movies) {
            if(movie.title.equals(title) && movie.showTime.equals(showTime)) {
                return movie;
            }
        }
        return null;
    }

    void makePayment(Movie movie, int seatNumber) {
        if(movie.bookSeat(seatNumber)) {
            System.out.println("Seat booked successfully for " + movie.title);
        } else {
            System.out.println("Seat already booked or invalid seat number.");
        }
    }
}

9. **간단한 퀴즈 애플리케이션**:
    - 다양한 퀴즈 풀이 및 정답 확인 기능
    - 점수 및 랭킹 기능
class Quiz {
    String question;
    String[] options;
    int answer;

    Quiz(String question, String[] options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    boolean checkAnswer(int selected) {
        return answer == selected;
    }
}

class QuizApp {
    List<Quiz> quizzes = new ArrayList<>();
    int score = 0;

    void addQuiz(Quiz q) {
        quizzes.add(q);
    }

    void takeQuiz() {
        for(Quiz q : quizzes) {
            // Display the question and options
            // Get the user's answer
            // If the answer is correct, increase the score
        }
    }
}

10. **날씨 정보 애플리케이션**:
    - 도시나 지역 선택 후 현재 날씨 및 예보 정보 제공 기능
    - 다양한 지역에 대한 날씨 정보 저장 및 조회 기능
class WeatherInfo {
    String city;
    String currentWeather;
    String forecast;

    WeatherInfo(String city, String currentWeather, String forecast) {
        this.city = city;
        this.currentWeather = currentWeather;
        this.forecast = forecast;
    }
}

class WeatherApp {
    List<WeatherInfo> weatherDatabase = new ArrayList<>();

    void addWeatherInfo(WeatherInfo info) {
        weatherDatabase.add(info);
    }

    WeatherInfo getWeather(String city) {
        for(WeatherInfo info : weatherDatabase) {
            if(info.city.equals(city)) {
                return info;
            }
        }
        return null;
    }
}

# 자바스크립트
1. **간단한 계산기**:
    - 사칙 연산 기능(+, -, *, /) 구현
    - 입력값 검증 및 결과 출력
function calculator(a, b, operation) {
    switch(operation) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if(b === 0) {
                return 'Error: Division by zero';
            }
            return a / b;
        default:
            return 'Invalid operation';
    }
}

console.log(calculator(5, 3, '+'));

2. **숫자 맞추기 게임**:
    - 컴퓨터가 1부터 100까지의 숫자 중 하나를 무작위로 선택
    - 사용자가 숫자를 입력하여 맞추는 게임
const randomNum = Math.floor(Math.random() * 100) + 1;
let guess = prompt("Guess a number between 1 and 100");

while(Number(guess) !== randomNum) {
    if(Number(guess) < randomNum) {
        guess = prompt("Higher! Guess again.");
    } else {
        guess = prompt("Lower! Guess again.");
    }
}

alert("Congratulations! You guessed the number.");

3. **문자열 처리 유틸리티**:
    - 주어진 문자열의 길이, 단어 수, 대/소문자 변환 기능 등
function stringUtility(str) {
    return {
        length: str.length,
        wordCount: str.split(' ').length,
        toUpperCase: str.toUpperCase(),
        toLowerCase: str.toLowerCase()
    };
}

console.log(stringUtility("Hello World"));

4. **배열 및 객체 정렬 유틸리티**:
    - 사용자가 배열이나 객체를 입력하면 정렬하여 결과를 출력
function sortArray(arr) {
    return arr.sort((a, b) => a - b);
}

function sortObject(obj) {
    return Object.entries(obj)
                 .sort((a, b) => a[1] - b[1])
                 .reduce((acc, [key, val]) => ({ ...acc, [key]: val }), {});
}

console.log(sortArray([5, 3, 8, 1]));
console.log(sortObject({b: 3, a: 5, d: 1, c: 4}));

5. **시간 변환 유틸리티**:
    - 초를 입력받아 시, 분, 초로 변환하거나 그 반대의 기능
function secondsToTime(seconds) {
	//1/1000 ==> 1초 ==> 60초 ==> 1분 ==> 60 == 1시간
    const hours = Math.floor(seconds / 3600);
    const minutes = Math.floor((seconds - (hours * 3600)) / 60);
    const remainingSeconds = seconds - (hours * 3600) - (minutes * 60);

    return `${hours}h ${minutes}m ${remainingSeconds}s`;
}

function timeToSeconds(time) {
    const [hours, minutes, secs] = time.split(':').map(Number);
    return (hours * 3600) + (minutes * 60) + secs;
}

console.log(secondsToTime(3666));
console.log(timeToSeconds("1:1:6"));

6. **화폐 단위 변환기**:
    - 다양한 국가의 화폐 단위 간 변환 기능
const rates = {
    USD: 1,
    EUR: 0.85,
    JPY: 110,
    KRW: 1100
};

function convertCurrency(amount, from, to) {
    if (!rates[from] || !rates[to]) {
        return 'Invalid currency code';
    }
    return (amount / rates[from]) * rates[to];
}

console.log(convertCurrency(100, 'USD', 'EUR'));

7. **데이터 필터링 유틸리티**:
    - 주어진 데이터 배열에서 특정 조건을 만족하는 항목만을 추출
function filterDataOver(arr, criteria) {


    var retArry=[]
    for(var idx in arr){
    	if(criteria>= arry[idx]){
    		retArry.push(arry[idx]);
    	}
    }
    return retArry;
}

const arr = [5, 8, 10, 1, 6, 12];
const result = filterDataOver(arr, 6);
console.log(result);

8. **객체 기반 주소록 시스템**:
    - 이름, 전화번호, 이메일 주소 등의 정보를 입력하고 조회, 수정, 삭제하는 기능
let addressBook = [];

function addContact(name, phoneNumber, email) {
    addressBook.push({name, phoneNumber, email});
}

function findContact(name) {
    return addressBook.find(contact => contact.name === name);
}

function deleteContact(name) {
    const index = addressBook.findIndex(contact => contact.name === name);
    if (index !== -1) {
        addressBook.splice(index, 1);
    }
}

addContact('Alice', '123-456', 'alice@email.com');
console.log(findContact('Alice'));
deleteContact('Alice');

9. **텍스트 기반 RPG 게임**:
var ch = {name:"캐릭터1",hp:100,ex:0,
		attack:function(target) {} 
		target.hp -=10;
		this.exp+=10;
		}
		}
var mon = {name:"몬스터",  hp:120, ex:1,
						attack:function(target) {
						this.exp+=10;}}
				

    - 간단한 캐릭터 생성, 전투, 경험치 획득 등의 기능
class Character {
    constructor(name) {
        this.name = name;
        this.hp = 100;
        this.exp = 0;
    }

    attack(target) {
        target.hp -= 10;
        this.exp += 10;
    }
}

const player = new Character('Hero');
const monster = new Character('Monster');
player.attack(monster);
console.log(player, monster);

10. **기본적인 통계 계산 유틸리티**:
    - 주어진 숫자 배열의 평균, 중앙값, 최댓값, 최솟값 등을 계산

function average(arr) {
	var tot =0
	for(var idx in arr){
		tot += arr[idx]
	}

    return tot / arr.length;
}

function median(arr) {
    arr.sort((a, b) => a - b);
    const mid = Math.floor(arr.length / 2);
    return arr.length % 2 !== 0 ? arr[mid] : (arr[mid - 1] + arr[mid]) / 2;
}

function max(arr) {
	var num =0
	for(var idx in arr){
	    if(arr[idx]>num){
	       num = arry[idx]
	    }
		
	}

    return num;
}

function min(arr) {
	var num =99999
	for(var idx in arr){
	    if(arr[idx]<num){
	       num = arry[idx]
	    }
		
	}

    return num;
}

const sampleNumbers = [5, 7, 1, 8, 4];
console.log(average(sampleNumbers));
console.log(median(sampleNumbers));
console.log(max(sampleNumbers));
console.log(min(sampleNumbers));










 * */
	}

}
