
public class TennisGame2 implements TennisGame {
  public int P1point = 0;
  public int P2point = 0;

  public String P1res = "";
  public String P2res = "";
  private String player1Name;
  private String player2Name;

  public TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String score = "";
    if (P1point == P2point && P1point < 4) {
      score = scoreOneCase();
    }
    if (P1point == P2point && P1point >= 3)
      score = "Deuce";

    if (P1point > 0 && P2point == 0) {
      score = scoreTwoCase();
    }
    if (P2point > 0 && P1point == 0) {
      score = scoreThreeCase();
    }

    if (P1point > P2point && P1point < 4) {
      score = scoreFourCase();
    }
    if (P2point > P1point && P2point < 4) {
      score = scoreFiveCase();
    }

    if (P1point > P2point && P2point >= 3) {
      score = "Advantage player1";
    }

    if (P2point > P1point && P1point >= 3) {
      score = "Advantage player2";
    }

    if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
      score = "Win for player1";
    }
    if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
      score = "Win for player2";
    }
    return score;
  }


  public String scoreOneCase() {
    String score = "-All";

    if (P1point == 0) {
      return "Love" + score;
    }

    if (P1point == 1) {
      return "Fifteen" + score;
    }

    return "Thirty" + score;
  }


  public String scoreTwoCase() {
    P2res = "Love";
    String score = P1res + "-" + P2res;

    if (P1point == 1) {
      P1res = "Fifteen";
      return score;
    }
    if (P1point == 2) {
      P1res = "Thirty";
      return score;
    }
    P1res = "Forty";
    return score;

  }

  public String scoreThreeCase() {
    P1res = "Love";
    String score = P1res + "-" + P2res;

    if (P2point == 1) {
      P2res = "Fifteen";
      return score;
    }
    if (P2point == 2) {
      P2res = "Thirty";
      return score;
    }
    P2res = "Forty";
    return score;

  }

  public String scoreFourCase() {
    if (P1point == 2) P1res = "Thirty";
    if (P1point == 3) P1res = "Forty";
    if (P2point == 1) P2res = "Fifteen";
    if (P2point == 2) P2res = "Thirty";
    String score = P1res + "-" + P2res;
    return score;

  }

  public String scoreFiveCase() {
    if (P2point == 2) P2res = "Thirty";
    if (P2point == 3) P2res = "Forty";
    if (P1point == 1) P1res = "Fifteen";
    if (P1point == 2) P1res = "Thirty";
    String score = P1res + "-" + P2res;
    return score;

  }


  public void SetP1Score(int number) {

    for (int i = 0; i < number; i++) {
      P1Score();
    }

  }

  public void SetP2Score(int number) {

    for (int i = 0; i < number; i++) {
      P2Score();
    }

  }

  public void P1Score() {
    P1point++;
  }

  public void P2Score() {
    P2point++;
  }

  public void wonPoint(String player) {
    if (player == "player1")
      P1Score();
    else
      P2Score();
  }
}
