package br.fib.moneyconvert

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var campoValor: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         campoValor = edtValor


        var btnDolar: Button = btnDolar
        btnDolar.setOnClickListener(this)

        var btnEuro: Button = btnEuro
        btnEuro.setOnClickListener(this)

        var btnFranco: Button = btnFranco
        btnFranco.setOnClickListener(this)

        var btnRupia: Button = btnRupia
        btnRupia.setOnClickListener(this)

        var btnLibra: Button = btnLibra
        btnLibra.setOnClickListener(this)

        var btnPeso: Button = btnPeso
        btnPeso.setOnClickListener(this)

    }


    override fun onClick(button: View?) {

        var valor: Double = 0.0

        var conversao: Double =  0.0

        if(button?.id == btnDolar.id){
            valor = campoValor!!.text.toString().toDouble()
            conversao = 3.83 * valor

            //txtResultado.setText("O valor do dolar é: R$" + dolar)
        }

        else if(button?.id == btnEuro.id){
            valor  = campoValor!!.text.toString().toDouble()
            conversao = 4.34 * valor
            //txtResultado.setText("O valor do euro é: R$" + euro)
        }

        else if(button?.id == btnRupia.id){
            valor  = campoValor!!.text.toString().toDouble()
            conversao = 0.054 * valor
            //txtResultado.setText("O valor do rupia é: R$" + rupia)
        }

        else if(button?.id == btnLibra.id){
            valor  = campoValor!!.text.toString().toDouble()
            conversao = 4.91 * valor
            //txtResultado.setText("O valor do libra é: R$" + libra)
        }

        else if(button?.id == btnFranco.id){
            valor  = campoValor!!.text.toString().toDouble()
            conversao = 3.84 * valor
            //txtResultado.setText("O valor do franco é: R$" + franco)
        }

        else if(button?.id == btnPeso.id){
            valor  = campoValor!!.text.toString().toDouble()
            conversao = 0.10 * valor
            //txtResultado.setText("O valor do peso é: R$" + peso)
        }

        val intent = Intent(this@MainActivity, ResultadoActivity::class.java)
        intent.putExtra("valorConvertido", conversao)
        startActivity(intent)


    }

}
