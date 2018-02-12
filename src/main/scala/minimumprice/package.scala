package object minimumprice {
  type itemPair = Set[Char]
  type Bundles = Map[itemPair, Double]
  type Purchases = List[Tuple2[Set[Char], Set[Char]]]
}
