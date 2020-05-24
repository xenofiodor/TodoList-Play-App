package models

import java.time.LocalDate

class Task(val task: String, val dateString: String){
  def date: LocalDate = LocalDate.parse(dateString)
}
