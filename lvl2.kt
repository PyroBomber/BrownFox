fun main(args: Array<String>){
    val n: Int = args.size
    var temp: String

    for(i in 0 until n-1)
    {
        for(j in i until n-1)
        {
            if(args[j] > args[j+1])
            {
                temp = args[j]
                args[j] = args[j+1]
                args[j+1] = temp
            }
        }
    }

    for (i in args.indices)
        println(args[i])
    }