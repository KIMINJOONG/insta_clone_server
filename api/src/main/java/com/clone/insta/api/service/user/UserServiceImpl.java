package com.clone.insta.api.service.user;

import com.clone.insta.api.dao.user.UserDao;
import com.clone.insta.api.dto.user.UserDto;
import com.clone.insta.api.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserDto getUser(long id) {
        UserEntity userEntity = userDao.getUser(id);

        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName()).build();
    }
}
