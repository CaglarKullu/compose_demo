package com.ctksoftware.compose_demo

import com.ctksoftware.compose_demo.data.Contact

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String ="",
    val lastName: String="",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME,
)
