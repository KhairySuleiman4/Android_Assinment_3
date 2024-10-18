package com.example.facebookapplication

import android.icu.util.Calendar
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.facebookapplication.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val posts = mutableListOf<Post>()
    lateinit var postsAdapter: PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        createPostsList()
        postsAdapter = PostsAdapter(posts)
        binding.rvTimeLine.adapter = postsAdapter
    }

    private fun createPostsList() {
        val time: Date = Calendar.getInstance().time

        posts.add(
            Post(
                author = User("Khairy", R.drawable.user_image),
                time = time.toString(),
                caption = "This is the first post",
                image = R.drawable.user_image
            )
        )

        posts.add(
            Post(
                author = User("Ahmad", R.drawable.user_image),
                time = time.toString(),
                caption = "This is the second post",
                image = R.drawable.user_image
            )
        )

        posts.add(
            Post(
                author = User("Muhammad", R.drawable.user_image),
                time = time.toString(),
                caption = "This is the third post",
                image = R.drawable.user_image
            )
        )

        posts.add(
            Post(
                author = User("Abdullah", R.drawable.user_image),
                time = time.toString(),
                caption = "This is the fourth post",
                image = R.drawable.user_image
            )
        )

        posts.add(
            Post(
                author = User("Hatem", R.drawable.user_image),
                time = time.toString(),
                caption = "This is the fifth and final post",
                image = R.drawable.user_image
            )
        )
    }
}
