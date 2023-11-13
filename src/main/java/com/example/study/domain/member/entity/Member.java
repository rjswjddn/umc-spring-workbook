package com.example.study.domain.member.entity;

import com.example.study.domain.mission.entity.MemberMission;
import com.example.study.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    private String birthDate;

    @Column(nullable = false, length = 40)
    private String address;

    private Long point;

    @OneToOne(fetch = FetchType.LAZY)
    private MissionCount missionCount;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<PreferFood> preferFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}
