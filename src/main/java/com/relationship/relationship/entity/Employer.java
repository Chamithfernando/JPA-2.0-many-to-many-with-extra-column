package com.relationship.relationship.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "employer")
    private List<EmployerDeliveryAgent> deliveryAgentAssoc;

    // other properties and getters and setters generated from lombok

}
