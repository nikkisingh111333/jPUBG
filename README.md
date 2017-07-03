# jPUBG

## Overview

Simple API wrapper written in Java 8 for retriving statistics from http://pubgtracker.com API. 
You need valid pubgtracker.com API KEY in order to use my API wrapper. You can get one here: https://pubgtracker.com/site-api.

First version of the wrapper supports fetching data by SteamID or in-game nickname. 
Because pubgtracker.com currently does not support fetching data by mode or region, I'll add JSON parser in next version
of the wrapper and it will filter data by specified mode and region.

## Usage

To get the library file compiled with Java 1.8.0_131 please go to [releases](https://github.com/Lukaszpg/jPUBG/releases) and download latest available version. Add it to your project classpath, then get the jPUBG API wrapper object from the factory with your api key and start fetching data! 

```java
    JPubg jPubg = JPubgFactory.getWrapper(YOUR_API_KEY); // Always remember to specify your API Key!
    String data = jPubg.getByNickname("TheHusar"); // Returns player "TheHusar" data in String JSON Format. Use it if you want to parse the data by yourself
    Player player = jPubg.getByNickname("TheHusar", PUBGMode.solo); // Returns player "TheHusar" object with matches filtered to played only in solo game mode
    Player player2 = jPubg.getByNickname("TheHusar", PUBGRegion.eu); // Returns player "TheHusar" object with matches filtered to only played in the EU region
    Player player3 = jPubg.getByNickname("TheHusar", PUBGMode.duo, PUBGRegion.eu); // Returns player "TheHusar" object with matches filtered to played only in duo game mode and in eu region
```

## Compiling on your own

As this is completely Open Source project, you may clone the code from the Github and compile the library on your own. 
1. Be sure that you have Maven (at least version 3.3.9) installed.
2. Go to the directory where you have cloned the repository.
3. Perform ***mvn clean package*** command and wait a minute.
4. Compiled .jar file will appear in the ***/target*** folder. The one you should use is named ***jPUBG-X.X.X-SNAPSHOT-jar-with-dependencies.jar***, where X.X.X is of course version of the application.

## Documentation

Complete documentation is available on https://lukasgorny.pro/jpubg/.

## TO-DO

- ~~Add JSON parser and return objects instead of String data~~
- ~~Add Java-docs~~
- ~~Clean-up some code mess~~
- Add library to central Maven repository
