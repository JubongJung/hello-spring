package hello.hellospring.Controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 객체 생성 후 스프링 컨테이너에 담아두고 관리
public class MemberController {
    private final MemberService memberService;

    @Autowired // Controller와 Service 연결 MemberController가 생성 될 때 Spring Bean의 Member Service를 주입해줌 (DI)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
