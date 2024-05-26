use coforgedata;

call coforgedata.getBookDesc();

call coforgedata.getBookDesc_param(103);

-- Not working...still asking to enter param
call coforgedata.getBookDesc_default_param();

create table books(bid int, btout_param_sqrtout_param_sqrtitle varchar(50));
insert into books (bid, btitle) values('101', 'Good Thoughts'), ('102', 'The Outsider'), ('103', 'The Giver');
select * from books;
create table bookdescription(bid int, btitle varchar(300)); 
alter table bookdescription rename column btitle to bdetails; 
select * from bookdescription;
insert into bookdescription(bid,bdetails) values(101,'This book is informative'),(102,'This is a story book'), ('103', 'This is a Novel') 
