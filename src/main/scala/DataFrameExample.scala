import org.apache.spark.sql.SparkSession

object DataFrameExample extends Serializable {
  def main(args: Array[String]) = {


    // Winutils.exe location is: C:\\hadoop\bin
    System.setProperty("hadoop.home.dir", "C:\\hadoop")

    val spark = SparkSession.builder().appName("Spark Example").master("local")
      .getOrCreate()

    val df = spark.range(1000).toDF("range")
    println(df.count())

  }
}