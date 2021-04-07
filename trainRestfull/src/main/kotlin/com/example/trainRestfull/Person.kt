package com.example.trainRestfull

import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.*
import javax.xml.bind.annotation.*
import kotlin.collections.HashSet


@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "people")
data class Person( @Id
                   @XmlElement var id: Int? = null,

                   @XmlElement var name: String? = null,

                   @XmlElement var surname: String? = null,

                   @XmlElement var age: Int? = null,

                   @OneToMany(mappedBy = "id", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
                   @Column(name = "hobbies")
                   @XmlElement var hobbies: MutableList<Hobbies>
){

}