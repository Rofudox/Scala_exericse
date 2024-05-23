sealed trait Weekday {
  def index: Int
  def day: String
  def next: String
}

object Monday extends Weekday {
  def day: String = "Monday"
  val index: Int = 1
  val n_index: String = day
  def next: String = "Tuesday"
}

object Tuesday extends Weekday {
    def day: String = "Tuesday"
    val n_index: String = day
    val index: Int = 2
    def next: String = "Wednesday"
}

object Wednesday extends Weekday {
    def day: String = "Wednesday"
    val index: Int = 3
    val n_index: String = day
    def next: String = "Thursday"
}

object Thursday extends Weekday {
    def day: String = "Thursday"
    val index: Int = 4
    val n_index: String = day
    def next: String = "Friday"
}

object Friday extends Weekday {
    def day: String = "Friday"
    val index: Int = 5
    val n_index: String = day
    def next: String = "Saturday"
}

object Saturday extends Weekday {
    def day: String = "Saturday"
    val index: Int = 6
    val n_index: String = day
    def next: String = "Sunday"
}

object Sunday extends Weekday {
    def day: String = "Sunday"
    val index: Int = 7
    val n_index: String = day
    def next: String = "Monday"
}