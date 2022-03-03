package com.surfklesa.api.controller;

import com.surfklesa.domain.member.MemberBaseInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiMainController {

    @GetMapping
    public MemberBaseInfo MemberTest() {
        return MemberBaseInfo.builder().userId("userId").name("testuser").build();
    }
}
