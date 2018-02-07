package object minimumprice {
  type itemsType = Map[String, Double]
  type itemPair = Tuple2[String, String]
  type discountRatio = Tuple2[Tuple2[Int, Double], Tuple2[Int, Double]]
  type bundlesType = Map[itemPair, discountRatio]
  type purchaseType = List[Tuple2[String, Int]]
}
