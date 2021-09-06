class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.Button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}