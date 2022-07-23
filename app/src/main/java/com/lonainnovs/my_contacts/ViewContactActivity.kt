package com.lonainnovs.my_contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lonainnovs.my_contacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

//You have added images to your contacts app. Implement the following:
//When a contact card is clicked, open the contact in a new activity,
//ViewContactActivity. Pass the contact details using the intent.putExtra() function. In
//the ViewContactActivity display all the details of the contact passed through the
//intent, including the image. Add icons for call and sms to the view contact layout.
//(10 pts)
class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name =intent.extras?.getString("Name")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        var email =intent.extras?.getString("Email")
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()
        var phonenumber =intent.extras?.getString("PhoneNumber")
        Toast.makeText(this,phonenumber,Toast.LENGTH_LONG).show()
        var addresss =intent.extras?.getString("Address")
        Toast.makeText(this,addresss,Toast.LENGTH_LONG).show()
        var images= binding.imgContact
        binding.tvNamme.text=name
        binding.tvEmaill.text=email
        binding.tvLocation.text = addresss
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(images)
    }
}