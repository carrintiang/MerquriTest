//QUESTION 5
SELECT players.Name, scores.Sport, scores.Score as [Total Score] 
  FROM players INNER JOIN scores 
  on players.Player_no = scores.Player_no 
  ORDER BY scores.Score DESC;
