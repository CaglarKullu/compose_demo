package com.ctksoftware.compose_demo

import com.ctksoftware.compose_demo.data.Contact

sealed interface ContactEvent{
  data object SaveContact: ContactEvent
    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent
    data object ShowDialog:ContactEvent
    data object HideDialog:ContactEvent
    data class SortContacts(val sortType: SortType):ContactEvent
    data class DeleteContact(val contact:Contact):ContactEvent
}