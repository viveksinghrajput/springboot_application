package com.vivek.solid.LSP;

public abstract class SocialMedia {
	
	//@support whatsapp, facebook, Instagram
	public abstract void chatWithFriend();
	
	//@support  facebook, Instagram
	public abstract void publishPost(Object object);
	
	//@support whatsapp, facebook, Instagram
	public abstract void sendPhotosAndVideos();
	
	//@support whatsapp, facebook
	public abstract void groupVideoCall(String...strings);
	
	

}
