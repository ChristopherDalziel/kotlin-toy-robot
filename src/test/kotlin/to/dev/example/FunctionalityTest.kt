package to.dev.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach


class FunctionalityTest {

    private val functionality = Functionality(Board(4, 4))

    @BeforeEach()
    fun setUp() {
        functionality.place(Direction.NORTH, Position())
    }

    @Test()
    fun`Given the Robot is placed in a valid Position, when Report is called, a valid Robot location is reported`() {
        assertEquals("POSITION: 0, 0, FACING: NORTH", functionality.report())
    }

    @Test()
    fun`Given the Robot is placed in a invalid Position, when Report is called, a valid Robot location is reported (The default has taken over)`() {
        functionality.place(Direction.NORTH, Position(10,10))
        assertEquals("POSITION: 0, 0, FACING: NORTH", functionality.report())
    }

    @Test()
    fun`Given the Robot is moved, when Report is called, a valid Robot location is returned and reports one place forward`() {
        functionality.moveRobot()
        assertEquals("POSITION: 0, 1, FACING: NORTH", functionality.report())
    }

    @Test()
    fun`Given the Robot turns left, when Report is called, a valid location is returned and reports one position left of NORTH`() {
        functionality.left()
        assertEquals("POSITION: 0, 0, FACING: WEST", functionality.report())
    }

    @Test
    fun`Given the Robot turns right, when Report is called, a valid location is returned and reports one position right of NORTH`() {
        functionality.right()
        assertEquals("POSITION: 0, 0, FACING: EAST", functionality.report())
    }
}
