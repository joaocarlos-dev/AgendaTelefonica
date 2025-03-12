CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE users(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthDate DATE NOT NULL,
    email VARCHAR(70)
);

