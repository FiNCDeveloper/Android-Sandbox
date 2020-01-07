package com.finc.sandbox.domain.listitem

data class ListItem(
    val items:List<Item>
) {
    data class Item(
        val id:Long,
        val title:String,
        val message:String
    )
}
