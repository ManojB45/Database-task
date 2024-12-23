select * from empl;

/* Write a query to display employee name and salary of those employees 
who don't have their salary in the range of 2500 to 4000    */

select ename,sal
from empl
where sal>2500 and sal<4000;