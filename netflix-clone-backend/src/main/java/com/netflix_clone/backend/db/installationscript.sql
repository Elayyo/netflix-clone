DROP TABLE users;
DROP TABLE profiles;

CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       firstname VARCHAR(45) NOT NULL,
                       lastname VARCHAR(45) NOT NULL,
                       email VARCHAR(100) NOT NULL,
                       password VARCHAR(150) NOT NULL
);

CREATE TABLE profiles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    user_id INT,
        FOREIGN KEY (user_id) REFERENCES users(id) ON UPDATE RESTRICT ON DELETE CASCADE
);