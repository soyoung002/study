/*
 # 테이블 생성
 1. 데이터베이스에서 핵심 객체인 테이블을 생성하여 
 	데이터를 저장,수정,삭제, 조회를 할 수 있게 해보자.
 2. 테이블 생성 단게별 학습
 	1) 테이블의 구성요소 확인
 		- 컬럼 : 테이블은 컬럼이라는 구성요소로 되어 있는데,
				각 컬럼은 데이터 유형,이름,제약조건을 설정할 수 있다.
				==> 데이터 유형과 이름 설정까지 할 수 있도록
	2) 데이터 유형
	 	* number : 숫자형 유형
	 				정수와 실수가 모두 입력되는 기본 유형의 숫자형 타입
	 				ex) number(전체자리수, 소수점 이하 자리수)
	 				
	 	* varchar2(byte) : 가변형 문자열
	 						최대 크기를 설정하여, 그 이하의 데이터를 입력할 수 있다.
	 						
	 					varchar2(10) 
	 					==> 최대문자열 10(bytes)
	 					 	10byte이하의 문자열을 저장하고, 해당 크기만큼 메모리를 사용한다.
	 						영문은 글자 10자
	 						한글은 오라클에서는 3byte가 1자의 문자이기 때문에 3자 입력 가능 
	 						ex) 1. himan 할당된 경우 5byte 메모리 이용하여 할당
	 							2. 안녕하세요 3x5=15byte 
	 								기준으로 잡은 10을 초과했기 때문에 할당자체가 되지않음.
	 	* char(byte) : 고정형 문자열
	 				 	해당 설정한 데이터 크기로만 메모리를 할당하는 데이터 유형
	 				 	ex) char(10) : 최대크기보다 작ㅇ느 데이터가 입력 가능하나
	 				 					메모리는 10byte가 할애되고 나머지는 공백이 할당
	 				 					
				 		※ varchar2 <=> char 의 차이 예시
						 	varchar는 10의 기준을 주고 5만큼 썻다가 10을 쓸시 범위가 줄어들었다가 커졌다가 왔다갔다
						 	하며 속도가 달라지기 때문에 비효율적인면도 있다
						 	다만, char는 데이터 크기가 고정되있으므로 크기위 범위가 바뀌지 않고 고정이므로 속도가 더 빠름
						 	예로 들면 사원번호,주민번호가 있ㄷ.
						 	char에 주민번호 사용시 고정된 숫자이므로 varchar와 char를 크기가 같고 모두 쓰는 크기가 같더라도 
						 	고정하여 모두 쓰는 것은 char쓰는게 더 빠르다
	 	
	 	* date : 날자형 유형
	 				1/1000 초부터 초분시 일월년도 등과 같이 날짜 관련 데이터를 저장한다.
	 				ps) sysdate라는 내장형 데이터를 통해서 오늘 현재 시간의 날짜형 데이터를 입력할 수 있다.	
	 				ps) 오라클 clob, file 타입을 통해서 binary로 파일을 stream형식으로 전달해서 담을 수 있지만,
	 				실무적으로 낭비인 경우가 많다.
	 				일반적으로 파일서버를 따로 만들고, 해당 실제 파일을 해당 서버에 담고,
	 				파일 경로만 oracle의 varchar2로 저장한다.
	 				
	3) 테이블 선언과 활용

		* 테이블 선언
		create table 테이블명(
			컬럼1 데이터유형 [제약조건],
			컬럼2 데이터유형,
			컬럼3 데이터유형,
			컬럼4 데이터유형,
			컬럼5 데이터유형,
			...
		);			
		
			※ 기존에 생성된 테이블 기반으로 새 테이블 생성하기
				1. 구조+데이터(모두복사)
				create table 테이블명;
				select * from 테이블;
				
				2. 구조만 복사(데이터 외에 컬럼구조를 복사)
				create table 테이블명
				as select * from 테이블 where 1=0;
				여기서 1=0은, true = false
		 					
		 		3. 이름을 변경하거나 구조의 일부 등 특정한 것을 선택적으로 복사
		 		create table 테이블명
		 		as select empno no, job, //일부복사
		 			to_char(sal) salStr	//문자열(char)로 바꾸어 컬럼 지정
		 		from emp;
		 					
		 					
	4) 데이터 등록	 	
		전체 컬럼 등록
		insert 테이블명 values(데이터1, 데이터2 ...)
		특정 컬럼 등록(=지정하여 컬럼 등록)
		insert 테이블명(컬럼1,컬럼2)
			values(데이터1, 데이터2)
			
	5) 데이터 수정
		update 테이블명
			set 컬럼명 = 수정할데이터,
				컬럼명 = 수정할데이터
				...
			where 비교/논리연산자 조건.
			
	6) 데이터 삭제
		delete 
		from 테이블명
		where 비교/논리연산자 조건
		
 
 * */

SELECT * FROM emp;

--번호	이름	국어점수	영어점수	수학점수	student 테이블 생성 
CREATE TABLE student(
	NO number(3,0),
	name varchar2(50),
	kor number(3,0),
	eng number(3,0),
	math number(3,0)
);
SELECT * FROM student;
INSERT INTO student values(1,'홍길동',70,80,90);

--ex) 1. 물건정보를 넣는 테이블 product 생성
--	  2. 데이터 :물건번호(정수5자리), 물건명, 가격
CREATE TABLE product(
	prodno number(5,0),
	name varchar2(50),
	price number(50,0)
);
INSERT INTO product values(10000,'시계',80000);
INSERT INTO product values(10001,'모자',20000);
INSERT INTO product values(10002,'신발',70000);
SELECT * FROM product;

--사원정보 복사 테이블
CREATE TABLE emp01
AS SELECT * FROM emp;
SELECT * FROM emp01;

-- 복사 테이블은 제약조건은 복사되지 않는다.
-- 사원정보의 구조만 복사하는 테이블
CREATE TABLE emp02
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp02;

--ex) dept01(전체복사), dept02(구조만) 테이블을 만드세요
CREATE TABLE dept01
AS SELECT * FROM dept;
CREATE TABLE dept02
AS SELECT * FROM dept WHERE 1=0;
SELECT * FROM dept01;
SELECT * FROM dept02;

--사원정보 중에 급여가 2000~4000 사이이고, 사원번호 사원명 급여로 된 테이블 생성
--									no	name  sal
SELECT * FROM emp;
CREATE TABLE emp03
AS SELECT empno NO, ename name, sal		
FROM EMP e WHERE sal BETWEEN 2000 AND 4000;
