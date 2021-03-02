/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.domain.Mignon
import com.example.androiddevchallenge.repository.MignonRepo
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }


    // Start building your app here!
    @Composable
    fun MyApp() {
        Surface(color = MaterialTheme.colors.background) {
            MainLayout()
        }
    }

    @Composable
    fun MainLayout() {
        Column() {
            MyToolbar()
            Column(
                Modifier
                    .clip(shape = RoundedCornerShape(32.dp))
                    .background(colorResource(id = R.color.gray_light))
            ) {
                SearchBox()
                MignonList(MignonRepo(LocalContext.current).mignonsList)
            }
        }
    }

    @Composable
    fun SearchBox() {
            TextField(
                value = "",
                onValueChange = { Log.d("MainActivity", it) },
                label = { Text(text = "Search here") },
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_baseline_search_24),
                        contentDescription = "search Icon"
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    backgroundColor = colorResource(id = R.color.white),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp)
            )
        }



    @Composable
    fun MyToolbar() {
        TopAppBar(
            backgroundColor = Color.White,
            elevation = 0.dp
        ) {
            Box(
                modifier = Modifier, contentAlignment = Alignment.CenterStart
            ) {
                IconButton(
                    onClick = { /*TODO*/ },
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_baseline_menu_24),
                        contentDescription = ""
                    )
                }
            }

            Box(
                modifier = Modifier, contentAlignment = Alignment.BottomCenter
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "Location",
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.gray_dark),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Text(
                        text = "Kinshasa, DRC",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.jacksons_purple_500),
                        textAlign = TextAlign.Center
                    )
                }
            }
            Box(
                modifier = Modifier, contentAlignment = Alignment.CenterEnd
            ) {

                IconButton(
                    onClick = { /*TODO*/ },
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.bash),
                        contentDescription = "",
                        Modifier
                            .padding(8.dp)
                            .clip(shape = CircleShape)
                    )
                }

            }
        }
    }


    @Composable
    fun MignonList(mignons: List<Mignon>) {
        LazyColumn(
        ) {
            items(mignons) { m ->
                MignoRow(mignon = m)
            }
        }
    }

    @Composable
    fun MignoRow(mignon: Mignon) {
        Row(
            Modifier
                .clickable { showMigon(mignon) }
                .padding(start = 32.dp, top = 32.dp, end = 32.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

            ) {

            Image(
                painter = painterResource(id = mignon.photo),
                contentDescription = "${mignon.name} photo",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .height(180.dp)
                    .width(100.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )


            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .background(colorResource(id = R.color.white))
                    .weight(1f)
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 8.dp)

            ) {
                Text(

                    text = mignon.name,
                    color = colorResource(id = R.color.jacksons_purple_500),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 4.dp)

                )
                Text(
                    text = mignon.type,
                    style = typography.body1,
                    color = colorResource(id = R.color.gray_dark),
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = "${mignon.age} years old",
                    style = typography.body1,
                    color = colorResource(id = R.color.gray_dark),
                    modifier = Modifier.padding(top = 4.dp)
                )
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
                        contentDescription = "",
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Text(
                        text = mignon.adress,
                        style = typography.body1,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        color = colorResource(id = R.color.gray_dark),
                        modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
                    )
                }
            }
        }
    }


    fun showMigon(mignon: Mignon) {
        val intent = Intent(this, MignonDetails::class.java).apply {
            putExtra(MignonDetails.EXTRA_MIGON, mignon.id)
        }
        startActivity(intent)
    }


    // Previews

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun LightPreview() {
        MyTheme {
            MyApp()
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun DarkPreview() {
        MyTheme(darkTheme = true) {
            MyApp()
        }
    }

}
