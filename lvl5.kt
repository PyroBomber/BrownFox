fun main(args: Array<String>){
    val n: Int = args.size
    var temp: String
    var repeats = IntArray(n) {1}
    var words = Array<String>(n) {"sampletext"}

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
            words[j] = args[i]
            j++
        }
        else repeats[j]++
    }

    if(args[n-1] == args[n-2]) {
        //repeats[0] = 1
        words[j] = args[n-1]
    }

    val wordscount: Int = j
    var tempint: Int = 0


    for(i in 1 until wordscount+1) {
        for(j in 1 until wordscount+2-i) {
            if(repeats[j] > repeats[j-1]) {
                temp = words[j]
                words[j] = words[j-1]
                words[j-1] = temp

                tempint = repeats[j]
                repeats[j] = repeats[j-1]
                repeats[j-1] = tempint
            }
        }
    }

    for(i in 0 .. wordscount)
        println("${words[i]} ${repeats[i]}")

}