package com.silveryark.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class Randoms {
    public String randomAlphanumeric(int count){
        return RandomStringUtils.randomAlphanumeric(count);
    }
}
