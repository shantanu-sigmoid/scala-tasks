import scala.io.Source._
object Player {
  class PlayerInfo(var year: Int, var name: String, var country: String, var matches: Int, var runs: Int, var wicket: Int){}
  private var players_info: List[PlayerInfo] = List()
  def read_player_info(path: String): Unit = {
    for (info <- fromFile(path).getLines()){
      val new_info = info.split(",")
      val player = new PlayerInfo(new_info(0).toInt,new_info(1),new_info(2),new_info(3).toInt,new_info(4).toInt,new_info(5).toInt )
      players_info = players_info :+ player
    }
  }

  def main(args: Array[String]): Unit = {
    read_player_info("/Users/shantanu/Downloads/players.txt")

    println("TASK 1 : Player name with highest score run ")
    val player_with_highest_score = players_info.sortBy(x => x.runs).reverse
    println(player_with_highest_score(0).name)

    println("TASK 3: Top 5 Player by run scored")
    for(info <- players_info.sortBy(x => x.runs).reverse.take(5)){
        println(info.name)
    }

    println("TASK 3: Top 5 Player by wicket taken")
    for(info <- players_info.sortBy(x => x.wicket).reverse.take(5)){
        println(info.name)
    }

    println("TASK 4: 4. Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.")
    for(info <- players_info.sortBy(x => (x.runs * 0.05 + x.wicket * 5)).reverse.take(5)){
        println(info.name)
    }

  }
}
