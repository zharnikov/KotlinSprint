package lesson_11


fun main() {

    val room1 = Room(avatar = "image", "Running")
    val user1 = User(avatar = "image")

    room1.addUser(user1)
//    room1.updateUser(name = "Vova", status = "Talk")

}

class Room(

    val avatar: String,
    val title: String,

    ) {

    private var chatUsers = mutableListOf<User>()

    fun addUser(user: User) = chatUsers.add(user)

}

class User(

    var avatar: String = "",
    var name: String = "",
    var status: String = ""

)
