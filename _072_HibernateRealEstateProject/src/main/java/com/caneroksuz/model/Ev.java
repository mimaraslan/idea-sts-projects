package com.caneroksuz.model;

import com.caneroksuz.model.enums.EEvStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Ev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "yapim_yili")
    private LocalDate yapimYili;

    private String tur;
    private int kat;
    private String semt;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EEvStatus durum =EEvStatus.MUSAIT;

/*
    @ToString.Exclude
    @OneToMany(mappedBy = "ev", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Kiralama> kiralamaList;
    */
}
