 package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="properties")
public class Property {
	@Id @GeneratedValue
	private Long id;
	@Column(length =50)
	private int examId;
	@Column(length =20)
	private int userId;
	@Column(length =20)
	private String startDateTime;
	@Column(length =20)
	private int duration;
	@Column(length =20)
	private int grade;
	@Column(length =20)
	private String status;
	
	
	public Property(int examId, int userId, String startDateTime, int duration, int grade, String status) {
		super();
		this.examId = examId;
		this.userId = userId;
		this.startDateTime = startDateTime;
		this.duration = duration;
		this.grade = grade;
		this.status = status;
	}

	public Property() {
		this(0,0,"",0,0,"");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Properties [id=" + id + ", examId=" + examId + ", userId=" + userId + ", startDateTime=" + startDateTime
				+ ", duration=" + duration + ", grade=" + grade + ", status=" + status + "]";
	}
}
