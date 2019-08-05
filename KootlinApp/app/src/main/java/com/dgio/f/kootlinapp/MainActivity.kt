package com.dgio.f.kootlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.dgio.f.kootlinapp.Adapters.AdapterPublicacionn

class MainActivity : AppCompatActivity() {
// existe la covercion automatica
// Converter java to Kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mrcv : RecyclerView = findViewById(R.id.rcv) as RecyclerView
        mrcv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val users = ArrayList<publicacion>()
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))
        users.add(publicacion(R.drawable.gmail,"Titulo Elemento","giogirecd32@gmail.com","Mexicano"))

    val adapter = AdapterPublicacionn(users)
    mrcv.adapter= adapter

    }


}
