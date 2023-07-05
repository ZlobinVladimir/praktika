package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dota_App()
        }
    }
}

@Preview
@Composable
fun Dota_App() {
    LazyColumn(content = {
        item {
            Box {
                Main_Image()
                Rating()
                Genre()
                Description()
            }
        }
        item{Spacer(modifier = Modifier.height(21.dp))}
        item{Preview_Dota()}
        item{Spacer(modifier = Modifier.height(21.dp))}
        item{Review_Subtitle()}
        item{Spacer(modifier = Modifier.height(12.dp))}
        item{Review_Ratings()}
        item{Spacer(modifier = Modifier.height(21.dp))}
        item{Reviews()}
        item{Spacer(modifier = Modifier.height(30.dp))}
        item{Install_Button()}
    }, modifier = Modifier
        .width(width = 375.dp)
        .height(height = 930.dp)
        .background(color = Color(0xff050b18)))
}
@Composable
fun Main_Image() {
    Image(
        painter = painterResource(id = R.drawable.image16),
        contentDescription = "image 16",
        modifier = Modifier
            .width(width = 628.dp)
            .height(height = 354.dp))
}

@Composable
fun Rating() {
    Row(
        modifier = Modifier
            .height(height = 439.dp)
            .padding(start = 24.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(bottom = 17.dp)
            .border(2.dp, color = Color(0xff1f2430), shape = RoundedCornerShape(15.dp))
            .width(width = 88.dp)
            .height(height = 95.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color = Color.Black),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.image17),
                contentDescription = "logo",
                modifier = Modifier
                    .size(54.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 40.dp, start = 12.dp)
        ) {
            Text(
                text = "DoTA 2",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group84),
                    contentDescription = "stars",
                    modifier = Modifier
                        .width(width = 76.dp)
                        .height(height = 12.dp)
                )
                Text("70M", fontSize = 10.sp, modifier = Modifier.padding(start = 10.dp),
                    color = Color(0xFF45454D))
            }
        }
    }
}
@Composable
fun Genre() {
    Row (
        modifier = Modifier
            .height(height = 471.dp)
            .padding(start = 24.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ){
        Box (
            modifier = Modifier
                .width(width = 53.dp)
                .height(height = 22.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff44a9f4).copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
                )
        {
            Text(
                text = "MOBA",
                color = Color(0xff44a9f4),
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
            )
        }
        Box (
            modifier = Modifier
                .padding(start = 10.dp)
                .width(width = 93.dp)
                .height(height = 22.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff44a9f4).copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "MULTIPLAYER",
                color = Color(0xff44a9f4),
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
            )
        }
        Box (
            modifier = Modifier
                .padding(start = 10.dp)
                .width(width = 73.dp)
                .height(height = 22.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff44a9f4).copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "STRATEGY",
                color = Color(0xff44a9f4),
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}
@Composable
fun Description() {
    Row(
        modifier = Modifier
            .height(height = 571.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    )
    {
        Box(
            modifier = Modifier
                .height(height = 76.dp)
                .padding(start = 24.dp, end = 24.dp)
        )
        {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                color = Color(0xffeef2fb).copy(alpha = 0.7f),
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
fun Preview_Dota() {
    LazyRow(
        modifier = Modifier
            .padding(start=24.dp),
        content = {
            item{
                Box(
                    modifier = Modifier
                        .height(height = 135.dp)
                        .width(width = 270.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.image18),
                        contentDescription = "video1",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(14.dp))
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {
                        IconButton(
                            onClick = { },
                            modifier = Modifier
                                .size(size = 48.dp),
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(size = 48.dp)
                                    .clip(shape = CircleShape)
                                    .background(color = Color.White.copy(alpha = 0.24f)))
                            Icon(
                                painter = painterResource(id = R.drawable.playbutton),
                                contentDescription = "playbutton",
                                tint = Color.White,
                                modifier = Modifier.size(24.dp))
                        }
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .padding(start = 15.dp, end = 24.dp)
                        .height(height = 138.dp)
                        .width(width = 242.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.image19),
                        contentDescription = "video2",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(14.dp))
                    )
                }
            }
        })
}

@Composable
fun Review_Subtitle()
{
    Box(
        modifier = Modifier
            .padding(start = 24.dp)
    )
    {
        Text(
            text = "Review & Ratings",
            color = Color(0xffeef2fb),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Review_Ratings()
{
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    )
    {
        Text(
            text = "4.9",
            color = Color.White,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 17.dp)
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group98),
                    contentDescription = "stars",
                    modifier = Modifier
                        .width(width = 76.dp)
                        .height(height = 12.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            {
                Text(
                    text = "70M Reviews",
                    color = Color(0xffa8adb7),
                    fontSize = 13.sp,
                )
            }
        }
    }
}

@Composable
fun Reviews()
{
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.face1),
            contentDescription = "man1",
            modifier = Modifier
                .size(size = 36.dp)
                .clip(shape = CircleShape)
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp, bottom = 2.dp)
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Auguste Conte",
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "February 14, 2019",
                    color = Color.White.copy(alpha = 0.4f),
                    fontSize = 12.sp,
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
    Box(
        modifier = Modifier
            .height(height = 60.dp)
            .padding(start = 24.dp, end = 24.dp)
    )
    {
        Text(
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xffa8adb7),
            fontSize = 12.sp,
            letterSpacing = 0.5.sp
        )
    }
    Spacer(modifier = Modifier.height(7.dp))
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(2.dp)
        .padding(start = 35.dp, end = 35.dp)
        .background(color = Color(0xFF1A1F29))
    )
    Spacer(modifier = Modifier.height(14.dp))
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.face2),
            contentDescription = "man1",
            modifier = Modifier
                .size(size = 36.dp)
                .clip(shape = CircleShape)
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp, bottom = 2.dp)
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Jang Marcelino",
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "February 14, 2019",
                    color = Color.White.copy(alpha = 0.4f),
                    fontSize = 12.sp,
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
    Box(
        modifier = Modifier
            .height(height = 60.dp)
            .padding(start = 24.dp, end = 24.dp)
    )
    {
        Text(
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xffa8adb7),
            fontSize = 12.sp,
            letterSpacing = 0.5.sp
        )
    }
}

@Composable
fun Install_Button()
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        IconButton(
            onClick = { },
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .width(width = 327.dp)
                .height(height = 64.dp)
                .background(color = Color(0xfff4d144))
        ) {
            Text(
                text = "Install",
                color = Color(0xff050b18),
                fontSize = 20.sp
            )
        }
    }
}