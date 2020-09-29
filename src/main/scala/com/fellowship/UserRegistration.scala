package com.fellowship
class UserRegistration {
  val Name = "^[A-Z]{1}[a-z]{2,}$"
  val Email = "^[A-Za-z0-9+_.-]+@(.+)$"
  def validateFirstName(firstName: String): Boolean ={
    firstName.matches(Name)
  }
  def validateLastName(lastName: String): Boolean ={
    lastName.matches(Name)
  }
  def validateEmail(email: String): Boolean ={
    email.matches(Email)
  }
}
