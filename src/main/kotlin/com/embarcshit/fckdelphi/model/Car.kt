package com.embarcshit.fckdelphi.model

import jakarta.persistence.*


@Entity
class Car(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int?,
    @Column(nullable = false)
    private var model: String
) {
    constructor() : this(null, "")

    fun getId(): Int? = id
    fun getModel(): String = model

    fun setModel(model: String) {
        this.model = model
    }
}

