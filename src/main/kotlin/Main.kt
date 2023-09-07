//fun main() {
//    val a: String = readln()
//    var b: Int = 1
//    var c: String = ""
//    for (i: Int in 1 until a.length) {
//        if (a[i - 1] == a[i]) {
//            b += 1
//        } else {
//            c += a[i - 1]
//            if (b > 1) {
//                c += b
//            }
//            b = 1
//        }
//        if (i == a.length - 1) {
//            c += a[i]
//            if (b > 1) c += b
//        }
//    }
//    println(c)
//}


//}//fun main() {
//    val a = readln().groupingBy { it }.eachCount().toSortedMap()
//    for (item in a)
//        println(item.toString().replace('=', '-'))
//}


//fun main() {
//    print(Integer.toBinaryString(Integer.parseInt(readln())))
//}

//fun main() {
//    println("Укажите два числа и символ операции, пример: 2 2 +. Допустимые символы операции: (+/-*) ")
//    val data: String = readln()
//    val array: List<String> = data.split(' ')
//
//    var operator: String = array[2]
//    var operand1: Double = array[0].toDouble()
//    var operand2: Double = array[1].toDouble()
//    var res: Double? = null;
//
//    when (operator) {
//        "+" -> res = operand1 + operand2
//        "-" -> res = operand1 - operand2
//        "*" -> res = operand1 * operand2
//        "/" -> res = operand1 / operand2
//    }
//
//    println("Результат: $res")
//}

//fun main() {
//    println("Введите целое число n и основание степени x...")
//
//    var n: Double = readln().toDouble()
//    var x: Double = readln().toDouble()
//    var res = ln(n) / ln(x);
//
//
//    if (res == floor(res)) {
//        println("целочисленный показатель = $res")
//    } else {
//        println("Целочисленный показатель не существует")
//    }
//}

//fun main() {
//    println("Укажите первую цифру")
//
//    var a: Int = readln().toInt()
//
//    println("Укажите вторую цифру")
//
//    var b: Int = readln().toInt()
//
//    if ((a.toString() + b.toString()).toInt() % 2 == 1) {
//        println("Ваше нечетное число = $a$b")
//    } else if ((b.toString() + a.toString()).toInt() % 2 == 1) {
//        println("Ваше нечетное число = $b$a")
//    } else {
//        println("Создать нечетное число невозможно")
//    }
//}
