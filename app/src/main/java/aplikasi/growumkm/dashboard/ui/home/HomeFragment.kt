package aplikasi.growumkm.dashboard.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import aplikasi.growumkm.databinding.FragmentHomeBinding

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
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
            binding.searchViewHome.setupWithSearchBar(binding.searchBarHome)
            searchViewHome
                .editText
                .setOnEditorActionListener { textView, i, keyEvent -> textView
                    Toast.makeText(requireContext(),searchViewHome.text,Toast.LENGTH_SHORT).show()
                    true
                }
        }

        super.onViewCreated(view, savedInstanceState)
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}