package lesson_11

fun main() {

}

//class Forum() {
//
//    private var memberList = mutableListOf<ForumMember>()
//    private var messageList = mutableListOf<ForumMessage>()
//
//    fun createNewUser(userName: String): ForumMember {
//
//        memberList.add(ForumMember.newUser(memberList.size, userName))
////        return memberList
//
//    }
//
//
//    fun createNewMessage() {}
//
//    fun printThread() {}
//
//}

class ForumMember(
    val userId: Int,
    val userName: String,
) {

    companion object {
        fun newUser(id: Int, name: String) = ForumMember(id, name)
    }

}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {

}