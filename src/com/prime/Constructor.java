package com.prime;

import com.constructor.Post;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Post post = new Post();
		
		System.out.println(Post.postedBy);
		
		post.setPostedType("sports");
		post.setLikesCount(100);
		post.setCanShare(true);
		System.out.println(post.getLikesCount());
		System.out.println(post.getPostedType());
		System.out.println(post.isCanShare());
		
		Post post1 = new Post();

		System.out.println(Post.postedBy);
		
		post1.setPostedType("cricket");
		post1.setLikesCount(200);
		post1.setCanShare(false);
		System.out.println(post1.getLikesCount());
		System.out.println(post1.getPostedType());
		System.out.println(post1.isCanShare());
		
		Post post2 = new Post("football", 300, false);
		System.out.println(post2.getLikesCount());
		System.out.println(post2.getPostedType());
		System.out.println(post2.isCanShare());
	}

}
