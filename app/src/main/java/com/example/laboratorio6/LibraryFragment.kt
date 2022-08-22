package com.example.laboratorio6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [LibraryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LibraryFragment : Fragment(R.layout.fragment_library) {

    private lateinit var ButtonCount:ImageButton
    private lateinit var TextCount:TextView
    private var count:Int =0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ButtonCount=view.findViewById(R.id.imageButton_LibrarFragment_add)
        TextCount=view.findViewById(R.id.textView_LibraryFragment_add)

        setListeners()

    }

    private fun setListeners() {
        ButtonCount.setOnClickListener{
            count++
            TextCount.text=count.toString()
        }
    }


}