package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme


@Preview("Puppy List")
@Composable
fun PuppyListPreview() {
    MyTheme {
        PuppyList(
            puppyList = PetData.dogList.take(5)
        )
    }
}

@Composable
fun PuppyList(puppyList: List<Dog>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        items(items = puppyList) { puppy ->
            petCard(puppy)
        }
    }
}

@Preview
@Composable
fun petCardPreview() {
    MyTheme {
        petCard(PetData.dogList.first())
    }
}

@Composable
fun petCard(dog: Dog) {
    Surface(
        modifier = Modifier
            .padding(4.dp)
            .clickable {

            },
        color = MaterialTheme.colors.surface,
        elevation = 4.dp,
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(dog.image),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = dog.name,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}