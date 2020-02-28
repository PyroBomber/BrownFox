fun main(args: Array<String>){

    var words: Set<String> = args.toSortedSet()

    for(word in words)
        println(word)
}