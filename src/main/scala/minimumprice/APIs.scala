package minimumprice

case class DB (val items: itemsType, val bundles: bundlesType)

object DB {

  var db : DB = DB(Map("Apple" -> 0.0), Map(Tuple2("Apple", "Banana") -> Tuple2(Tuple2(1, 0.9), Tuple2(1, 1.8))))
  var state: Int = 0

  def initDataBase(a: DB): Unit = {
    if (state == 0) {
      db = a
      state = 1
    } else {
      println("DB is already initialized")
    }
  }

  def price(items: itemsType, purchase: purchaseType): Double = {
    val priceOfItem = (item: String) => items.get(item)
    val itemPrice = (pItem: Tuple2[String, Int]) => priceOfItem(pItem._1).get * pItem._2
    purchase.map(x => itemPrice(x)).reduce(_+_)
  }

  def minimumPrice(purchase: purchaseType): Double = {

  var c = (ps: purchaseType) => {
    for{
      a <- ps
      b <- ps
    } yield (a._1, b._1)
   }

  var q = for {
   x <- c(purchase)
  } yield db.bundles.get(x)

    0.0
  }

}
