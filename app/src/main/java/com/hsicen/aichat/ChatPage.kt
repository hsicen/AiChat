package com.hsicen.aichat

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author: hsicen
 * @date: 2023/7/6 18:22
 * @email: codinghuang@163.com
 * description: 聊天界面
 */

data class ChatData(
  val name: String = "",
  val timeStamp: String = "",
  val content: String = "",
  val contentType: Int = 0,
  val icon: String = ""
)


@Preview(showBackground = true)
@Composable
fun ChatItem(data: ChatData = ChatData()) {
  Row {
    Image(painter = painterResource(R.drawable.ic_launcher_foreground), contentDescription = "头像")
  }
}