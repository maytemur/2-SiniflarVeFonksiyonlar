package com.maytemur.siniflarvefonksiyonlar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maytemur.siniflarvefonksiyonlar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var j = 5

        if(j==0){

        ilkFonksiyon()
        } else {
        ikinciFonksiyon()
        }

        cikarma (320,20)
        var x= toplama (10,20)

        binding.textView.text = "Sonuç : ${x}"

        binding.button.setOnClickListener {
            val toplamaSonucu = toplama (100,60)
            binding.textView.text ="YeniSonuç : ${toplamaSonucu}"
        }


    }

    fun ilkFonksiyon() {
        println ("ilk fonksiyon çalıştırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon çalıştırıldı")
    }
    //Girdi Almak
    fun cikarma (x: Int,y: Int){
        binding.textView.text= "Sonuç : ${x-y}"
    }
    //Çıktı Vermek --- Döndürmek (Return)

    fun toplama (a: Int, b:Int) : Int {
        return a+b
    }
    /*
    fun degistir (view : View){
        val toplamaSonucu = toplama (40,50)
        binding.textView.text = "Sonuç : ${toplamaSonucu}"
    } */
}