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
            "Dog",
            age = 2,
            photo = R.drawable.mignon1,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 2,
            name = "Argos",
            "Dog",
            age = 6,
            photo = R.drawable.mignon2,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 3, 
            name = "Amos",
            type="Dog",
            age = 3,
            photo = R.drawable.mignon3,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 4,
            name = "Barkley",
            "Dog",
            age = 2,
            photo = R.drawable.mignon4,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 5,
            name = "Clyde",
            "Dog",
            age = 3,
            photo = R.drawable.mignon5,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 6,
            name = "Alfred",
            "Dog",
            age = 1,
            photo = R.drawable.mignon6,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 7,
            name = "Jesse",
            "Dog",
            age = 4,
            photo = R.drawable.mignon7,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 8,
            name = "Jesse",
            "Dog",
            age = 1,
            photo = R.drawable.mignon8,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 9,
            name = "Coby",
            "Dog",
            age = 2,
            photo = R.drawable.mignon9,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 10,
            name = "Maple",
            "Dog",
            age = 1,
            photo = R.drawable.mignon10,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 11,
            name = "Gandalf",
            "Dog",
            age = 1,
            photo = R.drawable.mignon11,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 12,
            name = " Adonis",
            "Dog",
            age = 2,
            photo = R.drawable.mignon12,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 13,
            name = " Adonis",
            "Dog",
            age = 1,
            photo = R.drawable.mignon13,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 14,
            name = " Groot",
            "Dog",
            age = 3,
            photo = R.drawable.mignon14,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 15,
            name = " Anubis",
            "Dog",
            age = 1,
            photo = R.drawable.mignon15,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 16,
            name = "Griffin",
            "Dog",
            age = 1,
            photo = R.drawable.mignon16,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        ),
        Mignon(
            id = 17,
            name = "Dallas",
            "Dog",
            age = 4,
            photo = R.drawable.mignon17,
            adress = "3 av. Justice, Commune de la Gombe, Kinshasa, DR Congo"
        )

    )
}



