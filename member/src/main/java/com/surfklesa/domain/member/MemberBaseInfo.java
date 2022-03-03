package com.surfklesa.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder
@AllArgsConstructor
public class MemberBaseInfo {
    @Id
    private Long uuid;
    private String userId;
    private String name;

}
