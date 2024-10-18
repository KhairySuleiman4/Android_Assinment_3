package com.example.facebookapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(val postsList : List<Post>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    class ViewHolder(val postView : View) : RecyclerView.ViewHolder(postView){
        val profileImv : ImageView = postView.findViewById(R.id.UserImage)
        val profileTv : TextView = postView.findViewById(R.id.tv_user_name)
        val postTimeTv : TextView = postView.findViewById(R.id.PostTime)
        val postCaptionTv : TextView = postView.findViewById(R.id.postCaption)
        val postImageView : ImageView = postView.findViewById(R.id.post_image)

        fun bind(post : Post){
            profileImv.setImageResource(post.author.profilePic)
            profileTv.text = post.author.name
            postTimeTv.text = post.time
            postCaptionTv.text = post.caption
            postImageView.setImageResource(post.image)
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val postView = LayoutInflater.from(p0.context).inflate(R.layout.activity_post, p0, false)
        return ViewHolder(postView)
    }

    override fun getItemCount(): Int {
        return  postsList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val post = postsList[p1]
        p0.bind(post)
    }
}