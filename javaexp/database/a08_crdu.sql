/*

crdu : 기초
		
 # 데이터베이스에서 cCRUD란..
 1. C : create 즉, 테이블을 생성하는 명령어이며 또한 데이터를 입력할 때도 사용되는 것
 		테이블에 데이터를 입력할 때 해당 데이터를 생성하는 것과 같은 효과를 가지기 때문입니다.
 
 		- 기본 구분으로 전체 컬럼에 입력할 때(=기본적으로 테이블에 데이터를 입력할 때는 `insert into`)
 		
	 		insert into 테이블명 values(데이터1, 데이터2 ...);
	 		
	 		해당 테이블에 포함된 컬럼의 순서에 맞게 데이터를 입력하는 것을 말한다.
	 		`테이블명`은 입력할 데이터가 저장될 테이블의 이름을 의미합니다. 
	 		`데이터1`, `데이터2`는 입력할 데이터를 의미
 		 
 		- insert into 테이블명(입력할 컬럼1, 컬럼2, 컬럼3)
 		
 		`insert into` 명령어를 사용할 때는 `values()` 함수를 사용하여 데이터를 입력합니다. 
		`values()` 함수는 다음과 같은 형식을 가지고 있습니다.
			values(데이터1, 데이터2 ...);
 			
 

 * */
SELECT * FROM emp01;
SELECT sysdate 오늘날짜, 1+2 합산 FROM dual;
-- sysdate : 현재 날짜와 시간을 가져오는 키워드
--			오라클 내장객체
--dual : 하나의 데이터를 확인할 때 사용하는 오라클의 내장된 테이블

INSERT INTO emp01 values(1000, '홍길동','사원',7780,sysdate,4000,100,10);
SELECT * FROM emp01;

--ex) emp01에 위와 같이 1001 사원번호로 시원정보를 입력하세요. 사원명(10byte), 직책(9byte)
--		내 입력 - 주의
SELECT *FROM emp01;
INSERT INTO emp01 values(1001, '마길동', '대리', 7902, sysdate, 400, 1000, 20);

SELECT *FROM emp01;
INSERT INTO emp01(empno, ename, sal)
values(1002,'오길동',5000);
--지정되지 않는 컬럼의 데이터는 null(데이터없음)으로 처리된다.

--ex)emp02 사원번호, 직책, 입사일, 급여, 부서번호를 입력하세요.
SELECT * FROM emp02;
INSERT INTO emp02 valuse(empno,job,hiredate,sal,deptno)
values(1003,'사원',sysdate,3000,3);

/*
 # 수정 기본 형식
 1. update 테이블
 	set 컬럼명1 = 수정할데이터, 
 	set 컬럼명2 = 수정할데이터 
 	where 조건(비교/논리)
 2. 위 형식으로 특정테이블에 조건으로 특정 컬럼의 데이터를 수정한다.
 

 *  * */

