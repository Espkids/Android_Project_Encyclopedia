package buu.informatics.s59160586.encyclopedia


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160586.encyclopedia.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class AnimalDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_animal_detail,container,false)
        return binding.root
    }


}
