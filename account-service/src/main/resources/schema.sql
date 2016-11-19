DROP TABLE IF EXISTS account;

CREATE TABLE account
(
  id              BIGINT(20) PRIMARY KEY NOT NULL,
  created_at      BIGINT(20),
  last_modified   BIGINT(20),
  email         VARCHAR(255)
);