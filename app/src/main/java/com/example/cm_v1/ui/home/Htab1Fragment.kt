package com.example.cm_v1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cm_v1.R
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Htab1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Htab1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // フラグメントのレイアウトをインフレートする
        return inflater.inflate(R.layout.fragment_htab1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // データを用意
        val number = arrayOf(
            "個体番号1", "個体番号2", "個体番号3", "個体番号4", "個体番号5", "個体番号6",
            "個体番号7", "個体番号8", "個体番号9", "個体番号10", "個体番号11", "個体番号12",
            "個体番号13", "個体番号14", "個体番号15", "個体番号16", "個体番号17", "個体番号18",
        )
        val details = arrayOf(
            "ステータス1","ステータス2","ステータス3",
            "ステータス4","ステータス5","ステータス6",
            "ステータス7","ステータス8","ステータス9",
            "ステータス10","ステータス11","ステータス12",
            "ステータス13","ステータス14","ステータス15",
            "ステータス16","ステータス17","ステータス18",
        )
        val images = intArrayOf(
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16,
            R.drawable.img17, R.drawable.img18,
        )

        val listData = ArrayList<Map<String, Any>>()
        for (i in number.indices) {
            val item = HashMap<String, Any>()
            item["number"] = number[i]
            item["detail"] = details[i]
            item["image"] = images[i]
            listData.add(item)
        }

        // ListViewにデータをセットする
        val list: ListView = view.findViewById(R.id.cowHouse_list)
        list.adapter = SimpleAdapter(
            context,
            listData,
            R.layout.list_item1,
            arrayOf("number", "detail", "image"),
            intArrayOf(R.id.number, R.id.detail, R.id.image)
        )
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HtabFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Htab1Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}