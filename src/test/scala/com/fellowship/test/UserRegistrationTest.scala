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
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateLastName("Bh") === false)
  }
  test ("givenEmailWhenValidReturnTrue") {
    assert(userRegistration.validateEmail("abc.xyz@bl.com.in") === true)
  }
  test ("givenEmailWhenNotValidReturnFalse") {
    assert(userRegistration.validateEmail("com.in") === false)
  }
  test ("givenMobNumWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateMobNum("91 7894561234") === true)
  }
  test ("givenMobNumWithNoSpaceWhenValidReturnTrue") {
    assert(userRegistration.validateMobNum("917894561234") === true)
  }
  test ("givenMobNumWhenNotValidReturnFalse") {
    assert(userRegistration.validateMobNum("91789") === false)
  }
}
