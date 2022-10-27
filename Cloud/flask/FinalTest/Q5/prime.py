from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('prime.html')


@app.route('/prime', methods=['POST'])
def prime():
    firstNumber = int(request.form['firstNumber'])
    secondNumber = int(request.form['secondNumber'])
    allNumber = []
    notPrimeNumbers = []
    primeNumbers = ''

    result = True
    if firstNumber >= secondNumber:
        return render_template('prime.html', error='The first number should be always smaller than the second number.')

    for i in range(firstNumber, secondNumber+1):
        allNumber.append(i)
        for j in range(2, i):
            if i % j == 0:
                result = False
            if not result:
                notPrimeNumbers.append(i)
                break
        result = True

    for i in range(0, len(notPrimeNumbers)):
        allNumber.remove(notPrimeNumbers[i])

    for i in range(0, len(allNumber)):
        if allNumber[i] != 0 and allNumber[i] != 1:
            primeNumbers += ' ' + str(allNumber[i])

    return render_template('prime.html', firstNumber=firstNumber, secondNumber=secondNumber, primeNumbers=primeNumbers)


if __name__ == '__main__':
    app.run(debug=True)
