package com.example.personalproyectpractice.Data

import com.example.personalproyectpractice.R

val workoutList = listOf<Workout>(
    Workout(
        Id = 1,
        name = "Run Zone 2",
        Time = "50m",
        isDone = false,
        Img = R.drawable.workout_run
    ),
    Workout(
        Id = 2,
        name = "Chest Day Gym",
        Time = "1h",
        isDone = true,
        Img = R.drawable.chest_day
    ),
    Workout(
        Id = 3,
        name = "Flexibility Home",
        Time = "30m",
        isDone = true,
        Img = R.drawable.flexibility
    ),
    Workout(
        Id = 4,
        name = "Fast Cardio Hit",
        Time = "60s",
        isDone = false,
        Img = R.drawable.cardio_hit
    ),
    Workout(
        Id = 5,
        name = "Leg Day Gym",
        Time = "2h",
        isDone = true,
        Img = R.drawable.leg_day
    )
)