package com.clone.insta.api.service.user;

import com.clone.insta.api.dto.user.UserDto;

public interface UserService {
    UserDto getUser(long id);
}
