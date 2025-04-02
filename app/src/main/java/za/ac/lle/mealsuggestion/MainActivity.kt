package za.ac.lle.mealsuggestion

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import za.ac.lle.mealsuggestion.ui.theme.MealSuggestionTheme

class MainActivity<Button : View?> : ComponentActivity() {
    override fun
            onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Linking UI components from XML to Kotlin code
        val inputTime = findViewById<EditText>(R.id.inputTime)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val tvMealSuggestion = findViewById<TextView>(R.id.tvMealSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Button click event to get meal suggestion
        if (btnSuggest != null) {
            btnSuggest.setOnClickListener {
                val timeOfDay =
                    inputTime.text.toString().trin().lowercase() // Convert input to lowercase

                var mealSuggestion = "Invalid input! Please enter a valid time of day"

                // Meal suggestions based on user input
                if (timeOfDay.equals("morning")) {
                    mealSuggestion = "Breakfast: Cereal"
                } else if (timeOfDay.equals("mid-morning")) {
                    mealSuggestion = "Light Snack: Sandwich"
                } else if (timeOfDay.equals("afternoon")) {
                    mealSuggestion = "Lunch: Burger"
                } else if (timeOfDay.equals("mid-afternoon")) {
                    mealSuggestion = "Quick Bite: Fruit Smoothie"
                } else if (timeOfDay.equals("dinner")) {
                    mealSuggestion = "Main Course: Chicken"
                } else if (timeOfDay.equals("after dinner")) {
                    mealSuggestion = "Dessert: Cake"
                }

                // Display the meal suggestion in the TextView
                tvMealSuggestion.text = mealSuggestion
            }
        }

        // Button click event to reset input and suggestion
        if (btnReset != null) {
            btnReset.setOnClickListener {
                inputTime.text.clear() // Clear the input field
                tvMealSuggestion.text = "Meal suggestion wil appear here" // Reset suggestion text
            }
        }
    }
}

private fun Any.lowercase() {

}

private fun String.trin() {

}
