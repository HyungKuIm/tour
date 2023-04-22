-- accommodation
insert into accommodation (accom_code, accom_name, accom_tel)
values (accom_seq.nextval, '롯데시티호텔 구로', '02-4760-1122');
insert into accommodation (accom_code, accom_name, accom_tel)
values (accom_seq.nextval, '코코모 호텔', '02-4762-3322');
insert into accommodation (accom_code, accom_name, accom_tel)
values (accom_seq.nextval, '라마다 서울 신도림', '02-4533-2233');
insert into accommodation (accom_code, accom_name, accom_tel)
values (accom_seq.nextval, '신라스테이 구로', '02-4112-3355');

-- customer
insert into customer
	(customer_code, customer_name, customer_pass, customer_birth, customer_job, customer_mail,
		customer_tel, customer_post, customer_add, role)
values (customer_seq.nextval, '심재학', '$2y$10$..2GAO4FsaEzJigGd.IGd.grzacG/TMgejpnNcY9XygNGemVOEt2i', '2016-08-15', '회사원', 'sim@naver.com',
	'010-', '12345', '경기도 고양시', 'ROLE_USER');
	
insert into customer
	(customer_code, customer_name, customer_pass, customer_birth, customer_job, customer_mail,
		customer_tel, customer_post, customer_add, role)
values (customer_seq.nextval, '박찬호', '$2y$10$..2GAO4FsaEzJigGd.IGd.grzacG/TMgejpnNcY9XygNGemVOEt2i', '1985-02-10', '방송인', 'chanhopark@naver.com',
	'010-', '12345', '경기도 고양시', 'ROLE_USER');
	
insert into customer
	(customer_code, customer_name, customer_pass, customer_birth, customer_job, customer_mail,
		customer_tel, customer_post, customer_add, role)
values (customer_seq.nextval, 'admin', '$2y$10$..2GAO4FsaEzJigGd.IGd.grzacG/TMgejpnNcY9XygNGemVOEt2i', '1985-02-10', '관리자', 'admin@naver.com',
	'010-', '12345', '경기도 고양시', 'ROLE_ADMIN');
	
	
-- tourinfo
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '괌 자유여행', 4, 
		to_date('2023-04-24', 'YYYY-MM-DD'),
		800000, '임형구', '괌에서 가장 유명하고, 가장 많은 손님들이 선택한 워터파크 리조트 입니다. 7개의 레스토랑에서 다양한 식사를 즐기실 수 있고 아이들은 키즈클럽과 리틀키즈 클럽에서 클럽메이트와 즐거운 추억을 쌓을 수 있습니다.',
		1);
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '괌 5일', 5, 
		to_date('2023-04-24', 'YYYY-MM-DD'),
		1380000, '임형구', '두 컨셉의 호텔을 같이 즐기는 상품. 내가 골라서 내가 반한 괌 ♡ 다양한 컨셉을 즐기느라 만족도가 두배 .',
		2);
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '괌 자유여행 6일', 4, 
		to_date('2023-04-24', 'YYYY-MM-DD'),
		600000, '임형구', '항공+호텔+왕복공항셔틀+여행자보험이 포함된 괌 자유여행 상품입니다.',
		1);
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '괌 4~6일 #츠바키타워 #6성급 #괌최신상호텔 #인피니티풀', 4, 
		to_date('2023-04-24', 'YYYY-MM-DD'),
		800000, '임형구', '2020년 새롭게 오픈한 괌 최초 6성급 호텔로, 태평양의 환상적인 뷰를 감상할 수 있는 전객실 오션뷰를 자랑하는 괌 최고의 럭셔리 호텔입니다.',
		3);
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '괌 4~6일 #두짓비치리조트 #투몬시내중심 #레노베이션', 4, 
		to_date('2023-04-24', 'YYYY-MM-DD'),
		800000, '임형구', '괌의 모든 시설을 편리하게 즐길 수 있는 시내 중심에 위치하고 있으며, 2021년 레노베이션을 진행하여 깔끔한 시설을 자랑합니다. 두짓타니 리조트의 시설을 함께 이용 가능합니다.',
		4);	
		
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '규슈 3~4일 #100%출발확정', 4, 
		to_date('2023-04-29', 'YYYY-MM-DD'),
		550000, '임창용', '',
		1);
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '규슈 3~4일 #홈쇼핑따라잡기', 4, 
		to_date('2023-04-29', 'YYYY-MM-DD'),
		660000, '임창용', '핵심관광을 포함해 다양한 온천을 테마로 하는 규슈지역 홈쇼핑방송 따라잡기 상품입니다.',
		1);		
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '규슈/우레시노온천/아소온천 3~4일 #베스트셀러', 4, 
		to_date('2023-04-29', 'YYYY-MM-DD'),
		900000, '임창용', '매끄러운 온천수 덕분에 이곳에서 온천을 하면 미인이 된다는 유래가 있는 우레시노는 미인온천으로 유명한 곳 입니다. 고즈넉한 일본 감성이 넘치는 우레시노 마을은 특히 현지인들에게도 사랑받는 곳 입니다.',
		1);		
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '규슈 3~4일 #열차여행 #온천여행 #알찬일정', 4, 
		to_date('2023-04-29', 'YYYY-MM-DD'),
		750000, '임창용', '규슈의 핵심 관광지를 두루 돌아보며 호텔에서 온천욕을 즐기고, 기차를 탑승해볼 수 있는 특별한 경험을 할 수 있습니다. 관광과 힐링, 이 두 가지를 모두 만족시킬 수 있는 상품입니다. 가족동반 고객분들에게 추천 드립니다.',
		1);		
insert into tourinfo(tour_code, tour_name, tour_days, dep_day,
	base_price, conductor, tour_abs, accom_code)
values 
	(tourinfo_seq.nextval, '_규슈/구마모토 3~4일', 4, 
		to_date('2023-04-29', 'YYYY-MM-DD'),
		690000, null, '구마모토공항을 왕복으로 이용하면서 더 편안한 동선으로 즐길 수 있는 북규슈 여행상품입니다.',
		1);																		
				
--reserve
insert into reserve(reserve_no, reserve_day, 
	adult_count, child_count, tour_code, customer_code,
	sum_price, remarks)
values (reserve_seq.nextval, sysdate, 
	4, 0, 1, 1, 3200000, '잘 부탁드립니다');
	
insert into reserve(reserve_no, reserve_day, 
	adult_count, child_count, tour_code, customer_code,
	sum_price, remarks)
values (reserve_seq.nextval, sysdate, 
	1, 2, 2, 2, 1000000, '좋은 여행 시켜주셔서 감사합니다.');
	
insert into reserve(reserve_no, reserve_day, 
	adult_count, child_count, tour_code, customer_code,
	sum_price, remarks)
values (reserve_seq.nextval, sysdate, 
	1, 0, 2, 2, 2000000, '추가로 1명 더가는데요.. 잘 부탁드려요');
	
insert into reserve(reserve_no, reserve_day, 
	adult_count, child_count, tour_code, customer_code,
	sum_price, remarks)
values (reserve_seq.nextval, sysdate, 
	2, 0, 6, 3, 2000000, '결혼기념일에 가는 여행이라 신경좀 써주세요. 부탁드려요');
	
insert into reserve(reserve_no, reserve_day, 
	adult_count, child_count, tour_code, customer_code,
	sum_price, remarks)
values (reserve_seq.nextval, sysdate, 
	2, 0, 7, 3, 3000000, '');				
	 















	
