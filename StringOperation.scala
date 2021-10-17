import scala.collection.mutable.MutableList

object StringOperation {
  def main(args: Array[String]) {
    val stringList: List[String] = List("Test", "Scala");
    reverseString(stringList);
  }
  /*
	 * reverseString is a method to reverse the characters of each string
	 * then reverse elements of list
	 * @param lisof input strings
	 * @return list of reversed strings with reversed characters
	 */
  def reverseString(stringList: List[String]): MutableList[String] = {
    val reversedList = stringList.reverse;
    val resultList = MutableList[String]();
    for (i <- reversedList) resultList += i.reverse;
    resultList;
  }

}