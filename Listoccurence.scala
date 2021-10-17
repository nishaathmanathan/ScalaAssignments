
object Listoccurence {
  /**
   * Counting occurrences in list of list of strings in main method
   */
	def main(args: Array[String]) {
	val inputList = List(
				List("Navid", "Mehdi", "Arniel", "Lotte"),
				List("Ben", "David", "Arniel"), List("David", "Mehdi", "Arniel", "Sara"));
		val groupedList = inputList.flatten.groupBy(identity).mapValues(_.size);
		val resultList= groupedList.toList.sortBy(_._2)(Ordering[Int].reverse);
		println(resultList);
	}
}