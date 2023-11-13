package com.example.study.domain.review.entity;

import com.example.study.domain.mission.entity.MemberMission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private MemberMission memberMission;

    @Column(nullable = false)
    private int rating;

    @Column(length = 400)
    private String content;
}
