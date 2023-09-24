data class Teacher(
    val id: Int = 0,
    val name: String
) {
    override fun toString(): String {
        return super.toString()
    }

    fun getName(): String {
        return name
    }

}