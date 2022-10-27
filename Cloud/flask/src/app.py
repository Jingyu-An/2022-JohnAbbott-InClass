from flask import Flask, render_template, request, session

app = Flask(__name__)
app.secret_key = 'softwareapplicationssecret'

@app.route('/')
def index():
    return render_template('index.html')


@app.route('/welcome')
def welcome():
    name = session['name']
    surname = name.get('surname', None)
    age = name.get('age', None)
    email = name.get('email', None)
    return render_template('welcome.html', name=name, surname=surname, age=age, email=email)


@app.route('/register', methods=['POST'])
def register():
    name = request.form['user']
    surname = request.form['surname']
    age = request.form['age']
    email = request.form['email']
    session['name'] = name
    return render_template('welcome.html', name=name, surname=surname, age=age, email=email)


if __name__ == '__main__':
    app.run(debug=True)
