Delete p2 from Person
As p1 inner join Person As p2 on(p1.email=p2.email)
where p1.id<p2.id;