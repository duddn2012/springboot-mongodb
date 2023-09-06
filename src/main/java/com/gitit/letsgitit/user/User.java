package com.gitit.letsgitit.user;

import com.gitit.letsgitit.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    @Id
    private ObjectId id;
    private String provider;
    @Field(name="provider_id")
    private String providerId;

    @Builder
    public User(ObjectId id, String provider, String providerId){
        this.id = id;
        this.provider = provider;
        this.providerId = providerId;
    }
}