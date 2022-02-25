
object Bucket {
  def bucketize(num: Float, start: Float, diff: Float): (Float, Float) = {
    val base = start + (num/diff).floor * diff
    (base, base + 0.049F)
  }
  def main(args: Array[String]): Unit = {
    println(bucketize(12.05F, 0.0F, 0.05F)) // (12.05, 12.099)
    println(bucketize(10.33F, 0.0F, 0.05F)) // (10.3, 10.349)
    println(bucketize(11.45F, 0.0F, 0.05F)) // (11.45, 11.499)
    println(bucketize(13.50F, 0.0F, 0.05F)) // (13.5, 13.549)
  }
}
