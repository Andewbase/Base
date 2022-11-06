package z.nova.usecase4mvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import org.koin.androidx.viewmodel.ext.android.viewModel
import z.nova.usecase5koin.R


class MainActivity : AppCompatActivity() {



    private val vm by viewModel<MainMVVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("AAA", "Activity created")

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditText = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        vm.resultLive.observe(this, { text ->

            dataTextView.text = text

        })

        sendButton.setOnClickListener{
        val text = dataEditText.text.toString()
         vm.save(text)
        }

        receiveButton.setOnClickListener{
         vm.load()
        }
    }




}