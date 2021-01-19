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

        btCal.setOnClickListener(){

            var originalPrice:Int = oriPrice.text.toString().toInt()
            var percentPrice:Int = perPrice.text.toString().toInt()

            var totalPrice:Int =(originalPrice*percentPrice)/100
            totalText.text = totalPrice.toString()
        }











    }


}