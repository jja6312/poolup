package com.poolup.poolup.shared.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.exam.entity.Exam;
import com.poolup.poolup.problem.entity.Problem;
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
public class ExamProblem extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long memberCheckedAnswer;
    private boolean bookmark;

    @ManyToOne @JoinColumn(name = "exam_id")
    private Exam exam;

    @ManyToOne @JoinColumn(name = "problem_id")
    private Problem problem;


}
