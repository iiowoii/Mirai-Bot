package me.lovesasuna.bot.entity.dynamic

import javax.persistence.*

@Entity
@Table(name = "dynamic")
data class DynamicEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int? = null,
        @Column(name = "ups")
        var upID: Int? = null,
        @Lob
        var context: String = ""
)
