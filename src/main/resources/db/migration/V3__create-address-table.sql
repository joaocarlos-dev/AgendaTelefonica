CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE address(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY NOT NULL,
    city VARCHAR(80),
    country VARCHAR(60),
    uf VARCHAR(4),
    street VARCHAR(120),
    number VARCHAR(12),
    user_id UUID,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);