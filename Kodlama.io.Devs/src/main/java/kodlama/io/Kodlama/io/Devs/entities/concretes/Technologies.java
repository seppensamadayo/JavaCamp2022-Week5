package kodlama.io.Kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name="Technologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technologies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	
private int id;
	@Column(name="Technology")
private String technology;
	@OneToMany
	@JoinColumn(name="Language_id")
    private List<Technologies> technologies;
}
