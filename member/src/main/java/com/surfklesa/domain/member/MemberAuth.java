package com.surfklesa.domain.member;

import lombok.Data;

@Data
public class MemberAuth {
    private Long uuid;
    private String authCode;

}
