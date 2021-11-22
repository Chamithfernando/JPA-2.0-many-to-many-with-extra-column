package com.relationship.relationship.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployerDeliveryAgentId implements Serializable {

    private int employer;
    private int deliveryAgent;
}
