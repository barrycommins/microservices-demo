package com.barrycommins;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
class Account {

    @Id
    @GeneratedValue
    Long id;

    @Column(unique = true)
    String email;

    @CreatedDate
    private Long createdAt;

    @LastModifiedDate
    private Long lastModified;
}
