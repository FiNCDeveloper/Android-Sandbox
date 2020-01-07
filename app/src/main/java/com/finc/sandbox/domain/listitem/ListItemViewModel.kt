package com.finc.sandbox.domain.listitem

import androidx.lifecycle.ViewModel

class ListItemViewModel(
    private val repository: ListItemRepository
): ViewModel() {

    val listItem = repository.fetch()
}