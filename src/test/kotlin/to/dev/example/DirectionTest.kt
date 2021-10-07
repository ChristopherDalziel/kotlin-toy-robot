package to.dev.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DirectionTest {

    @Test
    fun`Given the Robot is facing NORTH, if the Robot turns LEFT, expect the Robot to be facing WEST`() {
        assertEquals(Direction.NORTH.left, "WEST")
    }

    @Test
    fun`Given the Robot is facing NORTH, when the Robot turns LEFT, expect the Robot to be facing WEST`() {
        assertEquals(Direction.NORTH.left(), Direction.WEST)
    }
}