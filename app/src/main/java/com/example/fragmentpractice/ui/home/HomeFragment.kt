package com.example.fragmentpractice.ui.home

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentpractice.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        showMessage("OnCreateView is called")
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        showMessage("On Attach called")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        showMessage("onActivityCreated called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showMessage("onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("Start is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("Resume is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("OnDestroy is called")
    }

    override fun onDetach() {
        super.onDetach()
        showMessage("Detach is called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        showMessage("On Destroy Called")
        _binding = null
    }
    fun showMessage(string:String){
        Log.d("LifeCycle:", string);
    }
}