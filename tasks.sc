def findBucket(value: Float, start: Float, diff: Float): (Float, Float) = {
  (start + ((value/diff).floor) * diff, (start + ((value/diff).floor) * diff + 0.049F))
}

println(findBucket(12.05F, 0.0F, 0.05F))
println(findBucket(10.33F, 0.0F, 0.05F))
println(findBucket(11.45F, 0.0F, 0.05F))
println(findBucket(13.50F, 0.0F, 0.05F))