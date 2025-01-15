package com.poolup.poolup.shared.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.interview.entity.Interview;
import com.poolup.poolup.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberInterviewAction extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long likeCount; // *** like가 mysql의 예약어라 속성 이름으로 등록할 수 없음. => likeCount로 변경
    private String comment;

    @ManyToOne @JoinColumn(name = "interview_id")
    private Interview interview;

    @ManyToOne @JoinColumn(name = "member_id")
    private Member member;

}
