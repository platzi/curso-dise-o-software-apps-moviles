package com.example.examples

class RemoteDependencyMock: RemoteDependency {
    override fun getCoursesList(): List<Course> {
       return arrayListOf()
    }
}