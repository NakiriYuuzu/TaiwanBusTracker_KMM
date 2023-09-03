package net.yuuzu.taiwanbustrack_kmm.common.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.icerock.moko.resources.compose.fontFamilyResource

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
//    val typography = Typography(
//        titleLarge = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_bold.sf_pro_text_bold),
//            fontWeight = FontWeight.Bold,
//            fontSize = 28.sp,
//            lineHeight = 32.sp,
//            letterSpacing = 0.sp
//        ),
//        titleMedium = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_bold.sf_pro_text_bold),
//            fontWeight = FontWeight.Bold,
//            fontSize = 24.sp,
//            lineHeight = 28.sp,
//            letterSpacing = 0.sp
//        ),
//        titleSmall = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_bold.sf_pro_text_bold),
//            fontWeight = FontWeight.Bold,
//            fontSize = 20.sp,
//            lineHeight = 24.sp,
//            letterSpacing = 0.sp
//        ),
//        bodyLarge = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_medium.sf_pro_text_medium),
//            fontWeight = FontWeight.SemiBold,
//            fontSize = 16.sp,
//            lineHeight = 20.sp,
//            letterSpacing = 0.sp
//        ),
//        bodyMedium = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_medium.sf_pro_text_medium),
//            fontWeight = FontWeight.Normal,
//            fontSize = 14.sp,
//            lineHeight = 20.sp,
//            letterSpacing = 0.sp
//        ),
//        bodySmall = TextStyle(
//            fontFamily = fontFamilyResource(SharedRes.fonts.sf_pro_text_medium.sf_pro_text_medium),
//            fontWeight = FontWeight.Normal,
//            fontSize = 12.sp,
//            lineHeight = 16.sp,
//            letterSpacing = 0.sp
//        ),
//    )
//
//    MaterialTheme(
//        colorScheme = if(darkTheme) DarkColors else LightColors,
//        typography = typography,
//        content = content
//    )
}