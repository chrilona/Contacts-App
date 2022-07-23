package com.lonainnovs.my_contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lonainnovs.my_contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts(){
        var con = Contacts("Yasmin Mahad","mahadabdullahi@gamil.com","O74567878",
        "Kakuma","https://images.unsplash.com/photo-1606416132922-22ab37c1231e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjB3b21lbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var con1= Contacts("Sabdio Godana","sabdioj@gmail.com","075679876",
        "Marsabit","https://images.unsplash.com/photo-1607868894064-2b6e7ed1b324?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmxhY2slMjB3b21lbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var con2= Contacts("Sakina Noha","nohasakins@.com","075679876",
            "Marsabit","https://images.unsplash.com/photo-1589317621382-0cbef7ffcc4c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8YmxhY2slMjB3b21lbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var con3= Contacts("Lona Noha","nohasakins@.com","075679876",
            "Marsabit","https://images.unsplash.com/photo-1585870683904-a382fbb42754?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwd29tZW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var con4= Contacts("Virgy Njeri","nohasakins@.com","075679876",
            "Marsabit","https://images.unsplash.com/photo-1591933319095-9bc25b14b0b1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGJsYWNrJTIwd29tZW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var con5= Contacts("Ashley Epuu","nohasakins@.com","075679876",
            "Marsabit","https://media.istockphoto.com/photos/young-woman-with-backpack-outdoors-picture-id1344837084?b=1&k=20&m=1344837084&s=170667a&w=0&h=2p5UshNVhibqLwlRaINCyn8LRoAa-JHmX8XXiJEPYXE=")
        var contactsAll= listOf( con,con1,con2,con3,con4,con5)
        var contactsAdapter= ContactRvAdapter(contactsAll)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}