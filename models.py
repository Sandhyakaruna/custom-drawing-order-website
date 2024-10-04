from flask_sqlalchemy import SQLAlchemy
from app import app

db = SQLAlchemy(app)

class Order(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    email = db.Column(db.String(120), nullable=False)
    drawing_type = db.Column(db.String(80), nullable=False)
    description = db.Column(db.Text, nullable=False)
    image = db.Column(db.String(120), nullable=True)

# Create the tables
db.create_all()
