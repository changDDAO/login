package hello.login.domain.login;

import hello.login.web.member.Member;
import hello.login.web.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Member login(String loginId, String password) {
  /*      *//*Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member findMember = findMemberOptional.get();
        if (findMember.getPassword().equals(password)) {
            return findMember;*//*

    }
        return null;*/
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
