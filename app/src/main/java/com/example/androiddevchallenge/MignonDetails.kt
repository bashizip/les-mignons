package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.domain.Mignon
import com.example.androiddevchallenge.repository.MignonRepo
import com.example.androiddevchallenge.ui.theme.MyTheme

class MignonDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val mignonId: Int = intent.getIntExtra(EXTRA_MIGON,0)
                val mignon = MignonRepo(this).mignonsList[mignonId+1]
                DetailView(mignon)
            }
        }
    }


    @Composable
    fun DetailView(mignon: Mignon) {
        Surface(color = MaterialTheme.colors.background) {
            MignonDetails(mignon)
        }
    }

    @Composable
    fun MignonDetails(mignon: Mignon) {

    }


    @Preview(showBackground = true)
    @Composable
    fun DetailViewPreview() {
        DetailView(
            Mignon(
                id = 17,
                name = "Dallas",
                "Dog",
                age = 4,
                photo = R.drawable.mignon17,
                adress = "Kinshasa"
            )
        )
    }
    companion object {
        const val EXTRA_MIGON: String = "mignon_extra"
    }
}