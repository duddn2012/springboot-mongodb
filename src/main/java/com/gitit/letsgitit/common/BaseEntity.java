package com.gitit.letsgitit.common;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

public class BaseEntity {
    @CreatedDate
    @Field(name="created_at")
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Field(name="updated_at")
    private LocalDateTime updatedAt;
}
