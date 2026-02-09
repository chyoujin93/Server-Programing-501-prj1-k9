package com.busanit501.jsp_server_project1.service;

import com.busanit501.jsp_server_project1._0209_todo.dto._0209_18_MemberDTO;
import com.busanit501.jsp_server_project1._0209_todo.service._0209_21_MemberService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Log4j2
public class _0209_22_MemberServiceTests {

    private _0209_21_MemberService memberService;

    @BeforeEach
    public void ready() {
        memberService = _0209_21_MemberService.INSTANCE;
    }

    @Test
    public void testLogin() throws Exception {
        String mid = "lsy";
        String mpw = "1234";

        _0209_18_MemberDTO memberDTO = memberService.login(mid,mpw);
        log.info("멤버 서비스 로그인 테스트 memberDTO: " + memberDTO);

    }
}
