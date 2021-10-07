package to.dev.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RobotTest {

    private val board = Board()
    private val robot = Robot(Direction.NORTH, Position(1, 2))

    @Test
    fun`Given the Robot is placed, when the Move command is called, a valid location is returned showing the Robot has moved forward one space from it's previous position`() {
        val testBot = robot.move(board)
        assertEquals("POSITION: 1, 3, FACING: NORTH", testBot.report())
    }

    @Test
    fun`Given the Robot is placed, when it Move command attempts to go beyond the board, the Robot is unable to move further`() {
        val testBot = robot.move(board).move(board).move(board)
        assertEquals("POSITION: 1, 4, FACING: NORTH", testBot.report())
    }

    @Test
    fun`Given the Robot is placed, when the Left command is called, a valid location is returned showing the Robot is now facing one position left of NORTH`() {
        val testBot = robot.left()
        assertEquals("POSITION: 1, 2, FACING: WEST", testBot.report())
    }

    @Test
    fun`Given the Robot is placed, when the Right command is called, a valid location is returned showing the Robot is now facing one position right of NORTH`() {
        val testBot = robot.right()
        assertEquals("POSITION: 1, 2, FACING: EAST", testBot.report())
    }
}