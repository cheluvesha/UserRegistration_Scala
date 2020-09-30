package com.fellowship
class UserRegistration {
  val FirstName = "^[A-Z]{1}[a-z]{2,}$"
  // Validates Firstname
  def validateFirstName(firstName: String): Boolean ={
    firstName.matches(FirstName)
  }
}
