fun main() {
    val bw = System.out.bufferedWriter()
    val n = readln().toInt()
    for(i in 1..n) {
        repeat(i) {
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}