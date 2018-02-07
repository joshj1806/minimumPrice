import minimumprice.{DB, purchaseType}
import minimumprice.DB._

import scala.collection.SortedSet

  val abPair = Tuple2("Apple", "Banana")
  val abDiscount = Tuple2(Tuple2(1, 0.9), Tuple2(1, 1.8))

  val apples = Tuple2("Apple", "Apple")
  val appleDiscount = Tuple2(Tuple2(1, 1.0), Tuple2(2, 1.0))

  val purchse = List(Tuple2("Apple", 1), Tuple2("Banana", 1))

  val initItems = Map("Apple" -> 1.0, "Banana" -> 2.0)
  val initBundles = Map(abPair -> abDiscount, apples -> appleDiscount)

  initDataBase(DB(initItems, initBundles))
  db.items
  db.bundles

  val purchase1 = List(Tuple2("Apple", 1), Tuple2("Banana", 1))
  val purchase2 = List(Tuple2("Apple", 2))

  var p = price(initItems, purchase2)

  var c = (ps: purchaseType) => {
    for{
      a <- ps
      b <- ps
    } yield (a._1, b._1)
   }

  var q = for {
   x <- c(purchase1)
  } yield db.bundles.get(x)

  def mPrice(purchase: purchaseType): Double = {

    // find a bundle with minimum price case.
   var c = (ps: purchaseType) => {
    for{
      a <- ps
      b <- ps
    } yield SortedSet(a._1, b._1)
   }.toSet

    // call with rest of item
    /*
    for (item <- purchase.map(t => t._2)
         if db.bundles.get(item))
      yield println(item)
      */

    0.0
  }












