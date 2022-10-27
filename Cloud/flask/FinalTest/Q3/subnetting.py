from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('subnetting.html')


@app.route('/subnetting', methods=['POST'])
def subnetting():
    firstNumber = int(request.form['firstNumber'])
    secondNumber = int(request.form['secondNumber'])
    thirdNumber = int(request.form['thirdNumber'])
    fourthNumber = int(request.form['fourthNumber'])
    cidr = int(request.form['cidr'])
    numberHosts = 0
    numberServers = 0
    rangeIPv4 = 0

    if not 0 <= firstNumber <= 255\
            or not 0 <= secondNumber <= 255\
            or not 0 <= thirdNumber <= 255 \
            or not 0 <= fourthNumber <= 255 \
            or not 16 <= cidr <= 28:
        return render_template('subnetting.html',
                               error='The IPv4 number should be in the range [0,255] and'
                                     ' the CIDR number is [16,28].')

    rangeIPv4 = int(65536 / (2 ** (cidr - 16)))

    numberHosts = rangeIPv4 - 5
    numberServers = rangeIPv4 - 2

    return render_template('subnetting.html', firstNumber=firstNumber, secondNumber=secondNumber,
                           thirdNumber=thirdNumber, fourthNumber=fourthNumber, cidr=cidr,
                           numberHosts=numberHosts, numberServers=numberServers, rangeIPv4=rangeIPv4)


if __name__ == '__main__':
    app.run(debug=True)

