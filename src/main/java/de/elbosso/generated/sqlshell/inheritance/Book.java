package de.elbosso.generated.sqlshell.inheritance;

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

	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "id",foreignKey=@ForeignKey(name="book_id_fkey", value=ConstraintMode.CONSTRAINT))
	private Publication m_publication;


	@Column(name = "isbn"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_isbn;

	public Publication getPublication()
	{
		return m_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_publication=v_publication;
	}
	public java.lang.String getIsbn()
	{
		return m_isbn;
	}
	public void setIsbn(java.lang.String v_isbn)
	{
		m_isbn=v_isbn;
	}

}