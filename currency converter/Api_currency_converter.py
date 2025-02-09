from dotenv import load_dotenv
import os
import requests as req

load_dotenv()

API= os.getenv("API_URL")


response = req.get("https://api.currencyapi.com/v3/latest?apikey=cur_live_OKzKiCSMDYsygpZtJap3MDKfXZTF4OyHqWiGJ8JN")
data = response.json()
