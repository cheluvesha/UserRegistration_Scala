package com.fellowship.test
import com.fellowship.UserRegistration
import org.scalatest.FunSuite

class UserRegistrationTest extends FunSuite{

  test ("givenFirstNameWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateFirstName("Cheluvesha") === true)
  }
  test ("givenFirstNameWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateFirstName("Ch") === false)
  }
  test ("givenLastNameWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateLastName("Bharath") === true)
  }
  test ("givenLastNameWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateLastName("Bh") === false)
  }
}
