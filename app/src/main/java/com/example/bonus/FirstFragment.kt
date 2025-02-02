package com.example.bonus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bonus.databinding.FragmentFirstBinding
import com.example.bonus.viewmodel.CounterViewModel

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        viewModel = ViewModelProvider(requireActivity()).get(CounterViewModel::class.java)


        binding = FragmentFirstBinding.inflate(inflater, container, false)


        binding.textViewCounter.text = "Counter: ${viewModel.counter}"


        binding.buttonIncreaseCounter.setOnClickListener {
            viewModel.counter++
            binding.textViewCounter.text = "Counter: ${viewModel.counter}"
        }

        return binding.root
    }
}
