package javaexp.z02_my.vo;

import java.util.Scanner;

public class Join { // 회원가입

    String name; // 이름
    static String id; // 아이디
    String email; // 이메일
    static String pwd; // 비밀번호
    String pwdRe; // 비밀번호 재입력
    String phoneNumber; // 휴대전화

    Scanner sc = new Scanner(System.in);

    public void JoinInfo() {
    	
    	Login login01= new Login();
    	
    	
        System.out.println("\n\t< 회원가입 >" + "\n* 아래의 회원가입 정보를 기입하세요.");

        System.out.print("- 이름 : ");
        name = sc.nextLine();

        System.out.print("- 아이디 : ");
        id = sc.nextLine();

        System.out.print("- 이메일 : ");
        email = sc.nextLine();

        System.out.print("- 비밀번호 : ");
        pwd = sc.nextLine();

        System.out.print("- 비밀번호 재입력 : ");
        pwdRe = sc.nextLine();

        while (!pwd.equals(pwdRe)) {
            System.out.print("(경고) 설정한 비밀번호와 일치하게 입력하세요! " + "\n- 비밀번호 재입력 : ");
            pwdRe = sc.nextLine();
        }
        System.out.println("\t\t" + "[ 비밀번호 일치 ]");

        System.out.print("- 휴대전화('-'없이 입력) : ");
        phoneNumber = sc.nextLine();

        System.out.println("\n┌\t\t # 정보확인 #\t\t┐\n\n" + "\t- 이름:" + name + "\n" + "\t- 아이디:" + id + "\n"
                + "\t- 비밀번호:" + pwd + "\n" + "\t- 이메일:" + email + "\n" + "\t- 휴대번호:" + phoneNumber + "\n"
                + "\n└\t\t\t\t\t┘\n" + "\n* 위의 입력하신 정보로 회원가입 하시겠습니까?(숫자만 입력):"
				+"\n- 1.네\n- 2.정보 다시입력");
        String Re = sc.nextLine();

        if (Re.equals("1")) {
            System.out.print("< 회원가입 완료 >\n");
            login01.loginInfo();
        } else if (Re.equals("2")) {
            JoinInfo();
        } else {
            System.out.println("올바른 메뉴 숫자를 입력하세요!!");
            Re = sc.nextLine();
            if (Re.equals("1")) {
                System.out.print("< 회원가입 완료 >\n");
                login01.loginInfo();
            } else if (Re.equals("2")) {
                JoinInfo();
            
        }
        
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
//
//    public String getPwdRe() {
//        return pwdRe;
//    }
//
//    public void setPwdRe(String pwdRe) {
//        this.pwdRe = pwdRe;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
}