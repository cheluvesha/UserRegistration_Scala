package com.fellowship
class UserRegistration {
  val Name = "^[A-Z]{1}[a-z]{2,}$"
  val Email = "^[A-Za-z0-9+_.-]+@(.+)$"
  val Phone = "^[91]+[ ]{0,1}+[6-9][0-9]{9}$"
  val PasswordMin8Chars = "^.{8,}$"
  // Validates Firstname
  def validateFirstName(firstName: String): Boolean ={
    firstName.matches(Name)
  }
  // Validates Lastname
  def validateLastName(lastName: String): Boolean ={
    lastName.matches(Name)
  }
  // Validates Email
  def validateEmail(email: String): Boolean ={
    email.matches(Email)
  }
  // Validates Mobile Number
  def validateMobNum(number: String): Boolean ={
    number.matches(Phone)
  }
  // Validates Password with maximum of 8 chars
  def validatePasswordMin8Chars(password8Chars: String): Boolean ={
    password8Chars.matches(PasswordMin8Chars)
  }
}
