SELECT * FROM emp;

/* # where 조건문 키워드 검색
	1. 컬럼 like를 활용하면 비슷한 키워드로 검색을 할 수 있다.
	2. 기본형식
		1) where 컬럼명 like '%키워드%'
			키워드가 포함되면 검색 처리
		2) where 컬럼명 like '시작키워드%'
			해당 문자열로 시작되면 검색
		3) where 컬럼명 like '%키워드'
			해당 키워드로 끝나면 검색
		4) where 컬럼명 like '_A%'
			두번째 자리에 A가 포함되면 검색.
		5) where 컬럼명 like '__A__'
			전체 자리 수가 5자리이고,
			3번째 문자가 A이면 검색
			

**/ 
-- A가 포함되어 있는 사원명 검색
SELECT * FROM  EMP 
WHERE ename LIKE '%A%';

 
-- A가 포함되어 있는 사원명 검색
SELECT * FROM  EMP 
WHERE ename LIKE 'A%';

-- 앞에 뭐가오든 MAN가 포함되어 있는 사원명 검색
SELECT * FROM  EMP 
WHERE ename LIKE '%MAN';

-- 첫번째 자리가 뭐가오든 상관없음 두번째 자리에A가 포함 되는건
-- _A% -> _가 한개이고 A가 두번째 자리수므로
SELECT * FROM  EMP 
WHERE ename LIKE '_A%';

-- _____ => _ 5개임 이름이 5자리인사람
SELECT * FROM  EMP 
WHERE ename LIKE '_____';

-- __E__ => _ 2개 E _2개씩임.. => 직책이 중에 5글자이고 3번쨰 이름에 E가 들어가는 사람
SELECT * FROM  EMP 
WHERE job LIKE '__E__';


--ex) 앞에서 4,5번쨰 ES를 포함한 직책(job)이 있는 사원 정보
SELECT * FROM emp
WHERE job LIKE '___ES%';
--ex) 뒤에서 세번째 자리에 M이 포함된 직책 검색
SELECT * FROM emp
WHERE job LIKE '%M__';
--ex) 자리수가 5자리이고 중간에 I자가 포함된 사원명 검색
SELECT * FROM emp
WHERE ename LIKE '__I__';
 

 

 
 

