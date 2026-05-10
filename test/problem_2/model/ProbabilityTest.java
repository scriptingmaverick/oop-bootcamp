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

  @Test
  void shouldRepresentChanceForGetting3OnADice() {
    Probability probability = Probability.create((double) (1 / 6));

    assertEquals(probability, Probability.create((double) (1 / 6)));
  }

  @Test
  void shouldRepresentAChanceForGettingAtLeastOneTailsOn2Coins() {
    Probability chanceOfGettingATail = Probability.create(0.5);

    Probability chanceForGettingAtLeastOneTail = chanceOfGettingATail.or(chanceOfGettingATail);

    assertEquals(chanceForGettingAtLeastOneTail, Probability.create(0.75));
  }

  @Test
  void shouldRepresentAChanceForGettingAtLeastOneTailsOn2CoinsInDeMorganForm() {
    Probability chanceOfGettingATail = Probability.create(0.5);

    Probability chanceForGettingAtLeastOneTail = chanceOfGettingATail.deMorganForm(chanceOfGettingATail);

    assertEquals(chanceForGettingAtLeastOneTail, Probability.create(0.75));
  }
}