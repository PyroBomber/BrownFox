fun main(args: Array<String>){
    val n: Int = args.size
    var temp: String
    var repeats = IntArray(n) {1}

    for(i in 0 until n-1) {
        for(j in 0 until n-1-i) {
            if(args[j] > args[j+1]) {
                temp = args[j]
                args[j] = args[j+1]
                args[j+1] = temp
            }
        }
    }

    var j: Int = 0

    for (i in 0 until n-1) {
        if(args[i] != args[i+1]) {
            println("${args[i]} ${repeats[j]}")
            j += 1
        }
        else repeats[j]++
    }

    if(args[n-1] == args[n-2]) {
        //repeats[0] = 1
        println("${args[n-1]} ${repeats[j]}")
    }
}