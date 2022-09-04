open class Class : Welcome {
    fun game() {
        while (true) {
            print("\nMOHON MASUKAN PILIHAN KAMU: ")
            val navigasi: Welcome = Class()
            val playerinput = readln()
            val com = arrayListOf("BATU", "GUNTING", "KERTAS")
            val inputCom = com.random()
            val arr = arrayOf("1","2","3","4","0")

            if (playerinput == "1") {
                println("Kamu memilih GUNTING")
                println("Komputer memilih $inputCom")
                when (inputCom) {
                    "GUNTING" -> {
                        println("Hasil : DRAW!!!")
                    }

                    "BATU" -> {
                        println("Kamu KALAH!!!")
                    }

                    else -> println("Kamu MENANG!!!")
                }
                }
                if (playerinput == "2") {
                    println("Kamu memilih BATU")
                    println("Komputer memilih $inputCom")
                    when (inputCom) {
                        "GUNTING" -> {
                            println("Hasil: Kamu MENANG!!!")
                        }

                        "BATU" -> {
                            println("Hasil: DRAW!!!")
                        }

                        else -> println("Hasil: Kamu KALAH!!!")
                    }
                }
                if (playerinput == "3") {
                    println("Kamu memilih KERTAS")
                    println("Komputer memilih $inputCom")
                    when (inputCom) {
                        "BATU" -> {
                            println("Hasil: kamu MENANG!!!")
                        }

                        "KERTAS" -> {
                            println("Hasil: DRAW!!!")
                        }

                        else -> println("Hasil: Kamu KALAH!!!")
                    }
                }
                if (playerinput == "4") {
                    navigasi.selamatdatang()
                } else if (playerinput == "0") {
                    break
                } else if (playerinput !in arr ) println("Mohon masukan angka sesuai navigasi yang sudah diberikan! atau ketik [4] untuk melihat navigasi")
            }
        }
    }