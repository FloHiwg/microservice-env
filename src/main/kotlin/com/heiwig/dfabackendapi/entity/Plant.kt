package com.heiwig.dfabackendapi.entity;

import javax.persistence.Column
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

data class Plant (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var plantId: Long = -1,
    @Column(name = "name")
    var name: String = "",
    @Column(name = "position")
    var position: String = ""
){ }