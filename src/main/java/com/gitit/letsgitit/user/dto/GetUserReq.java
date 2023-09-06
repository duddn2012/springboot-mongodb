package com.gitit.letsgitit.user.dto;

import com.gitit.letsgitit.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@RequiredArgsConstructor
public class GetUserReq {
    private ObjectId id;
    private String provider;
    private String providerId;

    public User toEntity(){
        return User.builder()
                .id(id)
                .provider(provider)
                .providerId(providerId).build();
    }
}
