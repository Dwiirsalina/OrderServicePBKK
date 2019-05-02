package com.pbkk.model;

import java.util.Set;

public @interface ManyToMany {
	@ManyToMany(mappedBy = "likedMenus")
	Set<Pesanan> likes;
}
