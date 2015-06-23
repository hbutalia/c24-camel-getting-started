create table IF NOT EXISTS purchase_order (
id char(36) primary key,
po_number varchar(30),
purchase_date timestamp,
shipping_date date,
delivery_time_slot time,
customer_name varchar(255),
address varchar(512),
shipper_name varchar(255),
per_ounce_rate decimal(8,2),
day_of_week varchar(100),
line_item_description varchar(1024),
per_unit_ounces decimal(8,2),
price double,
quantity int,
currency varchar(10),
processed boolean default 0
);
