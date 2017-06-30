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
    JPubg jPubg = JPubgFactory.getWrapper(YOUR_API_KEY);
    jPubg.getByNickname("TheHusar"); //Returns "TheHusar" player matches in string JSON format
    jPubg.getBySteamID("1234567890"); //Returns player with SteamID 1234567890 matches in string JSON format
```

## Compiling on your own

As this is completely Open Source project, you may clone the code from the Github and compile the library on your own. 
1. Be sure that you have Maven (at least version 3.3.9) installed.
2. Go to the directory where you have cloned the repository.
3. Perform ***mvn clean package*** command and wait a minute.

## Documentation

Complete documentation is available on https://lukasgorny.pro/jpubg/.

## TO-DO

- Add JSON parser and return objects instead of String data
- Add Java-docs
- Clean-up some code mess
- Add library to central Maven repository
