package com.example.trainRestfull

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*
import javax.xml.bind.annotation.XmlRootElement



@XmlRootElement(name = "hobbies")
@Entity
class Hobbies(@Id
              var id: Int? = null,
              @Enumerated(EnumType.STRING)
              var hobby: Hobby? = null
){
    val getHobbyArray get() = this.hobby

    override fun toString(): String {
        return "Hobbies(hobby=${hobby})"
    }
}