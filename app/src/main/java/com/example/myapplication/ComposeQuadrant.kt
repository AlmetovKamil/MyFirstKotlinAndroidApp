package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = modifier.weight(weight = 1f)) {
            Quadrant(
                name = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_description),
                color = colorResource(R.color.purple1), modifier = modifier.weight(weight = 1f)
            )
            Quadrant(
                name = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_description),
                color = colorResource(R.color.purple2), modifier = modifier.weight(weight = 1f)
            )
        }
        Row(modifier = modifier.weight(weight = 1f)) {
            Quadrant(
                name = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_description),
                color = colorResource(R.color.purple3), modifier = modifier.weight(weight = 1f)
            )
            Quadrant(
                name = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_description),
                color = colorResource(R.color.purple4), modifier = modifier.weight(weight = 1f)
            )
        }
    }
}

@Composable
fun Quadrant(name: String, description: String, color: Color, modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(color = color)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = description, textAlign = TextAlign.Justify)
    }

}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrant()
}
