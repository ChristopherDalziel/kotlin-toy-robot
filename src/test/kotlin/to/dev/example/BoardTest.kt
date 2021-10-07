package to.dev.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BoardTest {

    @Test()
    fun` `() {
        val board = Board()
        assertEquals(4, board.maxHeight)
        assertEquals(4, board.maxWidth)
    }

    @Test()
    fun`Given a valid position, when withinBoard is called, returns true`() {
        val board = Board()
        val valid = Position(1, 2)
        assertTrue(board.withinBoard(valid))
    }

    @Test()
    fun`Given a invalid position, when withinBoard is called, returns false`() {
        val board = Board()
        val invalid = Position(100, 50)
        assertFalse(board.withinBoard(invalid))
    }
}