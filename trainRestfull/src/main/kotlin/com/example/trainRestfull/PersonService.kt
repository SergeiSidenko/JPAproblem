package com.example.trainRestfull

import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonService(val personRepository: PersonRepository) {

    fun save(person: Person?): Person? {
        return personRepository.save(person)
    }

    fun save(people: List<Person?>?) {
        personRepository.save(people)
    }

    fun findAllPeople(): Iterable<Person?>? {
        return personRepository.findAll()
    }

    fun findAllByID(id: Int): MutableList<Person> {
        return personRepository.findAllById(id)
    }

}