package com.example.letsreise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StudentContactsFragment extends Fragment {

    View v;

    private RecyclerView myrecylerview;
    private List<Contact> lstContact;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.student_contacts_fragment, container, false);
        // Inflate the layout for this fragment
        myrecylerview = (RecyclerView) v.findViewById(R.id.recylerView);
        RecylerViewAdapter recylerViewAdapter = new RecylerViewAdapter(getContext(), lstContact);
        myrecylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecylerview.setAdapter(recylerViewAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Reise Member 1","9653492432"));
        lstContact.add(new Contact("Reise Member 1","9563555425"));
        lstContact.add(new Contact("Teacher 1","9657525423"));
        lstContact.add(new Contact("Teacher 1","9534821454"));
        lstContact.add(new Contact("Helpline Number","05224086524"));
        lstContact.add(new Contact("Ms. Richa Sharma","9652485631"));


    }
}
