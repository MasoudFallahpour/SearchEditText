package ir.fallahpoor.searchedittext

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchEditText.setQueryTextChangeListener(object : SearchEditText.QueryTextListener {
            override fun onQueryTextSubmit(query: String?) {
                Toast.makeText(baseContext, query, Toast.LENGTH_SHORT).show()
            }

            override fun onQueryTextChange(newText: String?) {
            }

        })

    }

}