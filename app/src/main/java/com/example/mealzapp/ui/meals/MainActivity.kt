package com.example.mealzapp.ui.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mealzapp.ui.theme.MealzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealzAppTheme {
                MealsCategoriesScreen() // bind the composable to the activity
            }
        }
    }
}

@Composable // the view in MVVM
fun MealsCategoriesScreen() {
//    val viewModel: MealsCategoriesViewModel = MealsCategoriesViewModel() // reference to the view model
     val viewModel: MealsCategoriesViewModel = viewModel()

    Text(
        text = "Hello Compose!"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MealzAppTheme {
        MealsCategoriesScreen()
    }
}