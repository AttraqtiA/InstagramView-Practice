package com.example.week4lab_0706012210011.ui.theme.view

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week4lab_0706012210011.R
import com.example.week4lab_0706012210011.data.DataSource
import com.example.week4lab_0706012210011.model.Feed
import com.example.week4lab_0706012210011.model.Story
import com.example.week4lab_0706012210011.model.Suggestion
import java.text.DecimalFormat

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramView(StoryList: List<Story>, FeedList: List<Feed>, SuggestionList: List<Suggestion>) {
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
        LazyColumn() {
            item(content = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(start = 16.dp, end = 12.dp, top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.logo_dark),
                            contentDescription = "Instagram Logo",
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = {
                            Toast.makeText(
                                context,
                                "Entering Like & Follow Notification Page",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Image(
                                painter = painterResource(id = R.drawable.like),
                                contentDescription = "Like & Follow Notification Page",
                                contentScale = ContentScale.Crop,
                                colorFilter = ColorFilter.tint(Color.White)
                            )
                        }
                        IconButton(onClick = {
                            Toast.makeText(
                                context, "Entering Direct Message Page", Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Image(
                                painter = painterResource(id = R.drawable.dm),
                                contentDescription = "Direct Message",
                                contentScale = ContentScale.Crop,
                                colorFilter = ColorFilter.tint(Color.White)
                            )
                        }
                    }
                }
            })

            item(content = {
                LazyRow(
                    modifier = Modifier
                        .background(Color.Black)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    item(content = {
                        OneStory(true, StoryList.get(11), context)
                    })
                    items(StoryList) {
                        OneStory(false, it, context)
                    }
                }
            })

            items(FeedList.size) { index ->
                OneFeed(FeedList[index], context)

                if ((index + 1) % 4 == 0) {
                    LazyRow(
                        modifier = Modifier
                            .background(Color.Black)
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        items(SuggestionList) {
                            OneSuggestion(it, context)
                        }
                    }
                }
            }

        }
    })
}

@Composable
fun OneStory(me_or_not: Boolean, story: Story, context: Context) {
    Card(
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier
            .width(80.dp)
            .clickable(onClick = {
                if (me_or_not) {
                    Toast
                        .makeText(
                            context, "Checking Your Story", Toast.LENGTH_SHORT
                        )
                        .show()
                } else {
                    Toast
                        .makeText(
                            context, "${story.name}'s story", Toast.LENGTH_SHORT
                        )
                        .show()
                }
            }),
    ) {
        Box(
            contentAlignment = Alignment.BottomEnd
        ) {
            Image(
                painter = painterResource(id = R.drawable.story),
                contentDescription = "Story Border",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center)
            )
            Image(
                painter = painterResource(id = story.ConvertProfile(context)),
                contentDescription = "Story Profile Picture",
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center),
                contentScale = ContentScale.Crop
            )
            if (me_or_not) {
                FloatingActionButton(
                    onClick = {
                        Toast
                            .makeText(
                                context, "Uploading Your Story", Toast.LENGTH_SHORT
                            )
                            .show()
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .padding(end = 8.dp, bottom = 8.dp)
                        .size(20.dp),
                    containerColor = Color(0xFF409CEC),
                    contentColor = Color.White
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Add",
                        modifier = Modifier.padding(2.dp)
                    )
                }
            }
        }
        Text(
            text = if (me_or_not) {
                "Your Story"
            } else {
                story.name
            },
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun OneFeed(feed: Feed, context: Context) {
    var likedtoggle by remember { mutableStateOf(feed.liked) }
    var savedtoggle by remember { mutableStateOf(feed.saved) }
    var captiontoggle by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.background(Color.Black)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = feed.ConvertProfile(context)),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = feed.name,
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "More Button",
                    tint = Color.White
                )
            }

        }

        Image(
            painter = painterResource(id = feed.ConvertContent(context)),
            contentDescription = "Feed Image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {
                    likedtoggle = !likedtoggle
                    if (likedtoggle) {
                        Toast.makeText(
                            context, "You Liked it", Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            context, "You Unliked it", Toast.LENGTH_SHORT
                        ).show()
                    }
                }) {
                    Image(
                        painter = if (likedtoggle) {
                            painterResource(id = R.drawable.liked)
                        } else {
                            painterResource(id = R.drawable.like)
                        },
                        contentDescription = "Liked",
                        contentScale = ContentScale.Crop,
                        colorFilter = if (!likedtoggle) {
                            ColorFilter.tint(Color.White)
                        } else {
                            ColorFilter.tint(Color(0xFFFF3C5C))
                        }
                    )
                }
                IconButton(onClick = {
                    Toast.makeText(
                        context, "Comment Feature is On Progress", Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Image(
                        painter = painterResource(id = R.drawable.comment),
                        contentDescription = "Comment",
                        contentScale = ContentScale.Crop,
                    )
                }
                IconButton(onClick = {
                    Toast.makeText(
                        context, "Sharing It to Your Mutuals", Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Image(
                        painter = painterResource(id = R.drawable.messanger),
                        contentDescription = "Share",
                        contentScale = ContentScale.Crop,
                    )
                }

            }
            Row() {
                IconButton(onClick = {
                    savedtoggle = !savedtoggle
                    if (savedtoggle) {
                        Toast.makeText(
                            context, "You Saved it", Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            context, "You Unsaved it", Toast.LENGTH_SHORT
                        ).show()
                    }
                }) {
                    Image(
                        painter = if (savedtoggle) {
                            painterResource(id = R.drawable.saved_light)
                        } else {
                            painterResource(id = R.drawable.save)
                        },
                        contentDescription = "Saved",
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 16.dp)
        ) {
            Text(
                text = if (feed.amount_like == 1) {
                    "${feed.amount_like} like"
                } else if (feed.amount_like > 999) {
                    val ribuan = DecimalFormat("#,###").format(feed.amount_like)
                    "${ribuan} likes"
                } else {
                    "${feed.amount_like} likes"
                }, color = Color.White, fontSize = 14.sp, modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(feed.name)
                    }
                    append(" ${feed.caption}")
                },
                fontSize = 14.sp,
                color = Color.White,
                maxLines = if (captiontoggle) 2 else Int.MAX_VALUE, //null gabisa
                overflow = if (captiontoggle) TextOverflow.Ellipsis else TextOverflow.Visible,
                modifier = Modifier.clickable(onClick = { captiontoggle = !captiontoggle })
            )

            Text(
                text = feed.formatDate(),
                fontSize = 10.sp,
                fontWeight = FontWeight.ExtraLight,
                color = Color.White,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Composable
fun OneSuggestion(suggestion: Suggestion, context: Context) {
    Card(
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier
            .width(150.dp)
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(12.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                Image(
                    painter = painterResource(id = suggestion.ConvertProfile(context)),
                    contentDescription = "Story Profile Picture",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "X",
                    tint = Color.White
                )
            }

            Text(
                text = suggestion.name,
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Button(
                onClick = {
                    Toast.makeText(
                        context, "Followed", Toast.LENGTH_SHORT
                    ).show()
                },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF409CEC))
            ) {
                Text(
                    text = "Follow",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InstagramPreview() {
    InstagramView(DataSource().loadStory(), DataSource().loadFeed(), DataSource().loadSuggestion())
}