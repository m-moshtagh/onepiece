package com.dogigiri.onepiece.data.model.entity;

import com.google.common.base.Objects;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, updatable = false, columnDefinition = "BIGINT")
    private Long id;
    @Column(name = "uuid", updatable = false, unique = true)
    private UUID uuid;

    @PrePersist
    private void generateUUID() {
        this.uuid = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equal(getId(), that.getId()) && Objects.equal(getUuid(), that.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getUuid());
    }
}

