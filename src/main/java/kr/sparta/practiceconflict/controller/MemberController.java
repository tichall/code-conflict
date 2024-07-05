package kr.sparta.practiceconflict.controller;

import kr.sparta.practiceconflict.entity.Member;
import kr.sparta.practiceconflict.repository.MemberRepository;
import kr.sparta.practiceconflict.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @PostMapping("/members")
    public String addMember(@RequestParam String name) {
        String response = memberService.addMember(name);

        return response + "님, 가입을 환영합니다.";
    }
}
