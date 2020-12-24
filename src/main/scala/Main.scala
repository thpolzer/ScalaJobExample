import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Main extends App {

  private val sparkConf = new SparkConf().setAppName(args(0)).setMaster(args(1))
  private val sc = new SparkContext(sparkConf)

  val list = List (1,2,3,4,5,6)
  val simpleRDD = sc.parallelize(list)
  simpleRDD.collect().foreach(println)

  sc.stop()

}
