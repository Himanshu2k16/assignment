package in.tripva.assignment.user.userEntity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    private Role role;

}
