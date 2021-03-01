package com.example.androiddevchallenge

import android.graphics.Color
import android.os.Bundle
import android.view.Window
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.domain.Mignon
import com.example.androiddevchallenge.repository.MignonRepo
import com.example.androiddevchallenge.ui.theme.MyTheme
import android.view.WindowManager
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.Color.Companion.White


class MignonDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {
            MyTheme {
                val mignonId: Int = intent.getIntExtra(EXTRA_MIGON, 0)
                val mignon = MignonRepo(this).mignonsList[mignonId - 1]
                DetailView(mignon)
            }
        }
    }

    @Composable
    fun MigonInfos(mignon: Mignon){
        Box(
            modifier =
            Modifier
                .padding(start = 32.dp, end = 32.dp)
                .height(160.dp)
                .background(colorResource(id = R.color.gray_dark))
        ){

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
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = mignon.photo),
                contentDescription = "",
                Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                contentScale = ContentScale.Crop
            )

            ProprioInfosPane()
        }
    }

    @Composable
    fun ProprioInfosPane() {
        Column(
            modifier = Modifier
                .padding(top = 64.dp, start = 32.dp, bottom = 32.dp, end = 32.dp)
        ) {
            Profile()
            Text(
                text = stringResource(id = R.string.lorem_ipsum),
                maxLines = 5,
                color = colorResource(id = R.color.gray_dark),  modifier = Modifier
                    .padding(top = 32.dp)
            )
            ButtonBar()
        }
    }

    @Composable
    fun Profile() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bash),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .clip(shape = CircleShape)
                    .width(48.dp)
                    .height(48.dp)
            )
            Column(

            ) {
                Text(
                    text = "Patrick Bashizi",
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,

                    )
                Text(
                    text = "Owner",
                    color = colorResource(id = R.color.gray_dark),
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(), contentAlignment = Alignment.TopEnd
            ) {
                Text(
                    text = "March 20, 2021",
                    color = colorResource(id = R.color.gray_dark),
                    modifier = Modifier,
                    fontSize = 12.sp,
                )
            }
        }
    }

    @Composable
    fun ButtonBar() {
        Row(
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },colors = ButtonDefaults.textButtonColors(
                    backgroundColor = colorResource(id = R.color.jacksons_purple_500),
                ),

               modifier = Modifier
                   .clip(shape = RoundedCornerShape(16.dp))
                   .height(60.dp)
                   .width(60.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                    contentDescription = ""
                )
            }
            Button(
                onClick = { /* Do something! */ },
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = colorResource(id = R.color.matrix_200),
                ),
                modifier = Modifier
                    .padding(start = 32.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .width(150.dp)
                    .height(60.dp)
                    .weight(1f)


            ) {
                Text("Adoption",
                    color = colorResource(id = R.color.white),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }


    @Preview(showBackground = true, widthDp = 360, heightDp = 640, name = "Detail view")
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

    @Preview(showBackground = true, widthDp = 360, heightDp = 640, name = "Profile")
    @Composable
    fun ProfilePreview() {
        Profile()
    }

    companion object {
        const val EXTRA_MIGON: String = "mignon_extra"
    }
}