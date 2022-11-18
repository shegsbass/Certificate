package dev.shegs.Certificate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "full_Name")
    private String fullName;
    @Column(name = "email")
    private String email;
    private LocalDateTime generatedAt;

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", generatedAt=" + generatedAt +
                '}';
    }
}
