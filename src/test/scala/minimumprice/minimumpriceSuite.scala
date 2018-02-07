package minimumprice

import org.scalatest.FunSuite
import DB._

import scala.collection.immutable.List

class minimumpriceSuite extends FunSuite {

  val abPair = Tuple2("Apple", "Banana")
  val abDiscount = Tuple2(Tuple2(1, 0.9), Tuple2(1, 1.8))

  val apples = Tuple2("Apple", "Apple")
  val appleDiscount = Tuple2(Tuple2(1, 1.0), Tuple2(2, 1.0))

  val purchse = List(Tuple2("Apple", 1), Tuple2("Banana", 1))

  val initItems = Map("Apple" -> 1.0, "Banana" -> 2.0)
  val initBundles = Map(abPair -> abDiscount, apples -> appleDiscount)

  initDataBase(DB(initItems, initBundles))

  test("InitDB") {
    assert(db == DB(initItems, initBundles))
  }

  test("price test") {
    assert(2.0 == price(initItems, purchse))
  }

  test("minimumPrice") {
    val minP = 0.0
    val purchasedItem = List(Tuple2("Apple", 1))
    assert(minP == minimumPrice(purchasedItem))
  }

  test("min price case 2") {
    val purchase = List(Tuple2("Apple", 1), Tuple2("Banana", 3))
    assert((1 * 0.9 + 1 * 1.0 + 2 * 1.8 + 1 * 2.0) == minimumPrice(purchase))
  }

  test("min price case 3") {
    val purchase = List(Tuple2("Apple", 2), Tuple2("Banana", 2))
    // 5 or 2*0.9 + 2*2.0
    assert((1.8 + 3) == minimumPrice(purchase))
  }

}
