package com.example.keigonakajima.myapplication3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    var password = ""
    val myPassword = "1234"


    

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.edit_text)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                if (s.toString() == myPassword) {
                    Log.d("hoge","")

                    val intent = Intent(this@MainActivity,SecondActivity::class.java)
                    startActivity(intent)
                }else if(s.toString() == "1"){
                    Log.d("hoge","１です")
                }else if (s.toString() == "12") {
                    Log.d("hoge","12です")
                }else {
                    Log.d("hoge","正しくない")
                }
            }
        })


        val textView1 = findViewById<TextView>(R.id.text_1)
        val textView2 = findViewById<TextView>(R.id.text_2)


        textView1.setOnClickListener {
            //1を押した時に通る
            password = password + textView1.text
            editText.setText(password)

        }


        textView2.setOnClickListener {
            //2を押した時に通る
            password = password + textView2.text
            editText.setText(password)
        }

        val textView3 = findViewById<TextView>(R.id.text_3)
        textView3.setOnClickListener {
            //1を押した時に通る
            password = password + textView3.text
            editText.setText(password)
        }

        val textView4 = findViewById<TextView>(R.id.text_4)
        textView4.setOnClickListener {
            //1を押した時に通る
            password = password + textView4.text
            editText.setText(password)
        }

        val textView5 = findViewById<TextView>(R.id.text_5)
        textView5.setOnClickListener {
            //1を押した時に通る
            password = password + textView5.text
            editText.setText(password)
        }

        val textView6 = findViewById<TextView>(R.id.text_6)
        textView6.setOnClickListener {
            //1を押した時に通る
            password = password + textView6.text
            editText.setText(password)
        }

        val textView7 = findViewById<TextView>(R.id.text_7)
        textView7.setOnClickListener {
            //1を押した時に通る
            password = password + textView7.text
            editText.setText(password)
        }

        val textView8 = findViewById<TextView>(R.id.text_8)
        textView8.setOnClickListener {
            //1を押した時に通る
            password = password + textView8.text
            editText.setText(password)
        }

        val textView9 = findViewById<TextView>(R.id.text_9)
        textView9.setOnClickListener {
            //1を押した時に通る
            password = password + textView9.text
            editText.setText(password)
        }

//        val delete = findViewById<TextView>(R.id.text_10)
//        delete.setOnClickListener {
//            Log.d("delete","文字を消す")
//            if (password.length == 0) {
//                return@setOnClickListener
//            }else {
//                password = password.substring(0,password.length-1)
//                editText.setText(password)
//            }
//        }
    }
}