package com.alexlyxy.alexrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexlyxy.alexrecyclerview.databinding.PlantItemBinding

    class PlantAdapter : RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
        private val plantList = ArrayList<Plant>()

        class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {
            private val binding = PlantItemBinding.bind(item)
            fun bind(plant: Plant) = with(binding) {
                //ivBoy.setImageResource(plant.imageId)
                ivBoy.setImageResource(plant.boy)
                ivAbstPicture.setImageResource(plant.abstPicture)
                ivCandle.setImageResource(plant.candle)
                ivElephant.setImageResource(plant.elephant)
                ivIsland.setImageResource(plant.island)
                ivRobot.setImageResource(plant.robot)
                ivSalvador.setImageResource(plant.salvador)

                /*tvBo.text = plant.tvBo
                tvAbst.text = plant.tvAbst
                tvCandle.text = plant.tvCandle
                tvGre.text = plant.tvGre
                tvIsla.text = plant.tvIsla
                tvRobo.text = plant.tvRobo
                tvSal.text = plant.tvSal */

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)
            return PlantHolder(view)
        }

        override fun onBindViewHolder(holder: PlantHolder, position: Int) {
            holder.bind(plantList[position])
        }

        override fun getItemCount(): Int {
            return plantList.size
        }

        fun addPlant(plant: Plant) {
            plantList.add(plant)
            notifyDataSetChanged()
        }
}