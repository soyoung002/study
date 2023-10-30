SELECT * FROM emp;
/*
 
 # 기타 비교/논리연산 처리 구문
 1. 컬럼 in( 데이터1, 데이터2 ... )
 	해당 컬럼에 or 조건으로 데이터가 있을 경우를 지칭한다.
 	==> '컬럼 = 데이터1 or 컬럼 = 데이터2 or 컬렁 = 데이터3...'과 같다
 	subquery로도 사용할 때가 많다.
	 	where sal in (select max(sal) from emp)
	 	급여가 가장 높은 사원을 출력시 사용..
 	컴럼명 between a and : a와 b 포함한 사이
 	==> '컬럼명 >= a and 컬럼명<=b' 와 같은 말
 2. not, !=, <> 해당 조건이 아닐 때
 3. 컬럼 = null	==> 컬럼 = null'처리
	 	문자열 자동형 변환이라는 기능을 포함하고 있기 때문에,
	 	위 내용을 문자열로 인식해서 처리 = (비교연삭식에서는 문자열 비교를 처리)
 	컬럼명 is null	==> 실제 데이터가 없는 null인 경우
	컬럼명 is not null	==>실제 데이터가 있는 경우
	ps) null : 데이터자체가 할당되지 않음
		'null' 문자열 : 'null'이 할당되어 있는 경	

	  * */
SELECT * FROM emp;
--사원번호가 7369, 7499, 7521인 경우 데이터 조회
SELECT * FROM emp;
WHERE empno in(7369,7499,7521);

SELECT *
FROM emp
WHERE sal BETWEEN 2000 AND 3000;
-- ==> 'sal >= 2000 and sal <= 3000'과 같은 것임
 
SELECT ename,comm
FROM emp
WHERE comm = NULL; -- 컬럼 = NULL   'null' 변환]

SELECT ename, comm
from emp
WHERE comm IS NULL;

SELECT ename, comm
from emp
WHERE comm IS NOT NULL;

--ex) 부서번호가 10,30인 경우 사원 정보를 출력
SELECT *
FROM EMP 
WHERE DEPTNO IN(10,30)

--ex) comm이 null이 아닌 경우 사원번호, 급여+보너스 합산을 출력하세요
SELECT empno, sal + comm "급여+보너스"
FROM EMP 
WHERE comm IS NOT NULL;
