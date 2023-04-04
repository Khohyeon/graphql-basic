//package shop.mtcoding.graphql.resolver;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import shop.mtcoding.graphql.model.Member;
//import shop.mtcoding.graphql.model.MemberRepository;
//
//
//@RequiredArgsConstructor
//@Component
//@Transactional(readOnly = true)
//public class MemberQueryResolver implements GraphQLQueryResolver {
//
//    private final MemberRepository memberRepository;
//
//    /**
//     * Get One Member Data
//     * GraphQL Schema Query : member(memberSn: Int!): Member!
//     * @param memberSn
//     * @return
//     */
//    public Member getMemberBySn(final long memberSn) {
//        if (memberSn <= 0)  return null;
//
//        return this.memberRepository
//                .findById(memberSn)
//                .orElse(null);
//    }
//}