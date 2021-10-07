<h1>Kotlin Toy Robot 🤖</h1>

<h3>The Challenge</h3>

You have a toy robot on a table top, a grid of 4 x 4 units, there are no obstructions. You can issue commands to your robot allowing it to roam around the table top. But be careful, don't let it fall off!

Create an app that allows commands to be issued to the robot. The robot should be prevented from failing off the table top to its destruction.

A failed command should not stop the app, valid commands should be allowed.

The application should discard all commands until a valid place() command has been executed.

0, 0 on the grid should be seen as bottom left.

<h3>Instructions</h3>

Robot commands read from CommandFile.txt path should be added Program Arguments in your config <br />
Eg:
`${path}/kotlin-toy-robot/src/main/kotlin/to/dev/example/CommandFile.txt`

<h4>Robot Commands</h4>
🤖 `PLACE 4,4,SOUTH` <br />
Places the Robot at a specific position on the board <br /> <br />
🦿 `MOVE` <br />
Commands the Robot to move forward one spot in the direction it's facing <br /> <br />
⬅️ `LEFT` <br />
Commands the Robot to turn left one spot from the direction it's facing <br /> <br />
➡️ `RIGHT` <br />
Commands the Robot to turn right one spot from the direction it's facing <br /> <br />
📝 `REPORT`  <br />
Reports the current position and facing direction of the Robot