package com.fellowship.test
import com.fellowship.UserRegistration
import org.scalatest.FunSuite

class UserRegistrationTest extends FunSuite{
  val userRegistration = new UserRegistration()
  test ("givenFirstNameWhenValidReturnTrue") {
    assert(userRegistration.validateFirstName("Cheluvesha") === true)
  }
  test ("givenFirstNameWhenNotValidReturnFalse") {
    assert(userRegistration.validateFirstName(" $asdA4") === false)
  }
  test ("givenLastNameWhenValidReturnTrue") {
    assert(userRegistration.validateLastName("Bharath") === true)
  }
  test ("givenLastNameWhenNotValidReturnFalse") {
    assert(userRegistration.validateLastName("B131  ") === false)
  }
  test ("givenEmailWhenValidReturnTrue") {
    assert(userRegistration.validateEmail("abc.xyz@bl.com.in") === true)
  }
  test ("givenEmailWhenNotValidReturnFalse") {
    assert(userRegistration.validateEmail("com.in") === false)
  }
}
