fun personTest() {
    val person = Person("iljun", false)

    println(person.name)
    println(person.married)

    person.married = true

    println(person.married)

    println(person.lastName)
}
