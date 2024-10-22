from flask import Flask, request
logins = {
    "phillip.bradford@uconn.edu": "f99aa8b8573062e9802f4fc0807ae1cb",
    "123456@uconn.edu": "khjbvgcfdxgchvjbn",
    "7890@uconn.edu": "okjlhgfdresrdfghjjkbhmn",
    "khrystyna@uconn.edu": "bhfjnkdls"  
}

app = Flask(__name__)

@app.route("/", methods=['GET'])
def home():
    return "You called!"

@app.route("/login", methods=['POST'])
def login():
    id = request.form.get('id')
    token = request.form.get('token')
    if id in logins and token ==logins[id]:
        return "Login successful", 200
    return "Login failed", 401

if __name__ == "__main__":
   app.run(host='0.0.0.0')