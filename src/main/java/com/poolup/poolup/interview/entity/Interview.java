package com.poolup.poolup.interview.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.shared.entity.MemberInterview;
import com.poolup.poolup.shared.entity.MemberInterviewAction;
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
public class Interview extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String answer;

    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL, orphanRemoval = true)
    List<MemberInterview> memberInterviews;

    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL, orphanRemoval = true)
    List<MemberInterviewAction> memberInterviewActions;

}
