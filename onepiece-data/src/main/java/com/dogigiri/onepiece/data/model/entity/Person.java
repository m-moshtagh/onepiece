package com.dogigiri.onepiece.data.model.entity;

import lombok.*;

import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Person extends BaseEntity {
    private String fullName;
    private String nickname;
    private int age;
    private Gender gender;

    @Builder(builderMethodName = "personBuilder")
    public Person(Long id, UUID uuid, String fullName, String nickname, int age, Gender gender) {
        super(id, uuid);
        this.fullName = fullName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
    }
}
