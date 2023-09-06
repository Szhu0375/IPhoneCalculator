package com.example.iphonecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var expression = "0"

        var button1 : Button = findViewById(R.id.C)
        button1.setOnClickListener {
            pressedC(expression)
        }
        var button2 : Button = findViewById(R.id.plusminus)
        button2.setOnClickListener {
            pressedPlusMinus(expression)
        }
        var button3 : Button = findViewById(R.id.percentage)
        button3.setOnClickListener {
            pressedPercentage(expression)
        }
        var button4 : Button = findViewById(R.id.slash)
        button4.setOnClickListener {
            pressedDivide(expression)
        }
        var button5 : Button = findViewById(R.id.seven)
        button5.setOnClickListener {
            pressedSeven(expression)
        }
        var button6 : Button = findViewById(R.id.eight)
        button6.setOnClickListener {
            pressedEight(expression)
        }
        var button7 : Button = findViewById(R.id.nine)
        button7.setOnClickListener {
            pressedNine(expression)
        }
        var button8 : Button = findViewById(R.id.X)
        button8.setOnClickListener {
            pressedMultiply(expression)
        }
        var button9 : Button = findViewById(R.id.four)
        button9.setOnClickListener {
            pressedFour(expression)
        }
        var button10 : Button = findViewById(R.id.five)
        button10.setOnClickListener {
            pressedFive(expression)
        }
        var button11 : Button = findViewById(R.id.six)
        button11.setOnClickListener {
            pressedSix(expression)
        }
        var button12 : Button = findViewById(R.id.minus)
        button12.setOnClickListener {
            pressedMinus(expression)
        }
        var button13 : Button = findViewById(R.id.one)
        button13.setOnClickListener {
            pressedOne(expression)
        }
        var button14 : Button = findViewById(R.id.two)
        button14.setOnClickListener {
            pressedTwo(expression)
        }
        var button15 : Button = findViewById(R.id.three)
        button15.setOnClickListener {
            pressedThree(expression)
        }
        var button16 : Button = findViewById(R.id.plus)
        button16.setOnClickListener {
            pressedPlus(expression)
        }
        var button17 : Button = findViewById(R.id.zero)
        button17.setOnClickListener {
            pressedZero(expression)
        }
        var button18 : Button = findViewById(R.id.period)
        button18.setOnClickListener {
            pressedPeriod(expression)
        }
        var button19 : Button = findViewById(R.id.equal)
        button19.setOnClickListener {
            pressedEqual(expression)
        }
    }

    fun pressedC (expression: String):String {
        return "0"
    }

    fun pressedPlusMinus (expression: String) : String {
        var num = expression.toInt()
        if (num > 0) {
            var newNum = -num
            return newNum.toString()
        }
        else {
            var newNum = +num
            return newNum.toString()
        }
    }

    fun pressedPercentage (expression: String):String {
        var num = expression.toInt()
        var newNum = num/100
        return newNum.toString()
    }

    fun pressedDivide (expression: String) {

    }

    fun pressedSeven (expression: String):String {
        var newString = expression.plus("").plus("7")
        return newString
    }

    fun pressedEight(expression: String):String {
        var newString = expression.plus("").plus("8")
        return newString
    }

    fun pressedNine (expression: String):String {
        var newString = expression.plus("").plus("9")
        return newString
    }

    fun pressedMultiply (expression: String) {

    }

    fun pressedFour (expression: String):String {
        var newString = expression.plus("").plus("4")
        return newString
    }

    fun pressedFive (expression: String):String {
        var newString = expression.plus("").plus("5")
        return newString
    }

    fun pressedSix (expression: String):String {
        var newString = expression.plus("").plus("6")
        return newString
    }

    fun pressedMinus (expression: String) {

    }

    fun pressedOne (expression: String):String {
        var newString = expression.plus("").plus("1")
        return newString
    }

    fun pressedTwo (expression: String):String {
        var newString = expression.plus("").plus("2")
        return newString
    }

    fun pressedThree (expression: String):String {
        var newString = expression.plus("").plus("3")
        return newString
    }

    fun pressedPlus (expression: String) {

    }

    fun pressedZero (expression: String):String {
        var newString = expression.plus("").plus("0")
        return newString
    }

    fun pressedPeriod (expression: String) {

    }

    fun pressedEqual (expression: String) {

    }
