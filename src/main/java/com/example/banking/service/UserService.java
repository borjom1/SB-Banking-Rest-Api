package com.example.banking.service;

import com.example.banking.dto.RegisterRequest;
import com.example.banking.dto.UserInfo;

import java.util.Map;

public interface UserService {
    void register(RegisterRequest request);

    Map<String, String> verifyUser(String phoneNumber, String password);

    Map<String, String> getTokens(String refreshToken);

    void logout(String refreshToken);

    UserInfo getUserInfo(Integer userId);
}