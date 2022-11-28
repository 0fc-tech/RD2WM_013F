package com.example.mod5tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mod5tphistoire.databinding.FragmentStoryBinding

class StoryFragment : Fragment() {
    lateinit var fsb : FragmentStoryBinding
    val args : StoryFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fsb = FragmentStoryBinding.inflate(inflater,container,false)
        return fsb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fsb.textViewStory.text = "Il était une fois un être nommé ${args.story.prenom} et" +
                " qui vivait dans un(e) ${args.story.lieu}"
        fsb.textViewStory.textSize = 25f
    }


}