DROP TABLE IF EXISTS account;

CREATE TABLE account
(
  id              BIGINT(20) PRIMARY KEY NOT NULL,
  created_at      BIGINT(20),
  last_modified   BIGINT(20),
  account_number  VARCHAR(255),
  default_account BIT(1),
  user_id         VARCHAR(255)
);