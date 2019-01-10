package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.elasticsearch.search.DocValueFormat.DateTime;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@GeneratedValue(generator = "system-uuid")
	private String id;
	@Column(nullable = false)
	private String title;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "CONTENT", columnDefinition = "BLOB",nullable=false)
	private byte[] content;
	@Column(nullable = false)
	private String creatorId;
	@Column(nullable = false)
	private String privacy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastUpdateTs;

	public Blog() {
		super();
	}
	
	public Blog(String id, String title, byte[] content, String creatorId, String privacy, Date createTs,
			Date lastUpdateTs) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.creatorId = creatorId;
		this.privacy = privacy;
		this.createTs = createTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getLastUpdateTs() {
		return lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}