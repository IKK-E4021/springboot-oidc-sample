INSERT INTO oauth2_client_redirect_uri
(oauth2_client_id, redirect_uri, created_at, updated_at)
VALUES
(1, 'http://test-sample.com', NOW(), NOW()),
(2, 'http://test-sample.com/callback', NOW(), NOW()),
(2, 'http://test2-sample.com', NOW(), NOW());