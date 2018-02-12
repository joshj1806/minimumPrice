import minimumprice.DB
import minimumprice.DB._

  val bundle = Map(Set('a') -> 1.0, Set('b') -> 2.0, Set('c') -> 3.0,
    Set('a', 'b') -> 2.5, Set('a', 'c') -> 3.0)

  bundle.get(Set('a'))

  val bundleDB = DB(bundle)
  initDataBase(bundle)

  getBundlePrice(Set('a'))

  val a = ksubsets("abc", 1)
  val b = ksubsets("abc", 2)

  val ab = purchasePair(a, b)





