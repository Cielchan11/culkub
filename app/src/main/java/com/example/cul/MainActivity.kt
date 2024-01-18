package com.example.cul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {

        var j = 1
        lateinit var show: TextView
        var str:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textn:TextView = findViewById(R.id.textn)
        val n0:Button = findViewById(R.id.n0)
        val n1:Button = findViewById(R.id.n1)
        val n2:Button = findViewById(R.id.n2)
        val n3:Button = findViewById(R.id.n3)
        val n4:Button = findViewById(R.id.n4)
        val n5:Button = findViewById(R.id.n5)
        val n6:Button = findViewById(R.id.n6)
        val n7:Button = findViewById(R.id.n7)
        val n8:Button = findViewById(R.id.n8)
        val n9:Button = findViewById(R.id.n9)

        val cancel:Button = findViewById(R.id.cancel)
        val del:Button = findViewById(R.id.del)
        val mod:Button = findViewById(R.id.mod)
        val hun:Button = findViewById(R.id.hun)
        val kun:Button = findViewById(R.id.kun)
        val minus:Button = findViewById(R.id.minus)
        val plus:Button = findViewById(R.id.plus)
        val equal:Button = findViewById(R.id.equal)
        val dot:Button = findViewById(R.id.dot)

        var operator = ""
        var operand1 = ""
        var operand2 = ""
        var currentNumber = ""
        show = findViewById(R.id.textn)

        cancel.setOnClickListener {
            currentNumber = ""
            show.setText("0")
            }

        plus.setOnClickListener {
            operator = "+"
            operand1 = currentNumber
            currentNumber = ""
            show.text = "0"
        }

        minus.setOnClickListener {
            operator = "-"
            operand1 = currentNumber
            currentNumber = ""
            show.text = "0"
        }

        kun.setOnClickListener {
            operator = "*"
            operand1 = currentNumber
            currentNumber = ""
            show.text = "0"
        }

        hun.setOnClickListener {
            operator = "/"
            operand1 = currentNumber
            currentNumber = ""
            show.text = "0"
        }

        mod.setOnClickListener {
            operator = "%"
            operand1 = currentNumber
            currentNumber = ""
            show.text = "0"
        }

        equal.setOnClickListener {
            operand2 = currentNumber
            var result = 0.0
            try {
                when (operator) {
                    "+" -> result = operand1.toDouble() + operand2.toDouble()
                    "-" -> result = operand1.toDouble() - operand2.toDouble()
                    "*" -> result = operand1.toDouble() * operand2.toDouble()
                    "/" -> {
                        if (operand2.toDouble() == 0.0) {
                            show.text = "Error: Division by zero"
                        } else {
                            result = operand1.toDouble() / operand2.toDouble()
                        }
                    }
                    "%" -> result = operand1.toDouble() % operand2.toDouble()
                }
                show.text = result.toString()
            } catch (e: NumberFormatException) {
                show.text = "Error: Invalid input"
            }
        }

        del.setOnClickListener {
            if (currentNumber.length > 1) {
                currentNumber = currentNumber.substring(0, currentNumber.length - 1)
                show.setText(currentNumber)
            } else {
                show.setText("0")
                currentNumber = ""
            }
        }

        n0.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                show.setText("0")
            } else {
                currentNumber += "0"
                show.text = currentNumber
            }
        }

        n1.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "1"
                show.setText("1")
            }else{
                currentNumber += "1"
                show.text = currentNumber
            }
        }

        n2.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "2"
                show.setText("2")
            }else{
                currentNumber += "2"
                show.text = currentNumber
            }
        }

        n3.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "3"
                show.setText("3")
            }else{
                currentNumber += "3"
                show.text = currentNumber
            }
        }

        n4.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "4"
                show.setText("4")
            }else{
                currentNumber += "4"
                show.text = currentNumber
            }
        }

        n5.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "5"
                show.setText("5")
            }else{
                currentNumber += "5"
                show.text = currentNumber
            }
        }

        n6.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "6"
                show.setText("6")
            }else{
                currentNumber += "6"
                show.text = currentNumber
            }
        }

        n7.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "7"
                show.setText("7")
            }else{
                currentNumber += "7"
                show.text = currentNumber
            }
        }

        n8.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "8"
                show.setText("8")
            }else{
                currentNumber += "8"
                show.text = currentNumber
            }
        }

        n9.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "9"
                show.setText("9")
            }else{
                currentNumber += "9"
                show.text = currentNumber
            }
        }
    }
}

