# jPUBG

[![Build Status](https://travis-ci.org/Lukaszpg/jPUBG.svg?branch=master)](https://travis-ci.org/Lukaszpg/jPUBG)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/Lukaszpg/jPUBG/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/pro.lukasgorny/jpubg.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22pro.lukasgorny%22)

## Overview

Simple API wrapper written in Java 8 for retriving statistics from http://pubgtracker.com API. 
You need valid pubgtracker.com API KEY in order to use my API wrapper. You can get one here: https://pubgtracker.com/site-api.

## How to get

### 1. Using Maven

It's simple - just add few lines below to your pom.xml and you're good to go! X.X.X is of course preferable version of the library.

```
<dependency>
      <groupId>pro.lukasgorny</groupId>
      <artifactId>jpubg</artifactId>
      <version>X.X.X</version>
</dependency>
```

### 2. As standalone library

To get the library file compiled with Java 1.8.0_131 please go to [releases](https://github.com/Lukaszpg/jPUBG/releases) and download latest available version. Add it to your project classpath, then get the jPUBG API wrapper object from the factory with your api key and start fetching data! 


## Example usage

```java
    JPubg jPubg = JPubgFactory.getWrapper(YOUR_API_KEY); // Always remember to specify your API Key!
    String data = jPubg.getByNickname("TheHusar"); // Returns player "TheHusar" data in String JSON Format. Use it if you want to parse the data by yourself
    Player player = jPubg.getByNickname("TheHusar", PUBGMode.solo); // Returns player "TheHusar" object with matches filtered to played only in solo game mode
    Player player2 = jPubg.getByNickname("TheHusar", PUBGRegion.eu); // Returns player "TheHusar" object with matches filtered to only played in the EU region
    Player player3 = jPubg.getByNickname("TheHusar", PUBGMode.duo, PUBGRegion.eu); // Returns player "TheHusar" object with matches filtered to played only in duo game mode and in eu region
    Stat stat = jPubg.getPlayerMatchStatByStatName(player3, PUBGStat.RATING); // Returns "Rating" stat object of player "TheHusar" from latest season from DUO mode and EU region
```

## Compiling on your own

As this is completely Open Source project, you may clone the code from the Github and compile the library on your own. 
1. Be sure that you have Maven (at least version 3.3.9) installed.
2. Go to the directory where you have cloned the repository.
3. Perform ***mvn clean package*** command and wait a minute.
4. Compiled .jar file will appear in the ***/target*** folder. The one you should use is named ***jPUBG-X.X.X-SNAPSHOT-jar-with-dependencies.jar***, where X.X.X is of course version of the application.

## Documentation

Documentation is available on: http://www.javadoc.io/doc/pro.lukasgorny/jpubg

## TO-DO

- ~~Add JSON parser and return objects instead of String data~~
- ~~Add Java-docs~~
- ~~Clean-up some code mess~~
- ~~Add library to central Maven repository (I have permissions now, going to publish library to Maven in a couple of days)~~
