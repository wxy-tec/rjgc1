
--���ݿ���Ľ׶����
--�����������ͳ����볡����ֱ������һ����users�п���������
--�Ѿ��ǵ���Σ������θ�����
--�Ѿ��ǵ��ߴθ����� 
--�ڰ˴�
--�ھŴ�  ��������
--�û���Ϣ��   
--���ݿ��С����

 
--1��password��Ϊstring
--
--2��ʱ���Ϊdatetime
--3��parkid��ΪĬ�ϵ���
create table users
(  
	cardid int primary key ,
	name nvarchar(20) not null,
	password nvarchar(20),
	cardtype nvarchar(20),
	userstype nvarchar(20),
	carid int,
	tel int,
	overage int
)




--��λ��Ϣ��
create table sit_infor
(  
	stationid int primary key,
	stationtype nvarchar(20) not null
)



--ͣ�����շѱ�
create table charger
(  
	cardtype nvarchar(6),
	stationtype nvarchar(20) not null,
	charge int,
	primary key (cardtype,stationtype)
)



--park
create table park
(
	cardid int foreign key references users(cardid),	
	stationid int foreign key references sit_infor(stationid),
	parkid int primary key identity(1,1),
	startpark datetime,
	stationtype nvarchar(20),
	endpark datetime,
	sumpark int,
	fee int
)	
