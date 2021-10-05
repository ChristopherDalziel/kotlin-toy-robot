package to.dev.example

data class Board(val maxWidth: Int = 4, val maxHeight: Int = 4) {
    fun withinBoard(position: Position): Boolean {
        return position.x in 0..maxWidth && position.y  in 0..maxHeight
    }
}
