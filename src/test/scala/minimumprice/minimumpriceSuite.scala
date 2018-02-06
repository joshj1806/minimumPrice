package minimumprice

import org.scalatest.FunSuite
import DB._

import scala.collection.immutable.List

class minimumpriceSuite extends FunSuite {

  val initItems = Map("Apple" -> 1.0, "Banana" -> 2.0)
  val initBundles = Map("Apple" -> List(Tuple2(2, 1.5), Tuple2(3, 2.0)))
  initDataBase(DB(initItems, initBundles))

  test("InitDB") {
    assert(db == DB(initItems, initBundles))
  }

  test("minimumPrice") {
    val minP = 0.0
    val purchasedItem = List(Tuple2("Apple", 1))
    assert(minP == minimumPrice(purchasedItem))
  }

}
