class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


                GreetingText(
                    message = "Happy Birthday, Animesh!",
                    from = "~ From John",
                    modifier = Modifier.padding(8.dp)

                )
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 80.sp,
            textAlign = TextAlign.Center,
            lineHeight = 100.sp,
        )
        Text(
            text = from,
            fontSize = 46.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.End)
        )
    }

}

@Preview(showBackground = true, name = "Birthday Wishes", showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    GreetingText(message = "Happy Birthday Sam!", "From John")
}