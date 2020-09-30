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
  test ("givenEmailWhenValidReturnTrue") {
    assert(userRegistration.validateEmail("abc.xyz@bl.com.in") === true)
  }
  test ("givenEmailWhenNotValidReturnFalse") {
    assert(userRegistration.validateEmail("com.in") === false)
  }
  test ("givenMobNumWhenValidReturnTrue") {
    assert(userRegistration.validateMobNum("91 7894561234") === true)
  }
  test ("givenMobNumWithNoSpaceWhenValidReturnTrue") {
    assert(userRegistration.validateMobNum("917894561234") === true)
  }
  test ("givenMobNumWhenNotValidReturnFalse") {
    assert(userRegistration.validateMobNum("91789") === false)
  }
  test ("givenPasswordWithMinimum8CharsWhenValidReturnTrue") {
    assert(userRegistration.validatePasswordMin8Chars("917hbgh$") === true)
  }
  test ("givenPasswordWithMinimum8CharsWhenNotValidReturnFalse") {
    assert(userRegistration.validatePasswordMin8Chars("9") === false)
  }
  test ("givenPasswordWith1UppercaseWhenValidReturnTrue") {
    assert(userRegistration.validPassWith1UpperCase("baasD6767") === true)
  }
  test ("givenPasswordWithNoUppercaseWhenNotValidReturnFalse") {
    assert(userRegistration.validPassWith1UpperCase("baa6767") === false)
  }
  test ("givenPasswordWithNumericWhenValidReturnTrue") {
    assert(userRegistration.validPassWithNumeric("baasD6767") === true)
  }
  test ("givenPasswordWithNoNumericWhenNotValidReturnFalse") {
    assert(userRegistration.validPassWithNumeric("baa") === false)
  }
  test ("givenPasswordWithSpecialSymbolWhenValidReturnTrue") {
    assert(userRegistration.validPassWithSpecialSymbol("baasD6$767") === true)
  }
  test ("givenPasswordWithNoSpecialSymbolWhenNotValidReturnFalse") {
    assert(userRegistration.validPassWithSpecialSymbol("baasD767") === false)
  }
}