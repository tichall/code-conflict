package kr.sparta.practiceconflict.service;

import kr.sparta.practiceconflict.entity.Member;
import kr.sparta.practiceconflict.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public String addMember(String name) {
        Member member = new Member(name);
        Member newMember = memberRepository.save(member);
        return newMember.getName();
    }
}
