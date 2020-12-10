package fr.unilim.iut.MarsRover;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RoverTest {
	@Test
	public void roover_commence_a_0_0() {
		Rover rover = new Rover();
		assertThat(rover.positionX()).isEqualTo(rover.positionY());
	}
	@Test
	public void roover_avance_de_1_en_Y_quand_on_appel_forward_vers_le_nord() {
		Rover roover = new Rover();
		roover.deplacement("F");
		assertThat(roover.positionX()).isZero();
		assertThat(roover.positionY()).isEqualTo(1);
	}
	@Test
	public void roover_se_decale_de_1_en_X_quand_on_appel_forward_vers_est() {
		Rover roover = new Rover();
		roover.deplacement("R");
		roover.deplacement("F");
		assertThat(roover.positionX()).isEqualTo(1);
		assertThat(roover.positionY()).isZero();

	}
}
