package mx.edu.ittepic.tpdm_u4_practica_yanitzin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.util.Log


class MainActivity : AppCompatActivity() {

    var iniciar: Button ?= null
    var mensaje: TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar = findViewById(R.id.iniciar)
        mensaje = findViewById(R.id.mensaje)

        iniciar?.setOnClickListener(){
            iniciarThread()
        }

    }
    fun iniciarThread(){
        for(i in 0..10){
            Log.d("TAG", "inicio" + i)
            try{
                Thread.sleep(100)
            }catch (e: InterruptedException){

            }
        }

    }
    fun pararThread(view: View){

    }

}
