package com.example.mod3tp2sissa

import java.math.BigInteger

fun main() {
    var nbGrzRiz = BigInteger.ONE
    var nbGrzRizTotal = nbGrzRiz;
    println("grain de riz à la case 1 : $nbGrzRiz")

    for(case in 2..64){
        nbGrzRiz = nbGrzRiz.multiply(BigInteger.TWO)
        nbGrzRizTotal += nbGrzRiz
        println("grain de riz à la case $case : $nbGrzRiz")
    }
    println("Le nombre de grain de riz à donner à Sissa est : $nbGrzRizTotal")

}