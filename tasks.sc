// Task 1
def findBucket(value: Float, start: Float, diff: Float): (Float, Float) = {
  (start + ((value/diff).floor) * diff, (start + ((value/diff).floor) * diff + 0.049F))
}

println(findBucket(12.05F, 0.0F, 0.05F))
println(findBucket(10.33F, 0.0F, 0.05F))
println(findBucket(11.45F, 0.0F, 0.05F))
println(findBucket(13.50F, 0.0F, 0.05F))

// Task 2
var player_info = Array((2021, "Sam", "India", 23, 2300, 3),(2021, "Ram", "India", 23, 300, 3), (2021, "Mano", "India", 23, 300, 13))
//1. Player with the best highest run scored.
player_info.sortWith(_._5 > _._5)

//2. Top 5 players by run scored.
player_info.sortWith(_._5 > _._5).take(5)

//3. Top 5 players by wicket taken.
player_info.sortWith(_._6 > _._6).take(5)

//4. Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.

player_info.sortBy(x => x._5 * 0.05 + x._6 * 5).reverse
