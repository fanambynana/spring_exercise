package com.spring_exercise.service;

import org.springframework.stereotype.Service;

@Service
public class PingService {
    public String doPing() {
        return "Pong";
    }
}
