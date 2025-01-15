package com.poolup.poolup.subject.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.member.entity.Member;
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
public class InterestSubject extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private SubjectName subjectName;

    @ManyToOne @JoinColumn(name = "member_id")
    private Member member;
}
