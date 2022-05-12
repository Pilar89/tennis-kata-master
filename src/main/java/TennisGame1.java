
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }


  public String getScore() {

    if (m_score1==m_score2) {
      return scoreOneCase();

    }
    if (m_score1>=4 || m_score2>=4){
      return scoreTwoCase();
    }
    return scoreThreeCase();
  }


    public String scoreOneCase(){
      String score = "";
      switch (m_score1)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
      return  score;

    }

  public String scoreTwoCase(){

    int minusResult = m_score1-m_score2;
    if (minusResult==1){
      return "Advantage player1";
    }
    if (minusResult ==-1) {
      return "Advantage player2";
    }
    if (minusResult>=2){
      return "Win for player1";
    }
    return "Win for player2";

  }

  public String scoreThreeCase(){
    int tempScore=0;
    String score = "";

    for (int i=1; i<3; i++)
    {
      if (i==1) tempScore = m_score1;
      else { score+="-"; tempScore = m_score2;}

      switch(tempScore)
      {
        case 0:
          score+="Love";
          break;
        case 1:
          score+="Fifteen";
          break;
        case 2:
          score+="Thirty";
          break;
        case 3:
          score+="Forty";
          break;
      }
    }
    return score;
  }




}
