CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE phone(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    phone VARCHAR(100) NOT NULL,
    user_id UUID,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);