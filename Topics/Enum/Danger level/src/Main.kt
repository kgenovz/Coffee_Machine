enum class DangerLevel(val threat: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = this.threat
}
