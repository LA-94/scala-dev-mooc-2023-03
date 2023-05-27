package scala.module1

import module1.opt
import org.scalatest.flatspec.AnyFlatSpec

class OptionTest extends AnyFlatSpec {

  "check zip for two Option-s: Some and Some" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option("b")

    val res = a zip b
    assertResult(false)(res.isEmpty)

    res.map(t => {
      assertResult(false)(t._1.isEmpty)
      assertResult(false)(t._2.isEmpty)
    })
  }

  "check zip for two Option-s: None and Some" should "ok" in {
    val a = opt.Option.None
    val b = opt.Option("b")

    val res = a zip b
    assertResult(true)(res.isEmpty)
  }

  "check zip for two Option-s: Some and None" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option.None

    val res = a zip b
    assertResult(true)(res.isEmpty)
  }

  "check zip2 for two Option-s: Some and Some" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option("b")

    val res = a zip2 b
    assertResult(false)(res.isEmpty)

    res.map(t => {
      assertResult(false)(t._1.isEmpty)
      assertResult(false)(t._2.isEmpty)
    })
  }

  "check zip2 for two Option-s: None and Some" should "ok" in {
    val a = opt.Option.None
    val b = opt.Option("b")

    val res = a zip2 b
    assertResult(true)(res.isEmpty)
  }

  "check zip2 for two Option-s: Some and None" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option.None

    val res = a zip2 b
    assertResult(true)(res.isEmpty)
  }

  "check zip3 for two Option-s: Some and Some" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option("b")

    val res = a zip3 b
    assertResult(false)(res.isEmpty)

    res.map(t => {
      assertResult(false)(t._1.isEmpty)
      assertResult(false)(t._2.isEmpty)
    })
  }

  "check zip3 for two Option-s: None and Some" should "ok" in {
    val a = opt.Option.None
    val b = opt.Option("b")

    val res = a zip3 b
    assertResult(true)(res.isEmpty)
  }

  "check zip3 for two Option-s: Some and None" should "ok" in {
    val a = opt.Option("a")
    val b = opt.Option.None

    val res = a zip3 b
    assertResult(true)(res.isEmpty)
  }

  "check filter for Some if filtering is performed" should "ok" in {
    val a = opt.Option("a")

    val res = a.filter(_ => true)
    assertResult(false)(res.isEmpty)
  }

  "check filter for Some if filtering is not performed" should "ok" in {
    val a = opt.Option("a")

    val res = a.filter(_ => false)
    assertResult(true)(res.isEmpty)
  }
}
