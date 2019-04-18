package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Saugat alla","9854895522",R.drawable.saugat));
        contactsList.add(new Contacts("Dayahang Rai","9845254852",R.drawable.dahayang));
        contactsList.add(new Contacts("Rajesh Hamal","9841245200",R.drawable.rajesh));
        contactsList.add(new Contacts("Bhuwan KC","9874512322",R.drawable.bhuwan));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
