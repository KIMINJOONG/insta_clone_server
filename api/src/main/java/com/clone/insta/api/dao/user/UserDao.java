package com.clone.insta.api.dao.user;

import com.clone.insta.api.entity.UserEntity;

public interface UserDao {
    UserEntity getUser(long id);
}
