
val arr = Array[Int](1, 23, -4, -1)

val part = arr.partition(_ > 0)

for((k,v) <- part._1.zip(part._2)) println("-" * 5 + k + v)








