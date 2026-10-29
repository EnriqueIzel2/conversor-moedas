package com.izel.conversordemoedas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.izel.conversordemoedas.R
import com.izel.conversordemoedas.databinding.ItemCurrencyTypeBinding
import com.izel.conversordemoedas.network.model.CurrencyType

class CurrencyTypesAdapter(
    private val currencyTypes: List<CurrencyType>
) : BaseAdapter() {
    override fun getCount(): Int {
        return currencyTypes.size
    }

    override fun getItem(position: Int): Any? {
        return currencyTypes[position]
    }

    override fun getItemId(position: Int): Long {
        return currencyTypes[position].hashCode().toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?
    ): View? {
        return convertView ?: run {
            val item = currencyTypes[position]
            val binding = ItemCurrencyTypeBinding.inflate(LayoutInflater.from(parent?.context))
            with(binding) {
                currencyAcronym.text = item.acronym
                currencyFlag.setImageResource(R.drawable.img_logo)
            }

            binding.root
        }
    }
}