package com.poolup.poolup.card.entity;

import com.poolup.poolup.common.entity.TimeStampEntity;
import com.poolup.poolup.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGameResult extends TimeStampEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long winCount;
    private Long totalCount;

    @OneToOne @JoinColumn(name = "member_id")
    private Member member;
}
