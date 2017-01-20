Feature: Share My Ride
story of my ride
Scenario: Valid Post with success message
Given employee "Naveen" enter details like "Office" as srouce, "Home" as destination and the time is "5:30pm"
And his email is "naveenemail@gmail.com" and phone is "5555443433" 
When click on "Share"
Then data get saved and message "Posting was successful" get displayed with "OK" button
And clicking on "OK" will take him to "Home" page
