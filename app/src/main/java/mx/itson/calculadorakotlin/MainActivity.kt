package mx.itson.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //var = variable que va a cambiar su valor en diferentes ambientes
    //val = constante cuyo valor no cambia
    private lateinit var txtValor1 : EditText
    private lateinit var txtValor2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtValor1 =findViewById(R.id.valor1)
        txtValor2 =findViewById(R.id.valor2)

        var btnSumar = findViewById<Button>(R.id.btnSumar)
        btnSumar.setOnClickListener(this)

        var btnRestar = findViewById<Button>(R.id.btnResta)
        btnRestar.setOnClickListener(this)

        var btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        btnMultiplicar.setOnClickListener(this)

        var btnDividir = findViewById<Button>(R.id.btnDividir)
        btnDividir.setOnClickListener(this)
    }


    fun sumar (a:Int, b:Int) : Int {
        return a + b
    }
    fun restar (a:Int, b:Int) = a - b;

    fun multiplicar(a:Int, b:Int) = a * b;

    fun dividir(a:Int, b:Int) = a / b;


    override fun onClick(v: View?) {
        when(v?.id) {
            (R.id.btnSumar) -> {

                try {
                    var resultado = sumar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                } catch (ex: Exception) {
                    Log.e("Ocurrio un error en la suma", ex.toString())
                }

                if (txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "INGRESA UNA CIFRA CORRECTA", Toast.LENGTH_SHORT).show()
                } else {
                    var resultado = sumar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                    Toast.makeText(applicationContext, "El resultado de la suma es ".plus(resultado), Toast.LENGTH_LONG).show()
                }

            }
            (R.id.btnResta) -> {

                try {
                    var resultado = restar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                } catch (ex: Exception) {
                    Log.e("Ocurrio un error en la suma", ex.toString())
                }

                if (txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "INGRESA UNA CIFRA CORRECTA", Toast.LENGTH_SHORT).show()
                } else {
                    var resultado = restar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                    Toast.makeText(applicationContext, "El resultado de la resta es ".plus(resultado), Toast.LENGTH_LONG).show()
                }
            }

            (R.id.btnMultiplicar) -> {

                try {
                    var resultado = multiplicar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                } catch (ex: Exception) {
                    Log.e("Ocurrio un error en la suma", ex.toString())
                }

                if (txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "INGRESA UNA CIFRA CORRECTA", Toast.LENGTH_SHORT).show()
                } else {
                    var resultado = multiplicar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                    Toast.makeText(applicationContext, "El resultado de la multiplicacion es ".plus(resultado), Toast.LENGTH_LONG).show()
                }

            }
            (R.id.btnDividir) -> {

                try {
                    var resultado = dividir(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                } catch (ex: Exception) {
                    Log.e("Ocurrio un error en la suma", ex.toString())
                }

                if (txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "INGRESA UNA CIFRA CORRECTA", Toast.LENGTH_SHORT).show()
                } else if (txtValor1.text.toString().toInt() ==  0 || txtValor2.text.toString().toInt() == 0) {
                    Toast.makeText(applicationContext, "INGRESA UNA CIFRA CORRECTA", Toast.LENGTH_SHORT).show()
                }

                else {
                    var resultado = dividir(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt());
                    Toast.makeText(applicationContext, "El resultado de la division es ".plus(resultado), Toast.LENGTH_LONG).show()
                }



            }
        }
    }
}