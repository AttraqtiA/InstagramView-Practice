package com.example.week4lab_0706012210011.ui.theme.view

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week4lab_0706012210011.R
import com.example.week4lab_0706012210011.data.DataSource
import com.example.week4lab_0706012210011.model.Explore

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView(ExploreList: List<Explore>) {
    var search by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current

    Scaffold(bottomBar = {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "Home",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(
                        context, "Home, you're here!", Toast.LENGTH_SHORT
                    ).show()
                })
            )
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(
                        context, "Search? Redirect to Search View!", Toast.LENGTH_SHORT
                    ).show()
                })
            )
            Image(
                painter = painterResource(id = R.drawable.post),
                contentDescription = "Post",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(
                        context, "Uploading/Posting Something", Toast.LENGTH_SHORT
                    ).show()
                })
            )
            Image(
                painter = painterResource(id = R.drawable.reels),
                contentDescription = "Reels",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(
                        context, "Reels, TikTok clone", Toast.LENGTH_SHORT
                    ).show()
                })
            )
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Account",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(
                        context, "Account Settings", Toast.LENGTH_SHORT
                    ).show()
                })
            )
        }
    }, content = {
        LazyVerticalGrid(
            columns = GridCells.Fixed(3), modifier = Modifier.padding(bottom = 56.dp)
        ) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(8.dp),
                ) {
                    OutlinedTextField(
                        value = search,
                        onValueChange = { search = it },
                        placeholder = { Text(text = "Search...", color = Color.Gray) },
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Password, imeAction = ImeAction.Done
                        ),
                        shape = RoundedCornerShape(30.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Search,
                                contentDescription = "Icon lah sekali-kali",
                                tint = Color.White
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }

            items(ExploreList) {
                OneExplore(explore = it, context = context)
            }
        }
    })
}

@Composable
fun OneExplore(explore: Explore, context: Context) {
    Image(
        painter = painterResource(id = explore.ConvertDrawable(context)),
        contentDescription = "Explore Image",
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {
                Toast.makeText(
                    context, "You clicked ${explore.content}", Toast.LENGTH_SHORT
                ).show()
            })
            .aspectRatio(1f), //buat kotak (1 : 1)
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchPreview() {
    SearchView(DataSource().loadExplore())
}