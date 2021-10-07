package to.dev.example

import java.util.logging.Logger

class Functionality constructor(private val board: Board = Board()){
    private val logger = Logger.getLogger(Functionality::class.java.name)
    private var robot: Robot? = null

    fun report(): String? { return this.robot?.report() }

    fun moveRobot() {
        if (this.robot == null) {
            logger.info("**Robot must be placed before it can move**")
        } else {
            logger.info("MOVING")
            this.robot = this.robot?.move(board)
        }
    }

    fun place(facing: Direction, position: Position) {
        if(board.withinBoard(position)) {
            logger.info("**Placing Robot** $facing, $position")
            this.robot = Robot(facing, position)
        } else {
            logger.info("**Robot cannot be placed beyond ${board.maxHeight}, ${board.maxWidth} placing at default 0,0**")
            this.robot = Robot(facing, Position(0,0))
        }
    }

    fun right() {
        if (this.robot == null) {
            logger.info("**Robot must be placed before it can turn**")
        } else {
            logger.info("RIGHT TURN")
            this.robot = this.robot?.right()
        }
    }

    fun left() {
        if (this.robot == null) {
            logger.info("**Robot must be placed before it can turn**")
        } else {
            logger.info("LEFT TURN")
            this.robot = this.robot?.left()
        }
    }

}

