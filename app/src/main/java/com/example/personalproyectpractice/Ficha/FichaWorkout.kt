package com.example.personalproyectpractice.Ficha


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.personalproyectpractice.Data.Workout
import com.example.personalproyectpractice.R

val formaficha = RoundedCornerShape(16.dp)

val bordeFicha = Brush.linearGradient(
    colors = listOf(Color(0xFF4285F4), Color(0xFF9B5DE5))
)
@Composable
fun FichaWorkout(workout: Workout, modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(formaficha)
            .border(
                border = BorderStroke(width = 3.dp, brush = bordeFicha),
                shape = formaficha
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.size(120.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(workout.Img),
                    contentDescription = "WorkoutActivities",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = workout.name,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp))
            }
        }

        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Box(
                modifier = Modifier.size(120.dp),
                contentAlignment = Alignment.Center
            ) {
                if(workout.Time.endsWith('m')){
                    Text(text = workout.Time.dropLast(1) + " Minutos",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 8.dp))
                }

                if(workout.Time.endsWith('h')){
                    Text(text = workout.Time.dropLast(1) + " Horas",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 8.dp))

                }

                if(workout.Time.endsWith('s')){
                    Text(text = workout.Time.dropLast(1) + " Segundos",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 8.dp))
                }

                Text(if (workout.isDone) "Finalizado" else "Pendiente",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp))

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FichaWorkoutPreview(){
    FichaWorkout(
        workout = Workout(
            Id = 1,
            name = "Cardio Zona 2",
            Time = "60.3m",
            isDone = true,
            Img = R.drawable.workout_run
        )
    )
}
