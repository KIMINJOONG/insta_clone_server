package com.clone.insta.api.dao.user;

import com.clone.insta.api.entity.UserEntity;
import com.clone.insta.api.repositary.UserRepositary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao{

    private final UserRepositary userRepositary;

    @Override
    public UserEntity getUser(long id) {
        return userRepositary.getById(id);
    }
}
