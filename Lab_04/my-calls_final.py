from flask import app
import httpx

url = "https://improved-meme-q79wvvq6vv99cxrr-5000.app.github.dev/"

# Test GET request
response = httpx.get(url)
print(response.status_code)
print(response.text)

# Login attempts
logins = [
    {"id": "phillip.bradford@uconn.edu", "token": "f99aa8b8573062e9802f4fc0807ae1cb"},
    {"id": "123456@uconn.edu", "token": "khjbvgcfdxgchvjbn"},  
    {"id": "7890@uconn.edu", "token": "okjlhgfdresrdfghjjkbhmn"},
    {"id": "khrystyna@uconn.edu", "token": "f99"},
    {"id": "khrystyna@uconn.edu", "token": "bhfjnkdls"}]

# Test POST requests for login
for login in logins:
    response = httpx.post(url + "login", data=login)
    print("Login attempt for:", login['id'])
    # Print the response
    print(response.text)