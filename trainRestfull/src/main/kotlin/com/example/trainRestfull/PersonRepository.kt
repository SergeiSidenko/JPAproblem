package com.example.trainRestfull

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Int>{
    fun save(person: Person?): Person
    fun save(person:  List<Person?>?): List<Person?>?
    fun findAllById(id: Int): MutableList<Person>

}