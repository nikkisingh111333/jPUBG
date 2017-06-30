# jPUBG

## Overview

Simple API wrapper written in Java 8 for retriving statistics from http://pubgtracker.com API. 
You need valid pubgtracker.com API KEY in order to use my API wrapper. You can get one here: https://pubgtracker.com/site-api.

First version of the wrapper supports fetching data by SteamID or in-game nickname. 
Because pubgtracker.com currently does not support fetching data by mode or region, I'll add JSON parser in next version
of the wrapper and it will filter data by specified mode and region.

## Usage

Get the library file compiled with Java 1.8.0_131 from the directory ***/target/*** (currently **jPUBG-1.0.1.4-SNAPSHOT.jar**) and add it to your project classpath, then get the jPUBG API wrapper object from the factory with your api key and start fetching data! 

```java
    JPubg jPubg = JPubgFactory.getWrapper(YOUR_API_KEY);
    jPubg.getByNickname("TheHusar"); //Returns "TheHusar" player stats in string JSON format
    jPubg.getBySteamID("1234567890"); //Returns player with SteamID 1234567890 stats in string JSON format
```

## Compiling on your own

As this is completely Open Source project, you may clone the code from the Github and compile the library on your own. To do this, proceed with steps: 






## TO-DO

- Add JSON parser and return objects instead of String data
- Add Java-docs
- Clean-up some code mess
- Add library to central Maven repository
