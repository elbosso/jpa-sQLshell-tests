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

	@ManyToOne
	//{public.stackoverflowposting=id, public.book=id, public.posting=id}
	//id
	//${childParentMappingColumn.get(tableDescription)}
	//${childParentMappingColumn.get(tableDescription).name}
	//${childParentMappingColumn.get(tableDescription).getName()}
	@JoinColumn(name = "id"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="book_id_fkey"
				, value=ConstraintMode.CONSTRAINT), insertable = false
				, updatable = false	)
	private Publication m_publication;


	@Column(name = "isbn"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_isbn;

	public Publication getPublication()
	{
		return m_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_publication=v_publication;
	}
	public String getIsbn()
	{
		return m_isbn;
	}
	public void setIsbn(String v_isbn)
	{
		m_isbn=v_isbn;
	}

}