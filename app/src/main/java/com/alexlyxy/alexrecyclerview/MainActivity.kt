package com.alexlyxy.alexrecyclerview

/*import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}*/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.alexlyxy.alexrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    private  val  adapter = PlantAdapter()
    private  val  imageIdList =  listOf(
        R.drawable.boy,
        R.drawable.abstpicture,
        R.drawable.candle,
        R.drawable.elephant,
        R.drawable.island,
        R.drawable.robot,
        R.drawable.salvador
    )
    private  var index  = 0

    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private  fun  init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 1)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                /*val  plant =Plant(imageIdList[index], "Plant $index")
                for (i in index  until  imageIdList.size)
                    index++
                    adapter.addPlant(plant)*/

                if(index > 6) index = 0
                val  plant = Plant(
                    //imageIdList[index], "$it"
                    R.drawable.boy, "$it",
                    R.drawable.abstpicture,"$it",
                    R.drawable.candle, "$it",
                    R.drawable.elephant,"$it",
                    R.drawable.island,"$it",
                    R.drawable.robot,"$it",
                    R.drawable.salvador,"$it"
                )
                adapter.addPlant(plant)
                index++

            }
        }
    }
}