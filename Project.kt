package com.example.kotlinbasics

fun main(){
var person = Task(1,"Mada","Buy a car",false)
var person2 = Task(2,"Abdulrahman","Travel to NewYork",false)
var person3 = Task(3,"Ahmad","Sell my Cat",false)
var todo= Task.Todo()
    todo.addtask(person)
    todo.addtask(person2)
    todo.addtask(person3)
    todo.specificID(person2.ID)
    todo.removeTask(person2)
    todo.changeTask(person3)
todo.showAllTask()


}

data class Task(var ID:Int, var name:String, var note:String, var isCompelete:Boolean) {

    class Todo {
        var listOfTasks = arrayListOf<Task>()

        fun addtask(person: Task) {
            println("Add Task: "+person.note )
            listOfTasks.add(person)
        }

        fun showAllTask() {
            println("All Tasks: ")
            for (i in 0 until listOfTasks.size) {
                println("Task: "+listOfTasks[i].note)
            }
        }

        fun specificID(id: Int){
            for (i in 0 until listOfTasks.size) {
                if (listOfTasks[i].ID == id)
                    println("Task Details : ID (" +listOfTasks[i].ID+"), Name ("+listOfTasks[i].name+"), Task ("+listOfTasks[i].note+"), Completed ("+listOfTasks[i].isCompelete+")")
            }
        }

        fun removeTask(task: Task) {

            for (i in 0 until listOfTasks.size-1) {
                if (listOfTasks[i].ID == task.ID) {
                    println("Remove Task: "+listOfTasks[i].note )
                    listOfTasks.remove(listOfTasks[i])
                }
            }
        }

        fun changeTask(task: Task) {
            for (i in 0 until listOfTasks.size) {
                if (listOfTasks[i] == task) {
                    listOfTasks[i].isCompelete = !listOfTasks[i].isCompelete
                    println("Task: "+listOfTasks[i].note+", Complete: "+listOfTasks[i].isCompelete )
                }
            }

        }

    }



}