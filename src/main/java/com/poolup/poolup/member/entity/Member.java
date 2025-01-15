package com.poolup.poolup.member.entity;

import com.poolup.poolup.card.entity.MemberGameResult;
import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.exam.entity.Exam;
import com.poolup.poolup.shared.entity.MemberInterview;
import com.poolup.poolup.shared.entity.MemberInterviewAction;
import com.poolup.poolup.subject.entity.InterestSubject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;
    private String authProvider;
    private String providerId;
    private String profileImageUrl;

    @OneToOne(mappedBy = "member")
    private MemberGameResult memberGameResult;

    // *** 일관되게 작성한 사항은 아래와 같음. (따라서 변경이 필요할 수 있음.)
    // <상세>
    // 1. 테이블관계 : ...cascade = CascadeType.ALL, orphanRemoval = true
    // 2. 여러 객체는 List로 통일
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InterestSubject> interestSubjects;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberInterview> MemberInterviews;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberInterviewAction> memberInterviewActions;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberExamStatistic> memberExamStatistics;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exam> exams;


}
