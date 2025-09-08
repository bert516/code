const score = JSON.parse(localStorage.getItem("score")) || {wins: 0, losses: 0, ties:0 };

updateScoreElement();
function playGame(Move) {
  let compMove = pickComputerMove();
  let result = "";
  if (Move === "scissors") {
    if (compMove === 'rock') {
      result = 'You Lose';
    } else if (compMove === 'paper') {
      result = 'You Win';
    } else if (compMove === 'scissors') {
      result = 'Tie';
    }
  } else if (Move === "rock") {
    if (compMove === 'rock') {
      result = 'Tie';
    } else if (compMove === 'paper') {
      result = 'You Lose';
    } else if (compMove === 'scissors') {
      result = 'You Win';
    }
  } else {
    if (compMove === 'rock') {
      result = 'You Win';
    } else if (compMove === 'paper') {
      result = 'Tie';
    } else if (compMove === 'scissors') {
      result = 'You Lose';
    }
  }

  if (result === "You Win") {
    score.wins++ ;
  } else if (result === "You Lose") {
    score.losses++;
  } else {
    score.ties++;
  }
  localStorage.setItem("score", JSON.stringify(score));
  updateScoreElement();

  document.querySelector(".js-result").innerHTML = `${result}`
  document.querySelector(".js-moves").innerHTML = `You <img src="images/${Move}-emoji.png" class='move-icon'> - <img src="images/${compMove}-emoji.png" class='move-icon'> Computer`
}

function updateScoreElement() {
  document.querySelector(".js-score")
    .innerHTML = `Wins: ${score.wins}, Losses: ${score.losses}, Ties: ${score.ties}`;
}
function pickComputerMove() {
  let compMove = '';
  const randomNumber = Math.random();
  if (randomNumber < 1/3) {
    compMove = 'rock';
  } else if (randomNumber >= 1/3 && randomNumber < 2/3) {
    compMove = 'paper';
  } else {
    compMove = 'scissors';
  }

  return compMove;
}