package to.dev.example

enum class Direction( val left: String,  val right: String) {
    NORTH("WEST", "EAST"),
    SOUTH("EAST", "WEST"),
    EAST("NORTH", "SOUTH"),
    WEST("SOUTH", "NORTH");

    fun left(): Direction {
        return valueOf(left)
    }

    fun right(): Direction {
        return valueOf(right)
    }

}

// Previous Direction enum
//enum class Direction {
//    NORTH,
//    SOUTH,
//    EAST,
//    WEST
//}

