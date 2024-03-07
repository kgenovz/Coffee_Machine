fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var value = 20000
    value -= old * 2000
    value += (maximumSpeed - 120) * 100
    value -= (kilometers / 10000) * 200
    if (automatic) value += 1500

    print(value)
}