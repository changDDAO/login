package hello.login.web.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
}
