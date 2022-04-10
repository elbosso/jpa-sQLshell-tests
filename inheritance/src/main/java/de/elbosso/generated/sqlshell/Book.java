package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "book"
/*	,indexes = {
		@Index(name= "book_pkey", columnList="id")
	}*/
)
public class Book
extends Publication
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToOne
	@JoinColumn(name = "id"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="book_id_fkey"
				, value=ConstraintMode.CONSTRAINT), insertable = false
				, updatable = false	)
	private Publication m_book_publication;


	@Column(name = "isbn"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_book_isbn;

	public Publication getPublication()
	{
		return m_book_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_book_publication=v_publication;
	}
	public String getIsbn()
	{
		return m_book_isbn;
	}
	public void setIsbn(String v_isbn)
	{
		m_book_isbn=v_isbn;
	}

}