package com.example.finalyearproject.mapper;

import com.example.finalyearproject.model.User;
import com.example.finalyearproject.rest.dto.UserDto;

public interface UserMapper {
    UserDto toUserDto(User user);
}
