import org.raml.v2.internal.utils.Inflector.uppercase
import to.dev.example.Direction
import to.dev.example.Position
import to.dev.example.Functionality
import java.awt.Robot
import java.io.File
import java.util.logging.Logger

fun main(args: Array<String>) = if (args.isNotEmpty()) {
    val logger = Logger.getLogger(Robot::class.java.name)
    val functionality = Functionality()
    val placeRegex = Regex("(PLACE) ([0-9]),([0-9]),(NORTH|EAST|SOUTH|WEST)")

    File(args[0]).forEachLine { command ->
        when (uppercase(command)) {
            in placeRegex -> {
                val (PLACE, x, y, facing) = placeRegex.matchEntire(uppercase(command))!!.destructured
                functionality.place(Direction.valueOf(facing), Position(x.toInt(), y.toInt()))
            }
            "MOVE" -> functionality.moveRobot()
            "RIGHT" -> functionality.right()
            "LEFT" -> functionality.left()
            "REPORT" -> println(functionality.report())
            else -> logger.info("Ignoring invalid command: $command")
        }
    }
} else {
    print("Expected CommandFile.txt to be added to PROGRAM ARGUMENTS")
}

operator fun Regex.contains(text: CharSequence): Boolean = this.matches(text)
