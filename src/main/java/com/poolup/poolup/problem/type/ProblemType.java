package com.poolup.poolup.problem.type;

import jakarta.persistence.Enumerated;

public enum ProblemType { // *** type이라는 속성명으로 되어있는데, ProblemType이라는 이름은 어떤가요? CloudERD에 수정 반영은 안했습니다.
    객관식, 주관식;

    @Override
    public String toString() {
        return name();
    }
}
