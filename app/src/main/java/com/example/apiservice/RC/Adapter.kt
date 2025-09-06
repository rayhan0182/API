package com.example.apiservice.RC

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apiservice.Model.Showdata
import com.example.apiservice.databinding.ItemsBinding

class Adapter(private val ulist: List<Showdata>): RecyclerView.Adapter<Adapter.Viewholder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Viewholder {

        val bind = ItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)

       return Viewholder(bind)

    }


    override fun onBindViewHolder(
        holder: Viewholder,
        position: Int
    ) {


        holder.binding.apply {

            ulist[position].let {

                this.name.text = it.name

                this.uname.text = it.username

                this.email.text = it.email

                this.street.text = it.address.street

                this.suite.text = it.address.suite

                this.city.text = it.address.city

                this.lat.text = it.address.geo.lat

                this.lng.text = it.address.geo.lng

                this.phone.text = it.phone

                this.website.text = it.website

                this.name2.text = it.company.name

                this.catchPhrase.text = it.company.catchPhrase

                this.bs.text = it.company.bs
            }

        }


    }

    override fun getItemCount(): Int {

       return ulist.size

    }


    inner class Viewholder(val binding: ItemsBinding): RecyclerView.ViewHolder(binding.root)

}