// Task 1
def findBucket(value: Float, start: Float, diff: Float): (Float, Float) = {
  (start + ((value/diff).floor) * diff, (start + ((value/diff).floor) * diff + 0.049F))
}

println(findBucket(12.05F, 0.0F, 0.05F)) // (12.05, 12.099)
println(findBucket(10.33F, 0.0F, 0.05F)) // (10.3, 10.349)
println(findBucket(11.45F, 0.0F, 0.05F)) // (11.45, 11.499)
println(findBucket(13.50F, 0.0F, 0.05F)) // (13.5, 13.549)

// Task 2
var player_info = Array((2021, "Sam", "India", 23, 2300, 3),(2021, "Ram", "India", 23, 300, 3), (2021, "Mano", "India", 23, 300, 13))
//1. Player with the best highest run scored.
player_info.sortWith(_._5 > _._5).take(1)(0)._2  // Sam

//2. Top 5 players by run scored.

for(info <- player_info.sortWith(_._5 > _._5).take(5)){
  println(info._2)
}  // Sam \n Ram \n Mano


//3. Top 5 players by wicket taken.

for(info <- player_info.sortWith(_._6 > _._6).take(5)){
  println(info._2)
}  // Mano \n Sam \n Ram

//4. Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.

player_info.sortBy(x => x._5 * 0.05 + x._6 * 5).reverse

// val res11: Array[(Int, String, String, Int, Int, Int)] = 
// Array( (2021,Sam,India,23,2300,3), 
//        (2021,Mano,India,23,300,13), 
//        (2021,Ram,India,23,300,3))