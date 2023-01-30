package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()){
               var plakakodu = binding.editTextNumber.text.toString().toInt()
                when(plakakodu){
                    1 -> binding.textView.text="Adana"
                    2 -> binding.textView.text="Adıyaman"
                    3 -> binding.textView.text="Afyon"
                    4 -> binding.textView.text="Agri"
                    5 -> binding.textView.text="Amasya"
                    6 -> binding.textView.text="Ankara"
                    7 -> binding.textView.text="Antalya"
                    8 -> binding.textView.text="Artvin"
                    9 -> binding.textView.text="Aydın"
                    10 -> binding.textView.text="BalıkEsir"
                    11 -> binding.textView.text="Bilecik"
                    12 -> binding.textView.text="Bingöl"
                    else ->{
                        binding.textView.text = "Böyle Bir Şehir Yok!"
                    }
                }
            }
            else{
                binding.textView.text ="Şehir Plaka Kodunu Giriniz."
            }
            binding.editTextNumber.text.clear()

        }


    }
}
