//package shop.mtcoding.graphql.resolver;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import shop.mtcoding.graphql.model.Member;
//import shop.mtcoding.graphql.model.MemberRepository;
//
//@RequiredArgsConstructor
//@Component
//@Transactional(rollbackFor = Exception.class)
//public class MemberMutationResolver implements GraphQLMutationResolver {
//
//    private final MemberRepository memberRepository;
//
//    /**
//     * Save One Member Data
//     * GraphQL Schema Mutation : createMember(saveMemberInfo: SaveMember!): Member!
//     * @param member
//     * @return Member
//     */
//    public Member createMember(Member member) {
//        return this.memberRepository.save(member);
//    }
//
//    public boolean deleteMemberBySn(final Long memberSn) {
//        if (memberSn <= 0)  return false;
//
//        Member member = this.memberRepository.findById(memberSn).orElse(null);
//        if (member == null) return false;
//
//        this.memberRepository.deleteById(memberSn);
//        return true;
//    }
//}