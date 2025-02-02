package com.example.bonus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bonus.databinding.FragmentSecondBinding
import com.example.bonus.viewmodel.CounterViewModel

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var viewModel: CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        viewModel = ViewModelProvider(requireActivity()).get(CounterViewModel::class.java)


        binding = FragmentSecondBinding.inflate(inflater, container, false)


        binding.editTextSecond.setText(viewModel.text)


        binding.buttonSaveText.setOnClickListener {
            viewModel.text = binding.editTextSecond.text.toString()
        }

        return binding.root
    }
}
