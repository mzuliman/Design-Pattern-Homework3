interface Handler {
    fun addHeader(inputHeader: String): String
}

class Beginning(val beginning: String,var next: Handler? = null): Handler{
    override fun addHeader(inputHeader: String) =
        "$inputHeader\n$beginning"
            .let { next?.addHeader(it)?: it }

}

class Middle(val middle: String, var next: Handler? = null): Handler{
    override fun addHeader(inputHeader: String)=
        "$inputHeader\n$middle"
            .let { next?.addHeader(it)?: it }
}

class Last(val last: String, var next: Handler? = null): Handler{
    override fun addHeader(inputHeader: String)=
        "$inputHeader\n$last"
            .let { next?.addHeader(it)?: it }
}


