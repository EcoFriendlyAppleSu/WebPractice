package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberListControllerV1 {

  private MemberRepository memberRepository = MemberRepository.getInstance();

  @RequestMapping("/springmvc/v1/members")
  public ModelAndView process(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    List<Member> members = memberRepository.findAll();
    ModelAndView modelAndView = new ModelAndView("members");
    modelAndView.addObject("members", members);
    return modelAndView;
  }
}
