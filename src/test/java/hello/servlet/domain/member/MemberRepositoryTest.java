package hello.servlet.domain.member;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Test
    public void memberSaveTest() throws Exception {

        Member member1 = new Member("Lee", 30);

        memberRepository.save(member1);
        Long member1Id = member1.getId();
        assertThat(memberRepository.findById(member1Id)).isEqualTo(member1);
    }

    @Test
    public void memberRepositoryAllMemberTest() throws Exception {
        Member member1 = new Member("Lee", 30);
        Member member2 = new Member("Lee", 33);

        memberRepository.save(member1);
        memberRepository.save(member2);

        List<Member> members = memberRepository.findAll();

        assertThat(members.size()).isEqualTo(2);
    }

    @Test
    public void memberClearTest() throws Exception {
        Member member2 = new Member("Lee", 33);

        memberRepository.save(member2);
        memberRepository.clearStore();

        assertThat(memberRepository.findAll().size()).isEqualTo(0);
    }
}
