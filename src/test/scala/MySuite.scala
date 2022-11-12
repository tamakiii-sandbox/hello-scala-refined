// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html

case class UserId(value: String) extends AnyVal
case class Email(value: String) extends AnyVal
case class Age(value: Int) extends AnyVal
case class User(id: UserId, email: Email, age: Age)

class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("Tagged Type") {
    val id = UserId("@todokr")
    val email = Email("tadokoro@example.com")
    val age = Age(29)
    val user = User(id, email, age)
    // val user = User(email, userId, age)
    // [error] -- [E007] Type Mismatch Error: /work/src/test/scala/MySuite.scala:20:20 --------
    // [error] 20 |    val user = User(email, userId, age)
    // [error]    |                    ^^^^^
    // [error]    |    Found:    (email : Email)
    // [error]    |    Required: UserId
    // [error]    |
    // [error]    |    The following import might make progress towards fixing the problem:
    // [error]    |
    // [error]    |      import munit.Clue.generate
    // [error]    |
    // [error]    |
    // [error]    | longer explanation available when compiling with `-explain`
  }

  test("Strange User") {
    val id = UserId("")
    val email = Email("📧 📧 📧 📧 📧")
    val age = Age(-1)
    val user = User(id, email, age)
  }
}
