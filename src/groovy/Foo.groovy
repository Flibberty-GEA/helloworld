import helloworld.Person

/**
 * Created by yevgen on 05.05.17.
 */
class Foo {
    static void main(String[] args) {

        def p = new Person(name: "Fred", age: 40, lastVisit: new Date())
        def v = p.save()
        print Objects.isNull(v)
    }

}
