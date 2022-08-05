package com.example.plantshandbook

import java.io.FileDescriptor
import java.io.Serializable

data class Plant(val imageId: Int, val title: String, val description: String) : Serializable
