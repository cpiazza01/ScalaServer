import java.net._
import java.io._
object Server extends App {
    val server = new ServerSocket(8777)

    while (true) {
        var socket = server.accept()
        var input = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        var line = input.readLine()
        System.out.println("Starting server....")
        while (line != null) {
            System.out.println(line)
        }
    }
}