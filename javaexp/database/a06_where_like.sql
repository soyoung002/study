SELECT * FROM emp;

/* # 데이터의 정렬처리
	1. sql 명령문에서 검색된 결과는 테이블에 데이터가 입력된 순서로 일반적으로 출력된다.
	2. 데이터의 출력 순서를 특정 컬럼을 기준으로 오름차순/내림차순으로 정렬하는 경우가 발생한다.
	3. 여러 개의 컬럼에 대해 정렬 순서를 지정해서 처리해야 할 경우
		1차로 컬럼명 정렬옵션, 2차로 컬럼명 정렬옵션으로 오름차순/내림차순 처리한다.
	4. 기본적인 정렬 방법
		1) 문자값을 알파벳순으로 출력되고, 한글은 가나다라 순으로 출력된다(오름차순)
		2) 숫자값은 가장 작은 값으로부터 점점 더 큰 값으로 정렬된다(오름차순)
		위 내용에 반대되는 형식을 내림차순이라 한다.
	5. 기본형식(코드)
	select
	from 테이블명
	where 조건문처리		
	order by 컬럼명 [asc|desc], 컬럼2 [asc|desc\]
	asc : 모든 정렬은 오름차순이 default이다.
			즉, 옵션을 정하지 않으면 오름차순
			ex) order by 컬럽1 desc, 컬럼 2
	desc : 역순/내림차순 정렬
		   내림차순을 처리할 때는 컬럼명 desc라고 명시적으로 선언하여야 한다.
**/ 
-- 사원번호 기준으로 오름차순
SELECT * FROM  EMP 
ORDER BY empno;

 
-- 사원번호 기준으로 내림차순
SELECT * FROM  EMP 
ORDER BY empno DESC;

--ex) 연봉이 가장 높은 사람으로부터 가장 낮은 사람순으로 급여와 이름을 출력하세요
-- 높은것부터 낮은것으로...-> 내림차순
SELECT SAL 급여, ENAME 이름
FROM  EMP 
ORDER BY SAL DESC;

--ex) 입사일을 기준으로 최근에 입사한 사람으로부터 가장 먼저 입사한 사람 순으로 입사일과 사원명을 출력하세요
SELECT hiredate 입사일, ENAME 이름
FROM  EMP 
ORDER BY hiredate DESC;


--[1단계:확인] 8. 사원정보를 정렬하여 출력하되 부서번호(deptno)를 1차(오름차순)로 급여(sal) 2차(내림차순)으로 부서번호, 급여, 사원명을 출력하세요.
SELECT DEPTNO 부서번호, SAL 급여, ENAME 사원명
FROM EMP
ORDER BY DEPTNO, SAL DESC;
-- ORDER BY 1차정렬, 2차정렬, 3차정렬... => 모두 오름차순
-- ORDER BY 1차정렬, 2차정렬 DESC;		=> 1차 오름, 2차 내림차순이 됨.

