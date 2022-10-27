from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('prime.html')


@app.route('/prime', methods=['POST'])
def prime():
    number = int(request.form['number'])
    result = True
    for i in range(number-1, 1, -1):
        if number % i == 0:
            result = False

    if result:
        prime = str(number) + ' is Prime'
    else:
        prime = str(number) + ' is Not Prime'
    return render_template('prime.html', number=number, prime=prime)


if __name__ == '__main__':
    app.run(debug=True)
