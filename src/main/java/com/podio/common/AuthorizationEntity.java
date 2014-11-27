package com.podio.common;

import java.io.Serializable;
import java.net.URL;

import org.codehaus.jackson.annotate.JsonProperty;

import com.podio.file.File;

public class AuthorizationEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private AuthorizationEntityType type;

	private int id;

	private AvatarType avatarType;

	private Integer avatarId;

	private String name;

	private URL url;
	
	private File image;
	

	public AuthorizationEntityType getType() {
		return type;
	}

	public void setType(AuthorizationEntityType type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AvatarType getAvatarType() {
		return avatarType;
	}

	@JsonProperty("avatar_type")
	public void setAvatarType(AvatarType avatarType) {
		this.avatarType = avatarType;
	}

	public Integer getAvatarId() {
		return avatarId;
	}

	@JsonProperty("avatar_id")
	public void setAvatarId(Integer avatarId) {
		this.avatarId = avatarId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getUrl() {
		return url;
	}
	

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
}
