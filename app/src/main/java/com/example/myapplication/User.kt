package com.example.myapplication

import org.parceler.Parcel

@Parcel(Parcel.Serialization.BEAN)
data class User(val name: String? = null, val age: Int? = null)
