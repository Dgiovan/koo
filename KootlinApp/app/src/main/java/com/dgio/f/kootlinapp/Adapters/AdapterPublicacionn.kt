package com.dgio.f.kootlinapp.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.dgio.f.kootlinapp.R
import com.dgio.f.kootlinapp.publicacion

class AdapterPublicacionn(val usuarios:ArrayList<publicacion>):RecyclerView.Adapter<AdapterPublicacionn.mViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.itemadapter,parent,false)

        return mViewHolder(view as ViewGroup)
    }
    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
       holder.bindItems(usuarios[position])

    }
    class mViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(usuarios: publicacion){
            val image = itemView.findViewById(R.id.imageI) as ImageView
            val title = itemView.findViewById(R.id.titles) as TextView
            val correo = itemView.findViewById(R.id.correos)as TextView
            val Nacionalida = itemView.findViewById(R.id.Nacionalidad) as TextView

           // image.drawable= usuarios.image;
            title.text = usuarios.titulo.toString()
            correo.text = usuarios.correo.toString()
            Nacionalida.text = usuarios.Nacionalidad.toString()

        }
    }

    override fun getItemCount(): Int {
      return usuarios.size
    }




}