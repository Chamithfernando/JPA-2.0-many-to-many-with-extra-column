package com.relationship.relationship.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employer_delivery_agent")
@IdClass(EmployerDeliveryAgentId.class)
public class EmployerDeliveryAgent {

    @Id
    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "id")
    private Employer employer;

    @Id
    @ManyToOne
    @JoinColumn(name = "delivery_agent_id", referencedColumnName = "id")
    private DeliveryAgent deliveryAgent;

    @Column(name = "is_project_lead")
    private boolean isProjectLead;

    @Column(name = "is_update_map")
    private boolean isUpdateDeliveryMap;
}
