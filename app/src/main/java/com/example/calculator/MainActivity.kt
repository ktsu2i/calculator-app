package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Calculator()
                }
            }
        }
    }
}

@Composable
fun Calculator() {
    var isDoneFirstNum: Boolean = false
    var showResult by remember { mutableStateOf(false) }
    var firstNum: String = ""
    var secondNum: String = ""
    var operator by remember { mutableStateOf("") }

    var label by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0) }

    if (operator == "+")
    {
        result = firstNum.toInt() + secondNum.toInt()
    }

    if (operator == "-")
    {
        result = firstNum.toInt() - secondNum.toInt()
    }

    Column(modifier = Modifier)
    {
        Row(modifier = Modifier)
        {
            if (showResult)
            {
                Text(
                    text = "$result",
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
            }
            else
            {
                Text(
                    text = label,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
            }
        }
        Row(modifier = Modifier)
        {
            Button(onClick = {
                label += "1"
                if (isDoneFirstNum)
                {
                    secondNum += "1"
                }
                else
                {
                    firstNum += "1"
                }
            })
            {
                Text(text = stringResource(id = R.string.one))
            }
            Button(onClick = {
                label += "2"
                if (isDoneFirstNum)
                {
                    secondNum += "2"
                }
                else
                {
                    firstNum += "2"
                }
            })
            {
                Text(text = stringResource(id = R.string.two))
            }
            Button(onClick = {
                label += "3"
                if (isDoneFirstNum)
                {
                    secondNum += "3"
                }
                else
                {
                    firstNum += "3"
                }
            })
            {
                Text(text = stringResource(id = R.string.three))
            }
        }
        Row(modifier = Modifier)
        {
            Button(onClick = {
                label += "4"
                if (isDoneFirstNum)
                {
                    secondNum += "4"
                }
                else
                {
                    firstNum += "4"
                }
            })
            {
                Text(text = stringResource(id = R.string.four))
            }
            Button(onClick = {
                label += "5"
                if (isDoneFirstNum)
                {
                    secondNum += "5"
                }
                else
                {
                    firstNum += "5"
                }
            })
            {
                Text(text = stringResource(id = R.string.five))
            }
            Button(onClick = {
                label += "6"
                if (isDoneFirstNum)
                {
                    secondNum += "6"
                }
                else
                {
                    firstNum += "6"
                }
            })
            {
                Text(text = stringResource(id = R.string.six))
            }
        }
        Row(modifier = Modifier)
        {
            Button(onClick = {
                label += "7"
                if (isDoneFirstNum)
                {
                    secondNum += "7"
                }
                else
                {
                    firstNum += "7"
                }
            })
            {
                Text(text = stringResource(id = R.string.seven))
            }
            Button(onClick = {
                label += "8"
                if (isDoneFirstNum)
                {
                    secondNum += "8"
                }
                else
                {
                    firstNum += "8"
                }
            })
            {
                Text(text = stringResource(id = R.string.eight))
            }
            Button(onClick = {
                label += "9"
                if (isDoneFirstNum)
                {
                    secondNum += "9"
                }
                else
                {
                    firstNum += "9"
                }
            })
            {
                Text(text = stringResource(id = R.string.nine))
            }
        }
        Button(onClick = {
            label += "0"
            if (isDoneFirstNum)
            {
                secondNum += "0"
            }
            else
            {
                firstNum += "0"
            }
        })
        {
            Text(text = stringResource(id = R.string.zero))
        }
        
        Spacer(modifier = Modifier
            .width(10.dp)
            .height(30.dp))

        Column(modifier = Modifier)
        {
            Button(onClick = {
                label += "+"
                operator = "+"
                if (!isDoneFirstNum)
                {
                    isDoneFirstNum = true
                }
            })
            {
                Text(text = stringResource(id = R.string.plus))
            }
            Button(onClick = {
                label += "-"
                operator = "-"
                if (!isDoneFirstNum)
                {
                    isDoneFirstNum = true
                }
            })
            {
                Text(text = stringResource(id = R.string.minus))
            }
            Button(onClick = {
                showResult = true
            })
            {
                Text(text = stringResource(id = R.string.equal))
            }
            Button(onClick = {
                // reset all
                showResult = false
                firstNum = ""
                secondNum = ""
                isDoneFirstNum = false
            })
            {
                Text(text = stringResource(id = R.string.clear))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}