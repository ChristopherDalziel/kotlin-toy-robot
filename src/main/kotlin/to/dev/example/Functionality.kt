package to.dev.example

import java.util.logging.Logger

class Functionality constructor(private val board: Board = Board()){
    private val logger = Logger.getLogger(Functionality::class.java.name)
    private var robot: Robot? = null

    fun report(): String? { return this.robot?.report() }

    fun moveRobot() {
        logger.info("MOVING")
        this.robot = this.robot?.move(board)
    }

    fun place(facing: Direction, position: Position) {
        logger.info("**Placing Robot** $facing, $position")
        this.robot = Robot(facing, position)
    }

    fun right() {
        logger.info("RIGHT TURN")
        this.robot = this.robot?.right()
    }

    fun left() {
        logger.info("LEFT TURN")
        this.robot = this.robot?.left()
    }

}
