package com.example.examples

class DatabaseDependencyMock : DatabaseDependency {
    override fun saveCoursesList(coursesList: MutableList<Course>?) {

    }

    override fun getCourseList(): MutableList<Course> {
        return mutableListOf(Course("3040", "Course Name 1"),
            Course("3040", "Course Name 2"),
            Course("3040", "Course Name 3"),
            Course("3040", "Course Name 4"))
    }
}