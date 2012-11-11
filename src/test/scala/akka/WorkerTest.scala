package akka

import org.scalatest.{FunSuite, BeforeAndAfterAll}
import akka.testkit.TestActorRef
import akka.actor.ActorSystem

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WorkerTest extends FunSuite with BeforeAndAfterAll
{
  //implicit val system = ActorSystem()

  override def afterAll {
    //system.shutdown()
  }

  test("Worker calculate pi correctly")
  {
      /**val testActor = TestActorRef[Pi.Worker]
      val actor = testActor.underlyingActor
      val piFor0: Double = actor.calculatePiFor(0, 0)
      assert (piFor0 === 0.0)
      println("piFor0="+piFor0)

      val piFor1: Double = actor.calculatePiFor(1, 1)
      assert (piFor1 === -1.3333333333333333)
      println("piFor1="+piFor1)**/
  }
}