package com.fellowship
class UserRegistration {
  val Name = "^[A-Z]{1}[a-z]{2,}$"
  // Validates Firstname
  def validateFirstName(firstName: String): Boolean ={
    firstName.matches(Name)
  }
  // Validates Lastname
  def validateLastName(lastName: String): Boolean ={
    lastName.matches(Name)
  }
}
