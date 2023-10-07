package com.example.week4lab_0706012210011.ui.theme.view

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4lab_0706012210011.R
import com.example.week4lab_0706012210011.data.dummy_data
import com.example.week4lab_0706012210011.model.line_chat

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageView(MessageList: List<line_chat>) { // memang topbarnya putih kalau di preview, mohon cek di emulator/HP
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Chats",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                },
                actions = {
                    IconButton(
                        onClick = { /* TODO */ }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = "More Button",
                            tint = Color.White
                        )
                    }
                },
                modifier = Modifier.background(Color.Black),
            )
        },
        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Black)
                    .padding(start = 16.dp, end = 16.dp, top = 80.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                items(MessageList) {
                    OneLineChat(
                        it
                    )
                }
            }
        },
        containerColor = Color.Black,
        contentColor = Color.White
    )
}


@Composable
fun OneLineChat(Line_Chat: line_chat) {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {Toast.makeText(
                context,
                "${Line_Chat.name} Clicked!",
                Toast.LENGTH_SHORT
            ).show()}
            ),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.empty_profile),
            contentDescription = "Empty Profile",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
            ,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            Text(
                text = Line_Chat.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            )
            Text(
                text = Line_Chat.recent_message,
                fontSize = 16.sp,
                color = Color.White,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Column(
        ) {
            Text(
                text = Line_Chat.date,
                fontSize = 12.sp,
                color = Color.White,
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MessagePreview() {
    MessageView(dummy_data().get_data_line())
}