from flask import Flask, render_template, request

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('converter.html')


@app.route('/converterDec', methods=['POST'])
def converterDec():
    decNumber = int(request.form['decNumber'])

    tempBin = ''
    decToBin = ''

    while decNumber > 0:
        tempBin += str(decNumber % 2)
        decNumber = int(decNumber / 2)

    for i in tempBin:
        decToBin = i + decToBin

    return render_template('converter.html', decNumber=request.form['decNumber'], decToBin=decToBin)


@app.route('/converterBin', methods=['POST'])
def converterBin():

    binNumber = int(request.form['binNumber'])

    tempDec = binNumber % 2
    binMultiple = 1

    while binNumber > 0:
        binMultiple *= 2
        binNumber = int(binNumber / 10)
        tempDec += (binNumber%2) * binMultiple

    binToDec = tempDec
    return render_template('converter.html', binNumber=request.form['binNumber'], binToDec=binToDec)


if __name__ == '__main__':
    app.run(debug=True)
