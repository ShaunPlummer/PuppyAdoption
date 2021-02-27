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

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

private const val TAG = "puppy_list"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    PuppyList(puppyList = PetData.dogList)
                }
            }
        }
    }
}

@Preview("Puppy List")
@Composable
fun PuppyListPreview() {
    MyTheme {
        PuppyList(
            puppyList = listOf(

            )
        )
    }
}

@Composable
fun PuppyList(puppyList: List<Dog>) {
    LazyColumn {
        items(items = puppyList) { puppy ->
            MaterialListItem(text = puppy.name)
        }
    }
}

@Composable
fun MaterialListItem(text: String) = Text(
    text = text,
    modifier = Modifier
        .padding(start = 16.dp, top = 12.dp, bottom = 12.dp, end = 16.dp)
        .clickable {
            Log.d(TAG, "clicked: $text")
        }
)