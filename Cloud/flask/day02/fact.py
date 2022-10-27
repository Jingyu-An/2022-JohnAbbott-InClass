from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('fact.html')


@app.route('/fact', methods=['POST'])
def fact():
    number = int(request.form['number'])
    test = request.form['number'];
    fact = 1;
    for i in range(number, 1, -1):
        fact *= i
        test += ' X ' + str(i-1)
    return render_template('fact.html', fact=fact, number=number, test=test)


if __name__ == '__main__':
    app.run(debug=True)
