package minimumprice

/*
  type itemsType = Map[String, Double]
  type itemPair = Tuple2[String, String]
  type discountRatio = Tuple2[Tuple2[Int, Double], Tuple2[Int, Double]]
  type bundlesType = Map[itemPair, discountRatio]
  type purchaseType = List[Tuple2[String, Int]]

Bundle Pricing  
E.g. if I buy single apple in isolation it costs $1.99, if I buy two
apples it’s $2.15. More complex combinations are possible – e.g. a loaf of bread “A” purchased
with two sticks of margarine “B” and the second stick of margarine is free (e.g. $0).

For this exercise, produce an API and implementation
for a service that accepts a collection of items the customer wishes to purchase (e.g. items and
quantities), and produces the lowest possible price for that collection of items.

The API is initialized with information that provides all possible bundles and the catalog of items and their prices.
*/

case class DB (val items: itemsType, val bundles: bundlesType)

object DB {
/*
 items: A pair of an item and its price. e.g Apple and 1.0 $
 bundles: A pair of an item and the quantity and the bundle price. e.g Apple and 2 for 1.5$
  */
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

  /* Returns total cost of purchasing */
  def price(items: itemsType, purchase: purchaseType): Double = {
    val priceOfItem = (item: String) => items.get(item)
    val itemPrice = (pItem: Tuple2[String, Int]) => priceOfItem(pItem._1).get * pItem._2
    purchase.map(x => itemPrice(x)).reduce(_+_)
  }

  def minimumPrice(purchase: purchaseType): Double = {

    // find a bundle with minimum price case.
    purchase.map(p => price(db.items, p))

    // call with rest of item
    /*
    for (item <- purchase.map(t => t._2)
         if db.bundles.get(item))
      yield println(item)
      */

    0.0
  }

}
