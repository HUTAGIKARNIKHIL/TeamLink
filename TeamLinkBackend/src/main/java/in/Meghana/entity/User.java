package in.Meghana.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class User {

	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy="sender",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Message> messages;
//	@ManyToMany(mappedBy="participants")
//	private List<ChatRoom> chatRooms;
}
