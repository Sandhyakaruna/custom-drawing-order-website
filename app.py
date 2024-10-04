# app.py

from flask import Flask, render_template, request, redirect, url_for, flash
import os

app = Flask(__name__)
app.secret_key = 'supersecretkey'

# Define the upload folder for images
UPLOAD_FOLDER = 'static/uploads'
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/submit-order', methods=['POST'])
def submit_order():
    name = request.form['name']
    email = request.form['email']
    drawing_type = request.form['drawing_type']
    description = request.form['description']

    # Handle file upload
    file = request.files['file']
    if file and file.filename != '':
        file.save(os.path.join(app.config['UPLOAD_FOLDER'], file.filename))

    # Flash a success message
    flash(f'Order submitted successfully by {name} for a {drawing_type} drawing!')
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
