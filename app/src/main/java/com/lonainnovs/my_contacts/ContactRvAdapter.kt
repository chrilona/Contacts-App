package com.lonainnovs.my_contacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.lonainnovs.my_contacts.databinding.ContactsListBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contacts:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        var binding = ContactsListBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contacts.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhone.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAdress.text = currentContact.address
        Picasso.get().load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_outline_24)
            .into(holder.binding.imgContacts)
        val context = holder.itemView.context
        holder.binding.imgContacts.setOnClickListener {
          Toast
              .makeText(context,"You have clicked the image",Toast.LENGTH_SHORT)
              .show()
        }
        holder.binding.cvContacts.setOnClickListener {
            val intent =Intent(context,ViewContactActivity::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("Address",currentContact.address)
            intent.putExtra("PhoneNumber",currentContact.phoneNumber)
            intent.putExtra("Email",currentContact.email)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return  contacts.size
    }
}
class ContactViewHolder(val binding: ContactsListBinding):
    RecyclerView.ViewHolder(binding.root)
