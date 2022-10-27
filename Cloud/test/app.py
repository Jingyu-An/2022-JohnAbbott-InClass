from flask import Flask, render_template, request
import random

app = Flask(__name__)

player = ['player1', 'player2']
score = [0, 0]
totalScore = [0, 0]
diceNumber = 1
activePlayer = 0  # 0 : player1, 1: player2

@app.route('/')
def index():
    global diceNumber
    diceNumber = 1
    return render_template('dicegame.html', image_file='images/die' + str(diceNumber) + '.bmp')


@app.route('/playerName')
def playerName():
    global player
    return render_template('playerName.html', error1=player[0], error2=player[1])


@app.route('/start', methods=['POST'])
def start():
    global player, score, totalScore, diceNumber, activePlayer
    player[0] = request.form['player1']
    player[1] = request.form['player2']

    if not player[0]:
        return render_template('playerName.html', error1='Enter the name')
    if not player[1]:
        return render_template('playerName.html', error2='Enter the name')

    score[0] = score[1] = totalScore[0] = totalScore[1] = 0
    diceNumber = 1
    activePlayer = 0

    active1 = '**'
    active2 = ''

    return render_template('dicegame.html', player1=player[0], player2=player[1],
                           score1=score[0], score2=score[1], active1=active1, active2=active2,
                           totalScore1=totalScore[0], totalScore2=totalScore[1],
                           image_file='images/die' + str(diceNumber) + '.bmp')


@app.route('/playing')
def playing():
    global player, score, totalScore, diceNumber, activePlayer

    diceNumber = random.randint(1, 6)

    score[activePlayer] += diceNumber

    if diceNumber == 1:
        score[activePlayer] = 0
        activePlayer = 1 if activePlayer == 0 else 0

    if activePlayer == 0:
        active1 = '**'
        active2 = ''
    else:
        active1 = ''
        active2 = '**'

    return render_template('dicegame.html', player1=player[0], player2=player[1],
                           score1=score[0], score2=score[1], active1=active1, active2=active2,
                           totalScore1=totalScore[0], totalScore2=totalScore[1],
                           image_file='images/die' + str(diceNumber) + '.bmp')


@app.route('/hold')
def hold():
    global player, score, totalScore, diceNumber, activePlayer

    totalScore[activePlayer] += score[activePlayer]
    score[activePlayer] = 0
    winner = ['', '']

    if totalScore[activePlayer] >= 20:
        winner[activePlayer] += '🎉🎉🎉🎉🎉🎉'

    activePlayer = 1 if activePlayer == 0 else 0

    if activePlayer == 0:
        active1 = '**'
        active2 = ''
    else:
        active1 = ''
        active2 = '**'

    return render_template('dicegame.html', player1=player[0], player2=player[1],
                           score1=score[0], score2=score[1], active1=active1, active2=active2,
                           totalScore1=totalScore[0], totalScore2=totalScore[1],
                           winner1=winner[0], winner2=winner[1],
                           image_file='images/die' + str(diceNumber) + '.bmp')


if __name__ == '__main__':
    app.run(debug=True)
