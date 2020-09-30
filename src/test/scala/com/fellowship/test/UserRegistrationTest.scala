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
  test ("givenEmailWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateEmail("abc.xyz@bl.com.in") === true)
  }
  test ("givenEmailWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateEmail("com.in") === false)
  }
  test ("givenMobNumWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateMobNum("91 7894561234") === true)
  }
  test ("givenMobNumWithNoSpaceWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateMobNum("917894561234") === true)
  }
  test ("givenMobNumWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validateMobNum("91789") === false)
  }
  test ("givenPasswordWithMinimum8CharsWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validatePasswordMin8Chars("917hbgh$") === true)
  }
  test ("givenPasswordWithMinimum8CharsWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validatePasswordMin8Chars("9") === false)
  }
  test ("givenPasswordWith1UppercaseWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWith1UpperCase("baasD6767") === true)
  }
  test ("givenPasswordWithNoUppercaseWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWith1UpperCase("baa6767") === false)
  }
  test ("givenPasswordWithNumericWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWithNumeric("baasD6767") === true)
  }
  test ("givenPasswordWithNoNumericWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWithNumeric("baa") === false)
  }
  test ("givenPasswordWithSpecialSymbolWhenValidReturnTrue") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWithSpecialSymbol("baasD6$767") === true)
  }
  test ("givenPasswordWithNoSpecialSymbolWhenNotValidReturnFalse") {
    val userRegistration = new UserRegistration()
    assert(userRegistration.validPassWithSpecialSymbol("baasD767") === false)
  }
}