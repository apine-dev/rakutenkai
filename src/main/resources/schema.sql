CREATE TABLE IF NOT EXISTS user(
    user_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Lan INT(2),
    Gen INT(1),
    Cont VARCHAR(100),
    Pic VARCHAR(100),
    Hob VARCHAR(100),
    Self VARCHAR(300),
    Age INT(2)
);

CREATE TABLE IF NOT EXISTS gender(
    gender_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    gender_cap VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS lang(
    lang_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    lang_cap VARCHAR(100)
);