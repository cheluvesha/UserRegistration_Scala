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
}
