package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@ExperimentalComposeUiApi
@Preview
@Composable
fun PetDetailPreview() {
    MyTheme {
        PetDetail(PetData.dogList.first())
    }
}

@ExperimentalComposeUiApi
@Composable
fun PetDetail(dog: Dog) {
    Surface {
        Column {
            Image(
                painter = painterResource(dog.image),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Spacer(Modifier.height(8.dp))
            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    PetStat(
                        label = R.string.label_weight,
                        value = dog.weight.toString(),
                    )
                    Spacer(Modifier.width(50.dp))
                    PetStat(
                        label = R.string.label_gender,
                        value = dog.gender,
                    )
                    Spacer(Modifier.width(50.dp))
                    PetStat(
                        label = R.string.label_age,
                        value = dog.age.toString(),
                    )
                }
                Spacer(Modifier.width(16.dp))
                Text(text = stringResource(id = R.string.label_bio), fontWeight = FontWeight.Bold)
                Spacer(Modifier.width(4.dp))
                Text(text = stringResource(id = R.string.lorem_ipsum))
            }
        }
    }
}

@Preview
@Composable
fun PetStatPreview() {
    val pet = PetData.dogList.first()
    PetStat(
        label = R.string.label_weight,
        value = pet.weight.toString()
    )
}

@Composable
fun PetStat(
    label: Int,
    value: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = label),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black
        )
        Text(text = value, textAlign = TextAlign.Center)
    }
}