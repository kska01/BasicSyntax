fun main() = with(System.out.bufferedWriter()) {
    repeat(readln().toInt()) {
        readln()
        val (r, str) = readln().split(' ')
        for (v in str) {
            repeat(r.toInt()) {
                write("$v")
            }
        }
        write("\n")
    }
    flush()
    close()
}