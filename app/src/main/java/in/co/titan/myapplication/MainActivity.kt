package `in`.co.titan.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
// Testing the GitHub Push
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val userid = findViewById(R.id.userid)as EditText
        val password = findViewById(R.id.password)as EditText
        val login = findViewById(R.id.login)as android.support.v7.widget.AppCompatButton
        login.setOnClickListener{
Log.d("UserID",userid.text.toString())
            Log.d("Password", password.text.toString())
            if(userid.text.toString().equals("Vishwa") && password.text.toString().equals("Vishwa123")) {

                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                intent.putExtra("key", userid.text.toString())
                startActivity(intent)
           }else{
                Toast.makeText(this,"Incorrect User ID or Password", Toast.LENGTH_LONG).show()
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
