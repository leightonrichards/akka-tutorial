package akka

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

/**
 * Created with IntelliJ IDEA.
 * User: leighton
 * Date: 11/11/12
 * Time: 07:43
 * To change this template use File | Settings | File Templates.
 */
@RunWith(classOf[JUnitRunner])
class TestUnitTest extends FunSuite {

  test("TwoPlusTwo") {
    val twoPlusTwo = 2 + 2
    assert(twoPlusTwo == 4)
  }
}
