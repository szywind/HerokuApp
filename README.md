# HerokuApp

skip to content

Suman's courses
User Tools
Log In
Site Tools

Search
Search
Recent ChangesMedia ManagerSitemap
Trace: • ios-labs-s16 • 407-spring2016 • android-labs-s16 • android_tutorial_4
android-labs-s16:android_tutorial_4
Sign up for heroku, you will need it to gain access to the data

https://signup.heroku.com/
start to become familiar with this site for next Monday
Create a new Project called HerokuApp and download the src file. Replace the src file of your app with the downloaded one (unzip and move to the app directory of your project). These are the dependencies you will need for GSON and Retrofit 2.0:

compile 'com.google.code.gson:gson:2.6.1'
compile 'com.squareup.retrofit2:retrofit:2.0.0-beta4'
compile 'com.squareup.retrofit2:converter-gson:2.0.0-beta4'
Login to the app using the credentials you gave yourself during signup. The username and password are simply being stored in the default preferences for the application. This is obviously an unsafe way of storing a password but for our purposes it will do. Feel free to change this to work however you like.

## JSON

You will be using GSON model JSON objects in java. Read through this GSON example and look at the Consuming JSON objects section. They show you how to set up a Model class for JSON objects as well as how to convert JSON to a Model.

1. Add GSON to your dependencies if you haven't yet.
2. Now build a model object to represent the JSON data in R.raw.multi_json. This is the kind of response you will get from GET http://mean407.herokuapp.com/api/games
3. Implement the custom_list_item.xml resource file to display the information associated with the model you created. A simple way of doing this is using 3 textviews for name, genre and platform. NOTE: set the focusable attribute of the button you use to “false”, this allows you to click on the list item AND the button in the list item.
4. Implement the CustomAdapter class to work for the model and list item you created. Look at the TODOs and the existing code. It should be fairly self explanatory, but don't be afraid to ask for help.
5. MAKE SURE YOUR CUSTOM ADAPTER WORKS BEFORE CONTINUING

## HTTP

Now it is time to make some http requests using the Retrofit 2.0 api. There library abstracts away much of the nitty-gritty work with http clients and provides an easier way of making http requests.

1. Carefully look over these links from the Retrofit website, they have an excellent developer page with examples on how to set up the ServiceGenerator and ServiceClient interface. We will be dealing with Sectoin 1,2,and 5 mostly.
2. You have been given a partially implemented ServiceGenerator Class, you may delete that and start from scratch or implement the TODOs.
3. Set up the GameClient interface to make a GET request to /api/games
4. Now comes the fun part. Read about Syncronous and Asyncronous Requests and implement asyncronous call in the getGamesRetro() method in MainActivity to retrieve the game json file.
5. Use GSON to deserialize this json file to populate your listview.
6. Holy Cow! It Works!!! Now implement the delete request in the CustomAdapter
Additional Tasks

Now you should have a fairly decent introduction to HTTP, JSON and common 3rd Party Libraries, but to become a Master Programmer you can do these additional excercises:

Implement a safer way to handle username and password needs
Implement a way to make new POSTS
Implement the onClick of the list items to display additional information about the game
android-labs-s16/android_tutorial_4.txt · Last modified: 2016/02/26 13:42 by james
Page Tools
Show pagesource
Old revisions
Backlinks
Back to top
Except where otherwise noted, content on this wiki is licensed under the following license: CC Attribution-Noncommercial-Share Alike 3.0 Unported
CC Attribution-Noncommercial-Share Alike 3.0 Unported  Donate  Powered by PHP  Valid HTML5  Valid CSS  Driven by DokuWiki
