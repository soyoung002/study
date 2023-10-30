SELECT * FROM emp;
/*
 
 # where 조건문 처리
 	1. 행단위 데이터로 필터링하여 검색할 때 주로 사용된다.
 	2. where 조건절에는 컬럼명을 기준으로 
 		여러가지 비교연산식과 논리연산식을 처리한다.
 	3. 기본 형식
 		SELECT 컬럼, ...
 		FROM 테이블
 		WHERE 비교연산식 또는 논리연산식
 			1)비교연산식 : 
 				컬럼명 = 데이터(동등비교) 
 				==>주의!	데이터베이스는 동등비교 =로 사용, == (X) 
 				비교연산자 =,>,<,>=,<=!=,<>
 			2) 논리연산식
 				위 비교연산자와 함께 and, or, not
 				지원하는 연산 키워드 in between, exists 등
 				등 사용된다.
 				
 
  * */
-- 숫자형 데이터 비교
-- 	ex) 연봉이 2000이상 사원정보 출력
SELECT * --전체 데이터 선택
FROM emp
WHERE sal >= 2000;

-- 문자열 데이터 비교
-- ex) 사원명이 SALESMAN인 경우를 출력하세요.
SELECT *
FROM EMP 
WHERE job = 'SALESMAN';

--ex1) 관리자번호(mgr)이 7839인 사원명, 사원번호, 관리자 번호 출력
SELECT ENAME 사원명, EMPNO 사원번호, mgr 관리자번호
FROM EMP
WHERE mgr=7839

--ex2) 직책(job)이 'CLERK'인 사원번호, 직책명, 사원명을 출력하세요
SELECT EMPNO 사원번호, job 직책명, ENAME 사원명 
FROM EMP 
WHERE job='CLERK';

--ex3) 부서번호(deptno)가 10인 사원전체 정보를 출력
SELECT *
FROM emp
WHERE deptno=10;

-- 비교연산자 and 비교연산자 
-- 비교연산자 or 비교연산자 
-- not (비교연산자)
-- 부서번호가 10이고, 급여가 3000 미만인 사원을 출력(and)
SELECT *
FROM emp
WHERE DEPTNO = 10 AND SAL<3000;

-- ex4) 급여가 5000 이상이거나 관리자번호가 7782인 경우(or)
SELECT * FROM EMP 
WHERE SAL >=5000 OR mgr=7782

-- ex) 급여가 2000이상이고 직책이 MANAGER인 데이터를 출력
SELECT * FROM EMP 
WHERE SAL >=2000 AND JOB ='MANAGER'

-- ex) 부서번호가 30이거나 급여가 2000미만인 데이터 출력
SELECT * FROM EMP 
WHERE DEPTNO = 30 OR SAL<2000;
--ex) 직책이 'PRESIDENT'가 아닌 경우 출력
SELECT * FROM EMP  
WHERE JOB != 'PRESDENT' 