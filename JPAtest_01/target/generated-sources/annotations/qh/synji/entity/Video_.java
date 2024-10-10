package qh.synji.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Video.class)
public abstract class Video_ {

	public static final String QUERY_VIDEO_FIND_ALL = "Video.findAll";
	public static final String ACTIVE = "active";
	public static final String DESCRIPTION = "description";
	public static final String VIDEO_ID = "videoId";
	public static final String TITLE = "title";
	public static final String CATEGORY = "category";
	public static final String POSTER = "poster";
	public static final String VIEWS = "views";

	
	/**
	 * @see qh.synji.entity.Video#active
	 **/
	public static volatile SingularAttribute<Video, Integer> active;
	
	/**
	 * @see qh.synji.entity.Video#description
	 **/
	public static volatile SingularAttribute<Video, String> description;
	
	/**
	 * @see qh.synji.entity.Video#videoId
	 **/
	public static volatile SingularAttribute<Video, String> videoId;
	
	/**
	 * @see qh.synji.entity.Video#title
	 **/
	public static volatile SingularAttribute<Video, String> title;
	
	/**
	 * @see qh.synji.entity.Video#category
	 **/
	public static volatile SingularAttribute<Video, Category> category;
	
	/**
	 * @see qh.synji.entity.Video
	 **/
	public static volatile EntityType<Video> class_;
	
	/**
	 * @see qh.synji.entity.Video#poster
	 **/
	public static volatile SingularAttribute<Video, String> poster;
	
	/**
	 * @see qh.synji.entity.Video#views
	 **/
	public static volatile SingularAttribute<Video, Integer> views;

}

