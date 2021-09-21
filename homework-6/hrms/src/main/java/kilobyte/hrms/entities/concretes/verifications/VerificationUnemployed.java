package kilobyte.hrms.entities.concretes.verifications;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "verification_unemployed")
@PrimaryKeyJoinColumn(name = "verification_id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VerificationUnemployed extends Verification {
	
	@Column(name = "unemployed_id")
	private int unemployedId;
}
