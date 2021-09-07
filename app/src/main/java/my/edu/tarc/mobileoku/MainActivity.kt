package my.edu.tarc.mobileoku

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btnNext1).setOnClickListener(){
            val intent = Intent(this, eventTest::class.java)
            startActivity(intent)

        }


        findViewById<Button>(R.id.btnNext2).setOnClickListener() {
        val openURL = Intent(Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://qmed.asia/covid-19/book/406/2622")
            startActivity(openURL)
        }

        findViewById<Button>(R.id.btnNext3).setOnClickListener(){
            val openURL2 = Intent(Intent.ACTION_VIEW)

            openURL2.data = Uri.parse("https://journals.sagepub.com/psychology-counseling")
            startActivity(openURL2)
        }

        findViewById<Button>(R.id.btnNext4).setOnClickListener(){
           val intent = Intent(this, caregiver::class.java)
            startActivity(intent)

        }


        findViewById<Button>(R.id.btnNext5).setOnClickListener(){


        }

    }
}