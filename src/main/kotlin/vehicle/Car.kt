package vehicle

class Car {
    // var
    var maxSpeed: Double = 10.0
        set(value) {
            if (value <= 100.0) {
                if (value >= 1) {
                    field = value
                } else {
                    println("Failed Setting")
                }
            } else {
                println("Failed Setting")
            }
        }
    var minSpeed: Double = 0.0
        set(value) {
            if (value <= 20.0) {
                if (value >= 1) {
                    field = value
                } else {
                    println("Failed Setting")
                }
            }   else {
                println("Failed Setting")
            }
        }
    var nameOfCar: String = ""
    var doors: Int = 2
        set(value) {
            if (value <= 6) {
                if (value >= 1) {
                    field = value
                } else {
                    println("Failed Setting")
                }
            } else {
                println("Failed Setting")
            }
        }
    var windows: Int = 2
        set(value) {
            if (value <= 10) {
                if (value >= 1) {
                    field = value
                } else {
                    println("Failed Setting")
                }
            } else {
                println("Failed Setting")
            }
        }
    var owner: String = ""
}

