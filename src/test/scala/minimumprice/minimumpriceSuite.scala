package minimumprice

import org.scalatest.FunSuite
import DB._

import scala.collection.immutable.List

class minimumpriceSuite extends FunSuite {

  val bundle = Map(Set('a') -> 1.0, Set('b') -> 2.0, Set('c') -> 3.0,
    Set('a', 'b') -> 2.5, Set('a', 'c') -> 3.0)

  bundle.get(Set('a'))

  val bundleDB = DB(bundle)
  initDataBase(bundle)

  test("getBundlePrice") {

    assert(Some(1.0) == getBundlePrice(Set('a')))
  }

  val a = ksubsets("abc", 1)
  val b = ksubsets("abc", 2)

  test("ksbuset") {
    assert(List(Set('a', 'b'), Set('a', 'c'), Set('b', 'c'))  == b)
  }


  test("purchasePair") {
     assert(List((Set('a'),Set('b', 'c')), (Set('b'),Set('a', 'c')), (Set('c'),Set('a', 'b'))) == purchasePair(a, b))
  }






  test("Init DB") {
  }


}
