package problem_2.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProbabilityTest {

  @Test
  void shouldRepresentProbability() {
    Probability probabilityOfGettingTails = Probability.create(0.5);

    assertEquals(probabilityOfGettingTails, Probability.create(0.5));
  }

  @Test
  void shouldRepresentNotGettingProbability() {
    Probability probabilityForNotGettingTails = Probability.create(0.5);

    assertEquals(probabilityForNotGettingTails.not(), Probability.create(0.5));
  }

  @Test
  void shouldRepresentChanceForGettingTailsOn2Coins() {
    Probability probabilityOfGettingTailOnACoin = Probability.create(0.5);
    Probability result = probabilityOfGettingTailOnACoin.and(probabilityOfGettingTailOnACoin);
    assertEquals(result, Probability.create(0.25));
  }
}