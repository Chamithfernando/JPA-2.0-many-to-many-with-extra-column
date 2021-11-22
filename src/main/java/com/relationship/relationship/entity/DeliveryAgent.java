package com.relationship.relationship.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class DeliveryAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "deliveryAgent")
    private List<EmployerDeliveryAgent> employerAssoc;
}
