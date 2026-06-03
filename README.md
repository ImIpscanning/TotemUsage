<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:111827,50:374151,100:E5E7EB&height=210&section=header&text=TotemUsage&fontSize=64&fontColor=FFFFFF&animation=fadeIn&fontAlignY=38&desc=Lightweight%20Paper%20plugin%20for%20totem%20kill%20effects&descAlignY=58&descSize=16" alt="TotemUsage Header" />

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&size=20&duration=2600&pause=900&color=E5E7EB&center=true&vCenter=true&width=720&height=40&lines=Totem+effect+on+player+kills.;Built+with+Java+and+Paper+API.;Simple.+Clean.+Lightweight." alt="Typing Animation" />

<p>
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17" />
  <img src="https://img.shields.io/badge/Paper-1.20.4-374151?style=for-the-badge" alt="Paper API" />
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven" />
  <img src="https://img.shields.io/badge/Minecraft-Plugin-62B47A?style=for-the-badge" alt="Minecraft Plugin" />
</p>

</div>

---

## Overview

**TotemUsage** is a lightweight Minecraft Paper plugin that plays a **Totem of Undying effect** when a player kills another player.

The goal of the plugin is simple: add a clean visual and sound effect to player kills without adding unnecessary complexity.

---

## Features

- Plays the Totem of Undying animation on kill
- Plays the totem use sound for the killer
- Event-based and lightweight
- Built with Java 17
- Designed for Paper servers
- Simple Maven project structure

---

## How It Works

```txt
Player kills another player
        ↓
The plugin detects the kill
        ↓
The killer receives the totem animation
        ↓
The killer hears the totem sound
```

---

## Requirements

| Requirement | Version |
|---|---|
| Java | 17+ |
| Server | Paper / Paper-based |
| Minecraft API | 1.20.x |
| Build Tool | Maven |

---

## Installation

1. Download the plugin `.jar`.
2. Place it inside your server's `plugins` folder.
3. Restart your server.
4. The plugin will load automatically.

```txt
server/
└── plugins/
    └── TotemKill.jar
```

---

## Build From Source

Clone the repository:

```bash
git clone https://github.com/ImIpscanning/TotemUsage.git
cd TotemUsage
```

Build the plugin:

```bash
mvn clean package
```

The compiled `.jar` will be generated inside:

```txt
target/
```

---

## Plugin Information

```yaml
name: TotemKill
version: 1.0
main: me.ImIpscanning.totemkill.TotemKill
api-version: 1.20
author: ImIpscanning
```

---

## Configuration

The plugin includes a basic configuration structure:

```yaml
totem-animation: true

sound:
  enabled: true
  type: ITEM_TOTEM_USE
  volume: 1.0
  pitch: 1.0

message:
  enabled: true
  text: "&aHas matado a &e%player%"
```

---

## Project Structure

```txt
TotemUsage/
├── src/
│   └── main/
│       ├── java/
│       │   └── me/
│       │       └── ImIpscanning/
│       │           └── totemkill/
│       │               └── TotemKill.java
│       └── resources/
│           ├── plugin.yml
│           └── config.yml
├── pom.xml
└── README.md
```

---

## Technologies

<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="46" height="46" alt="Java" />
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/maven/maven-original.svg" width="46" height="46" alt="Maven" />
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-original.svg" width="46" height="46" alt="Git" />
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/github/github-original.svg" width="46" height="46" alt="GitHub" />
</p>

---

## Code Preview

```java
@EventHandler
public void onKill(PlayerDeathEvent event) {
    Player deadPlayer = event.getEntity();
    Player killer = deadPlayer.getKiller();

    if (killer == null) return;

    killer.playEffect(EntityEffect.TOTEM_RESURRECT);
    killer.playSound(killer.getLocation(), Sound.ITEM_TOTEM_USE, 1f, 1f);
}
```

---

## Status

```diff
+ Lightweight plugin
+ Clean kill listener
+ Totem animation effect
+ Totem sound effect
+ Maven-based project
```

---

## Author

Developed by **ImIpscanning**.

```txt
Simple plugin.
Clean effect.
Better kill feedback.
```

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&size=18&duration=2600&pause=1000&color=E5E7EB&center=true&vCenter=true&width=650&height=40&lines=Thanks+for+checking+out+TotemUsage.;Built+for+Paper+servers.;Simple.+Clean.+Lightweight." alt="Footer Typing" />

<strong>TotemUsage</strong> — Java Minecraft Plugin

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:E5E7EB,50:374151,100:111827&height=110&section=footer" alt="Footer" />

</div>
