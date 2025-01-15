package com.poolup.poolup.problem.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
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
public class AnswerChoice extends TimeStampEntity { // *** AnswerChoice라는 단어가 Problem에서 파생된 단어라고 직관적으로 안느껴지는데, MultipleChoiceProblem 은 어떤가요?
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String number; // ***number 라는 속성 명이 추상적으로 느껴지는데, optionNumber로 변경하는건 어떨까요?
    private String content;

    @ManyToOne @JoinColumn(name = "problem_id")
    private Problem problem;
}
