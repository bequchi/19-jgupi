package com.example.calkulatori1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.TextView

class MainActivity() : AppCompatActivity(), Parcelable {



     private tetanit var  resulTtextView: TextView

    private var operand: Double = 0.0
    private var operation: String = ""

    constructor(parcel: Parcel) : this() {
        operand = parcel.readDouble()
        operation = parcel.readString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resulTtextView = findViewById(R.id.resultTextView)
        fun  equalsClick(view: View){

            val secOperand: String = resulTtextView.text.toString()
    }

    fun numberClich(view: View){

        if (view is TextView){

            val value: String = view.text.toString()
            var result: String = resultTextView.texttoString()

            if  (result == "0")
                result ==""

            resulTtextView.text = result + number

        }
    }
             fun operationClick(view: View) {

                 if(view is TextView){
                     if(!TextVtils.isEmpty(resulTtextView)){
                         operand = resulTtextView.text.toString()toDouble()
                 }

                     resulTtextView.text = ""

                     operation = view.text.toString()

                     if (!TextVtils.isEmpty(secOperand)){
             }

             }


}