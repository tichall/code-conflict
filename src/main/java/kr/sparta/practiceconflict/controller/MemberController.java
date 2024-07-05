package kr.sparta.practiceconflict.controller;

import kr.sparta.practiceconflict.repository.MemberRepository;
import kr.sparta.practiceconflict.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/members")
    public String addMember(@RequestParam String name) {
        String response = memberService.addMember(name);

        return response + "님, 가입을 환영합니다.";
    }
}
