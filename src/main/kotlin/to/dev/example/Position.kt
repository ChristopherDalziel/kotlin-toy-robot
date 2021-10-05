package to.dev.example

 class Position(val x: Int = 0, val y: Int = 0) {
     fun moveNorth() = Position(x, y + 1)
     fun moveSouth() = Position(x, y - 1)
     fun moveEast() = Position(x + 1, y)
     fun moveWest() = Position(x - 1, y)

     override fun toString() = "$x, $y"
}
