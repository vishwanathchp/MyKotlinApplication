package `in`.co.titan.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textview = findViewById(R.id.txtview)as TextView
        textview.setText("Welcome!! "+ intent.extras.getString("key"))
    }
}
