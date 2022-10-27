from flask import Flask, render_template, request

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('halloween.html')


@app.route('/halloween', methods=['POST'])
def halloween():
    numberBoxes = int(request.form['numberBoxes'])
    discount = 0

    totalNoDis = round(numberBoxes * 11.99, 3)

    if 5 <= numberBoxes <= 9:
        discount = 10
    elif 10 <= numberBoxes <= 29:
        discount = 25
    elif 30 <= numberBoxes <= 49:
        discount = 40
    elif 50 <= numberBoxes:
        discount = 50

    discountCost = round(totalNoDis * discount / 100, 3)
    total = round(totalNoDis - discountCost, 3)

    return render_template('halloween.html', numberBoxes=numberBoxes, totalNoDis=totalNoDis, discount=discount,
                           discountCost=discountCost, total=total)


if __name__ == '__main__':
    app.run(debug=True)
