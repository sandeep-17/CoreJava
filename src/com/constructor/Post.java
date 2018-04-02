package com.constructor;

public class Post {
		
		public static final String postedBy = "Alex";
		
		private int likesCount;
		private String postedType;
		private boolean canShare;
		
		public Post() {
			System.out.println("this is default constructor ");
		}
		public Post(String postedType, int likesCount, boolean canShare) {
			System.out.println("this is parameterized constructor ");
			this.postedType = postedType;
			this.likesCount = likesCount;
			this.canShare = canShare;
		}
		
		
		public String getPostedType() {
			return postedType;
		}
		public void setPostedType(String postedType) {
			this.postedType = postedType;
		}
		public int getLikesCount() {
			return likesCount;
		}
		public void setLikesCount(int likesCount) {
			this.likesCount = likesCount;
		}
		
		public boolean isCanShare() {
			return canShare;
		}
		public void setCanShare(boolean canShare) {
			this.canShare = canShare;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return postedType;
		}
		
		@Override
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return postedType.equals(getPostedType());
		}
		
		@Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return postedType.hashCode();
		}
}
