INSERT INTO "user" (id, username, email, password)
VALUES (0, 'Vijay', 'vijay@gmail.com', 'password');
INSERT INTO project (id, name, start_date, manager_id)
VALUES (0, 'Maniculus', NOW(), 0);
INSERT INTO task (project_id, name, assignee_id)
VALUES (0, 'Structural Plan', 0);
INSERT INTO task (project_id, name, assignee_id)
VALUES (0, 'Features Design', 0);