package com.example.studentcrime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {
    private lateinit var adapter : ListClamp
    private lateinit var recyclerView: RecyclerView
    private lateinit var crimeArrayList: ArrayList<Crime>

    lateinit var crimeTitle: Array<String>
    lateinit var crimeDescription: Array<String>
    lateinit var indexNumber: Array<Int>
    lateinit var isSolved: Array<Boolean>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = ListClamp(crimeArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize(){
        crimeArrayList = arrayListOf<Crime>()
        crimeTitle = arrayOf(
            "Crime #1",
            "Crime #2",
            "Crime #3",
            "Crime #4",
            "Crime #5",
            "Crime #6",
            "Crime #7",
            "Crime #8",
            "Crime #9",
            "Crime #10",
            "Crime #11",
            "Crime #12",
            "Crime #13",
            "Crime #14",
            "Crime #15",
            "Crime #16",
            "Crime #17",
            "Crime #18",
            "Crime #19",
            "Crime #20",
        )
        indexNumber = arrayOf(
            3001,
            3002,
            3003,
            3004,
            3005,
            3006,
            3007,
            3008,
            3009,
            3010,
            3011,
            3012,
            3013,
            3014,
            3015,
            3016,
            3017,
            3018,
            3019,
            3020,
        )
        crimeDescription = arrayOf(
            "Stealing jelly from cafeteria",
            "Setting a monitor on fire",
            "Smoking in the toilet",
            "Setting a toilet on fire",
            "Stealing disinfection liquid",
            "Drinking disinfection liquid",
            "Coming in to the deans office on Wednesday",
            "Bringing a live alligator to the lecture",
            "Eating other students homework",
            "Evading obligatory consultations",
            "Breaking a glass in vending machines",
            "Stealing a vending machine",
            "Riding a bike in the corridor",
            "Calling the police and telling them there's a bomb in the building",
            "Starting a campfire in the Universities backyard",
            "Not calling a doctor a doctor",
            "Being 1 hour late and still checking themselves on the attendance list ",
            "Skipping exam",
            "Breaking a window and jumping from the second floor",
            "Not bringing back the locker room badge",
        )
        isSolved = arrayOf(
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
        )

        for (i in crimeTitle.indices){
            val crime = Crime(i ,crimeTitle[i], crimeDescription[i], indexNumber[i], isSolved[i])
            crimeArrayList.add(crime)
        }
    }
}