package com.poolup.poolup.member.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.subject.type.SubjectName;
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
public class MemberExamStatistic extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long totalCount;
    private Long wrongCount;

    @Enumerated(EnumType.STRING)
    private SubjectName subjectName;

    @ManyToOne @JoinColumn(name = "member_id")
    private Member member;
}
