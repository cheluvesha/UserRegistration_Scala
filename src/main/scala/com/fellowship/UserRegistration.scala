package com.fellowship
class UserRegistration {
  val Name = "^[A-Z]{1}[a-z]{2,}$"
  val Email = "^[A-Za-z0-9+_.-]+@(.+)$"
  val Phone = "^[91]+[ ]{0,1}+[6-9][0-9]{9}$"
  val PasswordMin8Chars = "^.{8,}$"
  val PasswordWithUC = ".*[A-Z].*"
  // validates Firstname
  def validateFirstName(firstName: String): Boolean ={
    firstName.matches(Name)
  }
  // validates LastName
  def validateLastName(lastName: String): Boolean ={
    lastName.matches(Name)
  }
  // validates Email id
  def validateEmail(email: String): Boolean ={
    email.matches(Email)
  }
  // validates mobile number
  def validateMobNum(number: String): Boolean ={
    number.matches(Phone)
  }
  // validates password if its more than 8 characters
  def validatePasswordMin8Chars(password8Chars: String): Boolean ={
    password8Chars.matches(PasswordMin8Chars)
  }
  // validates password with 1 uppercase letter
  def validPassWith1UpperCase(passwordWithUC: String): Boolean ={
    passwordWithUC.matches(PasswordWithUC)
  }
}
