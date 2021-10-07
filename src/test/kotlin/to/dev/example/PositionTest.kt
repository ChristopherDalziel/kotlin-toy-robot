package to.dev.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PositionTest {

    private val position = Position(0, 0)

    @Test()
    fun`Given the position is set to default, when moveNorth is called, expect the position on the y axis to be one more`() {
        assertEquals("0, 1", position.moveNorth().toString())
    }

    @Test()
    fun`Given the position is set to default, When moveSouth is called, expect the position on the y axis to be one less`() {
        assertEquals("0, -1", position.moveSouth().toString())
    }

    @Test()
    fun`Given the position is set to default, When moveEast is called, expect the position on the x asis to be one more`() {
        assertEquals("1, 0", position.moveEast().toString())
    }

    @Test()
    fun`Given the position is set to default, when moveWest is called, expect the position on the x axsis to be one less`() {
        assertEquals("-1, 0", position.moveWest().toString())
    }
}
