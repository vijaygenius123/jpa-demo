INSERT INTO "user" (username, email, password)
VALUES ('Vijay', 'vijay@gmail.com', 'password');
INSERT INTO project (name, start_date, manager_id)
VALUES ('Maniculus', NOW(), 0);
INSERT INTO task (project_id, name, assignee_id)
VALUES (0, 'Structural Plan', 0);
INSERT INTO task (project_id, name, assignee_id)
VALUES (0, 'Features Design', 0);