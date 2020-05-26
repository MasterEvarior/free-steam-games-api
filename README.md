# Free Steam Games API
This is an API which will provide you with all the steam games which are currently free but would usually cost money.

## How
The program scrapes [this](https://steamdb.info/upcoming/free/) page from SteamDB.info for the ID of all the currently free games. It will then call the Steam API itself to gain some additional information concerning these games and saves that in a PostgreSQL database. This database can then be accessed through a REST-API.