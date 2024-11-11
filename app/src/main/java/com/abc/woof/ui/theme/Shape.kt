package com.abc.woof.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// extra small, small, medium, large and extra large
val Shapes = Shapes(
    small = RoundedCornerShape(50.dp),
    medium = RoundedCornerShape(bottomStart = 16.dp, topEnd = 16.dp)
)

// extension
// val Shapes.round: CornerBasedShape
//     get() = RoundedCornerShape(50.dp)