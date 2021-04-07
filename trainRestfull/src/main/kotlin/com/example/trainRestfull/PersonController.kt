package com.example.trainRestfull

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.*
import java.io.File
import java.util.*


@RestController
class PersonController(val personService: PersonService) {


//    var temp = ""
    @Bean
    fun foo(){
        val person1: Person = Person(123,"Василий", "Пупкин", 20,
            mutableListOf(Hobbies(1, Hobby.computer_games))
        )
        val person2: Person = Person(456,"Иван", "Иванов", 21,
            mutableListOf(Hobbies(3, Hobby.music))
        )
        val objectMapper: ObjectMapper = ObjectMapper()
//        temp = objectMapper.writeValueAsString(person1)
//        println(temp)
        personService.save(person1)
        personService.save(person2)
    }
    @PostMapping("/people")
    fun postQuery(@RequestBody request: Person){
        personService.save(request)
    }

    @GetMapping("/people{id}")
    fun getPersonById(@PathVariable(name = "id") id: Int): MutableList<Person> {
        return personService.findAllByID(id)
    }


}