package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox;
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oriPrice = findViewById<EditText>(R.id.oriprice)
        val perPrice = findViewById<EditText>(R.id.perPrice)
        val totalText = findViewById<TextView>(R.id.totalText)
        val btCal = findViewById<Button>(R.id.btcal)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)

        btCal.setOnClickListener(){

            var originalPrice:Float = oriPrice.text.toString().toFloat()
            var percentPrice:Float = perPrice.text.toString().toFloat()

            var totalPrice:Float =(originalPrice*percentPrice)/100
            var lastPrice:Float = originalPrice - totalPrice


            if( checkbox.isChecked()) {
                var vax:Float = (lastPrice*7)/100
                lastPrice = lastPrice+vax
            }
            totalText.text = lastPrice.toString()

        }













    }


}