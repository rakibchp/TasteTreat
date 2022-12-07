package com.inn.cafe.com.inn.cafe.serviceImpl;

import com.inn.cafe.com.inn.cafe.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {

    }

    private boolean validateSignUpMap(Map<String, String> requestMap){
        requestMap.containsKey("name")&&requestMap.containsKey("contactNumber")
                &&requestMap.containsKey("")

    }
}
