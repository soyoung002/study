 SELECT * FROM emp; --ctrl + enter
 /*
  # 데이터의 산술연산자와 문자열 연결처리
  	1. 컬럼의 타입이 숫자이면 연산( +,-,*, / 사칙연산 )이 처리됨.
  	2. 컬럼괌 문자열을 연결하여 출력할 때는, 
  		
  		컬럼1||컬럼2
  		문자열||문자열
  		
  		형식으로 처리한다.
  	3. 문자열타입 데이터 '문자열데이터'로만 사용한다. 
  		==> "" (X)


--emp : 사원정보 테이블
--empno(사원번호)
--ename(사원명)
--job(직책)
--mgr(관리자번호)
--hiredate(입사일)
--sal(급여/연봉)
--comm(보너스)
--deptno(부서번호)


  	*/
 SELECT sal, sal*2 두배, sal+10 "+10"
 FROM emp;
SELECT empno, deptno, empno+deptno 컬럼간연산
FROM emp;
SELECT ename, ename||'님 입니다' 사원명소개
FROM emp;
-- 주의!) 데이터베이스에서는 +를 통해 문자열 연결하지 않고,
--		||를 통해 처리된다.
SELECT ename, empno, ename||empno 사원명과사원번호
FROM emp;

--ex1) 각 사원의 급여의 3배를 사원명과 함께 출력하세요
SELECT ename 사원명, sal*3 "상여(급여3배)"
FROM emp;

--ex2)사원번호와 사원명,급여+보너스
--		nvl(컬럼명,데이터가 null 초기값)
--	null vs ' '(공백), 0(default)차이
--  null은 데이터가 비어있는 상태
-- 1000 + null ==> null
-- nvl(숫자, 0), nvl(문자열, '  ')
SELECT empno 사원명,ename,sal,comm, sal+comm "급여+보너스",
		sal+nvl(comm,0) "급여+보너스(0)"
FROM emp;

--ex)사원명+부서번호, 사원번호+사원명, 입사일 출력

SELECT ename||'-'||empno "사원명과부서번호",
		empno||'-'||ename "사원번호와사원명",
		hiredate "입사일"
FROM emp;

--ex) @@@사원의 급여는 @@@이고, 부서번호는 @@입니다.
SELECT ename||'사원의 급여는' 사원명,
 sal||'이고 부서 번호는' 급여,
 empno||'입니다' 부서번호
FROM emp;


--ex) @@@사원의 급여는 @@@이고, 부서번호는 @@입니다.
SELECT ename||'사원의 급여는 '||sal||'이고 부서번호는 '||deptno||'입니다.' show
FROM emp;


/*
1. 동일하 데이터의 중복 제거 
 SELECT DISTINECT
 */
-- 기본적으로 다른 컬럼과 연결됨
SELECT deptno
FROM emp;
--2.중복되지 않는 데이터를 출력하기 위해서는 distinct를 사용한다
SELECT DISTINCT deptno
FROM emp;

--중복
SELECT deptno, mgr
FROM emp;

--위의 중복 걸러내는 처리
--distinct 컬럼1, 컬럼2 : 컬럽1, 컬럼2를 합쳐서 같은 데이터 삭제
SELECT DISTINCT deptno, mgr
FROM emp;

--ex1) job을 중복되지 않게 출력
SELECT DISTINCT job
FROM emp;
--ex2) 관리자번호(mgr)를 중복되지 않게 출력
SELECT DISTINCT mgr
FROM emp;


