package com.poolup.poolup.problem.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.exam.entity.Exam;
import com.poolup.poolup.problem.type.ProblemType;
import com.poolup.poolup.shared.entity.ExamProblem;
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
public class Problem extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String answer;

    @Enumerated(EnumType.STRING)
    private ProblemType problemType;

    @OneToMany(mappedBy = "problem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExamProblem> examProblems;

    @OneToMany(mappedBy = "problem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnswerChoice> answerChoices;
}
