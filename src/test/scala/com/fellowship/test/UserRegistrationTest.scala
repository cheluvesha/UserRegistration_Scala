package com.fellowship.test
import com.fellowship.UserRegistration
import org.scalatest.FunSuite

class UserRegistrationTest extends FunSuite{
  val userRegistration = new UserRegistration()
  test ("givenFirstNameWhenValidReturnTrue") {
    assert(userRegistration.validateFirstName("Cheluvesha") === true)
  }
  test ("givenFirstNameWhenNotValidReturnFalse") {
    assert(userRegistration.validateFirstName("Ch") === false)
  }
  test ("givenLastNameWhenValidReturnTrue") {
    assert(userRegistration.validateLastName("Bharath") === true)
  }
  test ("givenLastNameWhenNotValidReturnFalse") {
    assert(userRegistration.validateLastName("Bh") === false)
  }
}
