# Free Steam Games API
This is an API which provides all the currently free steam games which would usually cost money.

## How
The program scrapes [this](https://steamdb.info/upcoming/free/) page from SteamDB.info for the ID of all the currently free games. It will then call the Steam API itself to gain some additional information and save that in a PostgreSQL database. This database can then be accessed through a REST-API.
