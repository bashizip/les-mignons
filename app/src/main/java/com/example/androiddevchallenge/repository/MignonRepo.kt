package com.example.androiddevchallenge.repository

import android.content.Context
import android.content.ContextWrapper
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.domain.Mignon

class MignonRepo(base: Context?) : ContextWrapper(base) {

    val mignonsList = listOf(
        Mignon(
            id = 1,
            name = "Clyde",
            "Chat",
            age = 2,
            photo = R.drawable.mignon1,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 2,
            name = "Argos",
            "Chat",
            age = 6,
            photo = R.drawable.mignon2,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 3,
            name = "Alfred",
            "Chat",
            age = 3,
            photo = R.drawable.mignon3,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 4,
            name = "Barkley",
            "Chat",
            age = 2,
            photo = R.drawable.mignon4,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 5,
            name = "Clyde",
            "Chat",
            age = 3,
            photo = R.drawable.mignon5,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 6,
            name = "Alfred",
            "Chat",
            age = 1,
            photo = R.drawable.mignon6,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 7,
            name = "Jesse",
            "Chat",
            age = 4,
            photo = R.drawable.mignon7,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 8,
            name = "Jesse",
            "Chat",
            age = 1,
            photo = R.drawable.mignon8,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 9,
            name = "Coby",
            "Chat",
            age = 2,
            photo = R.drawable.mignon9,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 10,
            name = "Maple",
            "Chat",
            age = 1,
            photo = R.drawable.mignon10,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 11,
            name = "Gandalf",
            "Chat",
            age = 1,
            photo = R.drawable.mignon11,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 12,
            name = " Adonis",
            "Chat",
            age = 2,
            photo = R.drawable.mignon12,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 13,
            name = " Adonis",
            "Chat",
            age = 1,
            photo = R.drawable.mignon13,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 14,
            name = " Groot",
            "Chat",
            age = 3,
            photo = R.drawable.mignon14,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 15,
            name = " Anubis",
            "Chat",
            age = 1,
            photo = R.drawable.mignon15,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 16,
            name = "Griffin",
            "Chat",
            age = 1,
            photo = R.drawable.mignon16,
            adress = "Kinshasa"
        ),
        Mignon(
            id = 17,
            name = "Dallas",
            "Chat",
            age = 4,
            photo = R.drawable.mignon17,
            adress = "Kinshasa"
        )

    )
}



