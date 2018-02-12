package minimumprice

case class DB (bundles: Bundles)

object DB {

  var db: Bundles = null
  var state: Int = 0

  def initDataBase(bs: Bundles): Unit = {
    if (state == 0) {
      db = bs
      state = 1
    } else {
      println("DB is already initialized")
    }
  }

  def getBundlePrice(b: Set[Char]): Option[Double] = {
    db.get(b)
  }

  def ksubsets(x: String, k: Int): List[Set[Char]] = {
    x.toSet.subsets(k).toList
  }

  def purchasePair(xs: List[Set[Char]], ys: List[Set[Char]]): Purchases = {

    for {
      x <- xs
      y <- ys
      if (x.intersect(y) == Set.empty)
    } yield (x, y)
  }

  /*
  def priceOfPurchase(p: Tuple2[Set[Char], Set[Char]]) = {
    getBundlePrice(p._1) + getBundlePrice(p._2)
  }

  def minimuPrice(ps: Purchases): Unit = {
    var prices = for {
      p <- ps
    } yield getBundlePrice(p)

    prices.min
  }
*/

}

