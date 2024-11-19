//class Comment(
//    val userId: Int,
//    val message: String
//)
//
//fun main() {
//    val comments = listOf<Comment>(
//        Comment(5241, "Nice Code"),
//        Comment(6624,"like it"),
//        Comment(5224, "what's going on"),
//        Comment(9001, "check out my website"),
//        Comment(8818, "Hello Everyone")
//    )
//    val blockedUserIds = setOf<Int>(5224,9001)
//
//    val userIdToRelation = mapOf<Int, String>(
//        Pair(5241,"Friend"),
//        Pair(6624, "Work Colleague")
//    )
//    for(comment in comments){
//        if(comment.userId !in blockedUserIds){
//            println("comment: ${comment.message} from ${userIdToRelation[comment.userId] ?: "unknown"}")
//        }
//
//    }
//}