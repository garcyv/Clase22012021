package com.example.clase22012021

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.clase22012021.databinding.ActivityMainBinding
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var  mbinding: ActivityMainBinding

    private val numberList = listOf("uno","cinco","dos","tres","cuatro")
    private val listadesordenada= listOf(3,5,2,8,4,9,1)
    private val nummap= mapOf("Key1" to 10,"Key2" to 2,"Key3" to 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        mbinding.button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val uno = numberList.filter { x -> x == "uno" }
                mbinding.textView.setText(" $numberList \n Filtro elemento: $uno")
                Toast.makeText(this@MainActivity, "Boton1 $uno", Toast.LENGTH_LONG).show()
            }
        })

        mbinding.button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val uno = listadesordenada.sorted()
                mbinding.textView.setText(" $listadesordenada \n Filtro ordenada: $uno")
                Toast.makeText(this@MainActivity, "Boton2", Toast.LENGTH_LONG).show()
            }
        })

        mbinding.button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val uno = nummap.get("Key3")
                mbinding.textView.setText(" $nummap \n Filtro clave key3: $uno")
                Toast.makeText(this@MainActivity, "Boton3", Toast.LENGTH_LONG).show()
            }
        })
    }


}