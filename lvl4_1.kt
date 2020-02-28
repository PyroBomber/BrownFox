import java.util.*

fun main(args: Array<String>){

    var words: SortedMap<String, Int?> = sortedMapOf(args[0] to 1)

    for(i in 1 until args.size){
        if(words.containsKey(args[i])){
            words[args[i]] = words[args[i]]?.plus(1)
        }
        else{
            words.put(args[i], 1)
        }
    }

    for(word in words)
        println("${word.key} ${word.value}")
}