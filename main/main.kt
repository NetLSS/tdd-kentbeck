package main


open class A {
    open fun func() {
        println("A")
    }
}

class B: A() {
    override fun func() {
        println("B")
    }
}

class C: A() {
    override fun func() {
        println("C")
    }
}

fun main() {
    val a = A()
    val b = B()
    val c = C()

    val AB: A = b

    AB.func()

    (b as A).func()
}