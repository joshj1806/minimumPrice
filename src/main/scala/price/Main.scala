package price

class DB(items: Map[String, Double], bundles: Map[String, List[Int, Double]]) {

  object Products {
    // items
  }

}

object Main extends App {
  val ages = Seq(1,2,3,5)
  println(s"The oldest one is ${ages.max}")
  // initialized with all bundle and the catalog of items and their price
  // val db = new DB

  def initializeBundles(bundles: Map[String, List[Int, Double]]): Unit

  def purchasePrice(items: Map[String, Int]): Double
  // Find all bundles from the puchased item
  // calculate all possible price with each bundel cases
  // get minimum total price


  //
}

/*
Bundle Pricing  
This exercise is a common problem in e-commerce and brick-and- mortar retail systems.
A customer shops from some form of catalog, selecting items and quantities they wish to
purchase. When they are ready, they “check out”, that is, complete their purchase, at which
point they are given a total amount of money they owe for the purchase of a specific set of
items. In the bounds of this problem, certain groups of items can be taken together as a
“bundle” with a different price. E.g. if I buy single apple in isolation it costs $1.99, if I buy two
apples it’s $2.15. More complex combinations are possible – e.g. a loaf of bread “A” purchased
with two sticks of margarine “B” and the second stick of margarine is free (e.g. $0).
The same item may appear in more than one bundle, e.g. any one “cart” of items might be able
to be combined in more than one way. For this exercise, produce an API and implementation
for a service that accepts a collection of items the customer wishes to purchase (e.g. items and
quantities), and produces the lowest possible price for that collection of items. The API is to be
called by other applications in the same JVM, e.g. don’t worry about providing a REST or other
remote interface to the API, just the actual method calls is fine. The API is initialized with
information that provides all possible bundles and the catalog of items and their prices. Once it
is initialized, many calls can be made at once to the API to produce a total price for collections
of items, and it should be able to handle multiple simultaneous calls without errors (e.g. if I’m
computing the price for one call, that should not interfere with computing the price for another
call). Use what you would consider good Scala style.

test code provided
*/