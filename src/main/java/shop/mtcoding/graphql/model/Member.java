package shop.mtcoding.graphql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Table(name="member")
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_sn", nullable = false, precision = 15, scale = 0)
    private Long memberSn;

    @Column(name = "member_id", nullable = false, length = 100)
    private String memberId;
}