CREATE TABLE role (
	id SERIAL PRIMARY KEY,
	role VARCHAR(16) NOT NULL UNIQUE
);

INSERT INTO role VALUES (1, 'USER');
INSERT INTO role VALUES (2, 'ESTABLISHMENT');
INSERT INTO role VALUES (3, 'ADMIN');

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	name VARCHAR(64) NOT NULL,
	email VARCHAR(64),
	address VARCHAR(64),
	birth DATE,
	premium BOOLEAN DEFAULT false
);

CREATE TABLE category (
	id SERIAL PRIMARY KEY,
	category VARCHAR(32) NOT NULL UNIQUE
);

CREATE TABLE establishment (
	id SERIAL PRIMARY KEY,
	name VARCHAR(64) NOT NULL,
	category_id INTEGER REFERENCES category
		ON DELETE SET NULL ON UPDATE CASCADE,
	address VARCHAR(64),
	zone VARCHAR(32),
	city VARCHAR(32),
	email VARCHAR(64),
	contact VARCHAR(16),
	delivery BOOLEAN DEFAULT FALSE,
	avg_price INTEGER
);

CREATE TABLE credential (
	id SERIAL PRIMARY KEY,
	username VARCHAR(32) NOT NULL UNIQUE,
	password VARCHAR(64) NOT NULL,
	role_id INTEGER REFERENCES role 
		ON UPDATE CASCADE NOT NULL,
	users_id INTEGER REFERENCES users
		ON DELETE CASCADE ON UPDATE CASCADE,
	establishment_id INTEGER REFERENCES establishment
		ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE comment (
	id SERIAL PRIMARY KEY,
	establishment_id INTEGER REFERENCES establishment 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	commenter_id INTEGER REFERENCES users 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	time_posted TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	rating NUMERIC(1,0),
	comment VARCHAR(256)
);

CREATE TABLE comment_answer (
	id SERIAL PRIMARY KEY,
	comment_id INTEGER REFERENCES comment 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	time_posted TIMESTAMP DEFAULT CURRENT_TIMESTAMP
); 

CREATE TABLE meal (
	id SERIAL PRIMARY KEY,
	meal VARCHAR(32) NOT NULL,
	price INTEGER NOT NULL,
	establishment_id INTEGER REFERENCES establishment 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL
);

CREATE TABLE orders (
	id SERIAL PRIMARY KEY,
	users_id INTEGER REFERENCES users 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	state VARCHAR(16)
);

CREATE TABLE orders_meal (
	meal_id INTEGER REFERENCES meal 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	orders_id INTEGER REFERENCES orders 
		ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
	quantity INTEGER NOT NULL,
	PRIMARY KEY(meal_id, orders_id)
);

CREATE TABLE establishment_image (
	id SERIAL PRIMARY KEY,
	establishment_id INTEGER REFERENCES establishment
		ON DELETE SET NULL ON UPDATE CASCADE,
	extension VARCHAR(8) NOT NULL,
	profile BOOLEAN NOT NULL
);
