package br.fib.moneyconvert

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var txtR: TextView = txtResult

        val intent = intent
        if (intent != null) {
            val resultadoActivity = intent.getDoubleExtra("valorConvertido", 0.0)

            txtR.setText("O valor da conversão é: R$" + resultadoActivity)

            //txtResult.setText("O valor do peso é: R$" + peso)
        }

    }
}
