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
	private Integer m_id;

	@ManyToOne
	@JoinColumn(/*name = "authorid",*/ referencedColumnName = "id",foreignKey=@ForeignKey(name="authorpublicationmapping_authorid_fkey", value=ConstraintMode.CONSTRAINT))
	private Author m_author;


	@ManyToOne
	@JoinColumn(/*name = "publicationid",*/ referencedColumnName = "id",foreignKey=@ForeignKey(name="authorpublicationmapping_publicationid_fkey", value=ConstraintMode.CONSTRAINT))
	private Publication m_publication;


	public Integer getId()
	{
		return m_id;
	}
	public void setId(Integer v_id)
	{
		m_id=v_id;
	}
	public Author getAuthor()
	{
		return m_author;
	}
	public void setAuthor(Author v_author)
	{
		m_author=v_author;
	}
	public Publication getPublication()
	{
		return m_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_publication=v_publication;
	}

}