package com.example.mod4tpvraifaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val listQuestionReponse = arrayListOf(
        QuestionReponse("Est-ce que la terre est plate", true),
        QuestionReponse("La 5g va nous tuer",true),
        QuestionReponse("Est-ce que Bill Gates a acheté Moderna",true),
        QuestionReponse("Est-ce que Macron est un reptilien", true),
        QuestionReponse("Est-ce que Zuckerberg est un robot",true),
    )
    var index = 0
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        displayQuestion()
        binding.buttonFaux.setOnClickListener { checkResponse(false) }
        binding.buttonVrai.setOnClickListener { checkResponse(true) }
    }

    fun displayQuestion(){
        if(index <= listQuestionReponse.size -1){
            binding.qr = listQuestionReponse[index]
        }else{
            binding.buttonFaux.isEnabled = false
            binding.buttonVrai.isEnabled = false
        }
    }

    fun checkResponse(responseUser : Boolean){
        if(responseUser == listQuestionReponse[index].reponse){
            binding.textViewScore.text = "${++score}/${listQuestionReponse.size}"
        }
        index++
        displayQuestion()
    }
}