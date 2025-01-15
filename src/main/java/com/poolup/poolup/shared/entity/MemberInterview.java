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
public class MemberInterview extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String answer;
    private String strength;
    private String weakness;

    @ManyToOne @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne @JoinColumn(name = "interview_id")
    private Interview interview;

}
