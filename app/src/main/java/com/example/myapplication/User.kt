package com.example.myapplication

import org.parceler.Parcel

@Parcel
//data class User(val name: String? = null, val age: Int? = null)
data class User(val name: String, val age: Int) {
    constructor() : this("", 0) {}
}

@Parcel
class User2() {
    var name: String? = null
    var age: Int = 0

    constructor(name1: String, age1: Int) : this() {
        name = name1
        age = age1
    }
}
