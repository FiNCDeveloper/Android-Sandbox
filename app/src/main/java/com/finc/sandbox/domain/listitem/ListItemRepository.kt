package com.finc.sandbox.domain.listitem

import androidx.lifecycle.LiveData

interface ListItemRepository {
    fun fetch() :LiveData<ListItem>
}
