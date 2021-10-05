package to.dev.example

import java.util.logging.Logger

data class Robot(private val facing: Direction, private val position: Position) {
    private val logger = Logger.getLogger(java.awt.Robot::class.java.name)

    fun move(board: Board): Robot {
        val next = when (facing) {
            Direction.NORTH -> Robot(facing, position.moveNorth())
            Direction.EAST -> Robot(facing, position.moveEast())
            Direction.WEST -> Robot(facing, position.moveWest())
            Direction.SOUTH -> Robot(facing, position.moveSouth())
        }

        return if (board.withinBoard(next.position)) {
            next
        } else {
            logger.info("The Robot has reached the edge of the board ..stopping")
            this
        }
    }

    fun right(): Robot = when (facing) {
        Direction.NORTH -> Robot(Direction.EAST, position)
        Direction.EAST -> Robot(Direction.SOUTH, position)
        Direction.SOUTH -> Robot(Direction.WEST, position)
        Direction.WEST -> Robot(Direction.NORTH, position)
    }

    fun left(): Robot = when (facing) {
        Direction.NORTH -> Robot(Direction.WEST, position)
        Direction.EAST -> Robot(Direction.NORTH, position)
        Direction.SOUTH -> Robot(Direction.EAST, position)
        Direction.WEST -> Robot(Direction.SOUTH, position)
    }

    fun report(): String = "POSITION: $position, FACING: $facing"
}
