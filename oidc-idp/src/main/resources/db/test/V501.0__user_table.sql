INSERT INTO `user` VALUES
(1, 'c34a7c6e-0055-d5f7-7490-f634a1af5473', true, false, NOW(), NOW()),
(2, '5609b125-799d-e32f-2450-65f9140b1d17', true, false, NOW(), NOW()),
(3, 'c2bd2711-1c97-1989-4b8a-70f39e71b3a8', true, false, NOW(), NOW());

INSERT INTO user_credential VALUES
(1, 1, '$2a$10$SknPCgEKSWf6oH/3QgjAPOTrlssBReKxGEGzmAt4RRhRuNcrAR8FS', 0, NOW(), NOW(), NOW()),
(2, 2, '$2a$10$96y4xutmpid9rXqvXDKw7.2ygNQWQ1vqkAHWd/PvsKGgEAPr5UTC2', 0, NOW(), NOW(), NOW()),
(3, 3, '$2a$10$YW7J9SJalbBOMZN6T25JbOjg0TxwcFJcv6Mp/jgnd6rd7ECQNFaeW', 0, NOW(), NOW(), NOW());

INSERT INTO user_email VALUES
(1, 1, 'test1@example.com', NOW(), NOW()),
(2, 2, 'test2@example.com', NOW(), NOW()),
(3, 3, 'test3@example.com', NOW(), NOW());
