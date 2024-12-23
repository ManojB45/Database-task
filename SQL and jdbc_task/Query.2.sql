select * from empl;

/*Write a query to display details of employee who are not getting Commission*/

select ename
from empl
where comm is  null;