import zio.test.*
import zio.test.Assertion.*
import zio.http.*
import zio.*

object AppSpec extends ZIOSpecDefault:
  def spec = suite("App")(
    test("boolean"):
      assertTrue("asdf" == "asdf")
    ,
    test("response"):
      assertTrue(Response.ok.status.isSuccess)
  )
