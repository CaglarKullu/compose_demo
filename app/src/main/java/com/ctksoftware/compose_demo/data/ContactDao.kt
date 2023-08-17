package com.ctksoftware.compose_demo.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    fun upsertContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getContactsByFirstName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getContactsByLastName(): Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    fun getContactsByPhoneNumber(): Flow<List<Contact>>
}