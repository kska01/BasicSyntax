package seventeen_six_one_one

interface MyInterface<T> {
    fun myFun(): T
}

class MyClass: MyInterface<String> {
    override fun myFun(): String {
        return "hello"
    }
}

class MyClass2: MyInterface<Unit> {
    override fun myFun() {
        
    }
}