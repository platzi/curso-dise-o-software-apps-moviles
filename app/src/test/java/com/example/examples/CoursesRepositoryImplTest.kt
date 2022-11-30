package com.example.examples

import org.junit.Before
import org.junit.Test


class CoursesRepositoryImplTest {
    lateinit var coursesRepositoryImpl: CoursesRepositoryImpl
    lateinit var databaseDependency: DatabaseDependencyMock
    lateinit var remoteDependency: RemoteDependencyMock

    @Before
    fun setup() {
        databaseDependency = DatabaseDependencyMock()
        remoteDependency = RemoteDependencyMock()
        coursesRepositoryImpl = CoursesRepositoryImpl(databaseDependency, remoteDependency)
    }

    @Test
    fun testGetCoursesListWithoutConnection() {
        //GIVEN
        //WHEN
        val coursesList = coursesRepositoryImpl.getCourses()
        //THEN
        assert(coursesList.isNotEmpty())
    }
}