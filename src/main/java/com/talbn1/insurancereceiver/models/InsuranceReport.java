package com.talbn1.insurancereceiver.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author talbn on 8/26/2020
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Entity
@Table(name = "REPORT")
public class InsuranceReport implements Serializable {

    @Column(name = "messageId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;
    private String customerName;

    private String freeText;

    @Enumerated(EnumType.STRING)
    private InsuranceType type;

    @Enumerated(EnumType.STRING)
    private InsuranceStatus status;

}
