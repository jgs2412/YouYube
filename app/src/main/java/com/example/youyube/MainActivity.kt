package com.example.youyube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.youyube.ui.theme.YouYubeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {

                    Header()
                    AppNavigation()
                    Footer()
                }

            }
        }
    }
}



@Composable
fun Header(modifier: Modifier = Modifier) {
    val leftIconRes = R.drawable.yti
    val rightIconResList = listOf(
        R.drawable.ttv,
        R.drawable.ci,
        R.drawable.lp
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 10.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = leftIconRes),
            contentDescription = "Left Icon",
            modifier = Modifier.size(24.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            rightIconResList.forEach { iconRes ->
                Image(
                    painter = painterResource(id = iconRes),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}


@Composable
fun Feed(navController: NavController, modifier: Modifier = Modifier) {

    Column {

    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "Header Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable {
                    navController.navigate("videocomentarios")
                }
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.tr),
                contentDescription = "Left Icon",
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 16.dp)
            )


            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(text = "CREAR MINIATURAS WAPARDAS", style = MaterialTheme.typography.bodyLarge)
                Text(text = "La roca", style = MaterialTheme.typography.bodySmall)
            }
        }
    }

    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.nft),
            contentDescription = "Header Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.jl),
                contentDescription = "Left Icon",
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 16.dp)
            )


            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(text = "Nosferatu Review", style = MaterialTheme.typography.bodyLarge)
                Text(text = "Luis", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
    }
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    val icons = listOf(
        R.drawable.ca,
        R.drawable.sh,
        R.drawable.ana,
        R.drawable.sb,
        R.drawable.tr
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        icons.forEach { iconRes ->
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}




