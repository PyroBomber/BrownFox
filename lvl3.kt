fun main(args: Array<String>){
    val n: Int = args.size
    var temp: String

    for(i in 0 until n-1)
    {
        for(j in 0 until n-1-i)
        {
            if(args[j] > args[j+1])
            {
                temp = args[j]
                args[j] = args[j+1]
                args[j+1] = temp
            }
        }
    }

    println(args[0])

    for (i in 1 until n)
    {
        if(args[i] != args[i-1])
            println(args[i])
    }
}