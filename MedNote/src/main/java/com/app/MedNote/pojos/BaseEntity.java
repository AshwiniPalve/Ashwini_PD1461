package com.app.MedNote.pojos;

import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@MappedSuperclass
public class BaseEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Integer Id;

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}


}
