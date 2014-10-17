package kata

import org.specs2.mutable.Specification

class DummySpec extends Specification {

  "Dummy#dummy" should {

    "return true" in {
      Dummy.dummy() must beTrue
    }

  }

}
