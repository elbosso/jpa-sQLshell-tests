package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "authorpublicationmapping"
/*	,indexes = {
		@Index(name= "authorpublicationmapping_pkey", columnList="id")
	}*/
)
public class Authorpublicationmapping
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "id"
		, nullable = false
		, updatable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_authorpublicationmapping_id;

	@ManyToOne
	@JoinColumn(name = "authorid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="authorpublicationmapping_authorid_fkey"
				, value=ConstraintMode.CONSTRAINT)	)
	private Author m_authorpublicationmapping_author;


	@ManyToOne
	@JoinColumn(name = "publicationid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="authorpublicationmapping_publicationid_fkey"
				, value=ConstraintMode.CONSTRAINT)	)
	private Publication m_authorpublicationmapping_publication;


	public Integer getId()
	{
		return m_authorpublicationmapping_id;
	}
	public void setId(Integer v_id)
	{
		m_authorpublicationmapping_id=v_id;
	}
	public Author getAuthor()
	{
		return m_authorpublicationmapping_author;
	}
	public void setAuthor(Author v_author)
	{
		m_authorpublicationmapping_author=v_author;
	}
	public Publication getPublication()
	{
		return m_authorpublicationmapping_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_authorpublicationmapping_publication=v_publication;
	}

}