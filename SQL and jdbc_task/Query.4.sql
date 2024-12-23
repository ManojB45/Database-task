select * from empl;

/*  Write a query to display name job title and salary of the employee who don't have an manager */
select ename,job,sal
from empl
where mgr is null;