fun main(args: Array<String>){

    var words: MutableMap<String, Int?> = mutableMapOf(args[0] to 1)

    for(i in 1 until args.size){
        if(words.containsKey(args[i])){
            words[args[i]] = words[args[i]]?.plus(1)
        }
        else{
            words[args[i]] = 1
        }
    }

    words = words.toSortedMap()
    var newWords: Map<String, Int?> = words.toList().sortedByDescending { it.second }.toMap()

    for(word in newWords)
        println("${word.key} ${word.value}")
}