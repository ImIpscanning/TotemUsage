<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0F172A,50:374151,100:E5E7EB&height=220&section=header&text=TotemUsage&fontSize=68&fontColor=FFFFFF&animation=fadeIn&fontAlignY=38&desc=Lightweight%20Paper%20plugin%20for%20totem%20kill%20effects&descAlignY=58&descSize=17" />

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&size=21&duration=2600&pause=900&color=E5E7EB&center=true&vCenter=true&width=760&lines=Clean+Minecraft+plugin.;Totem+effect+on+player+kills.;Built+with+Java+and+Paper+API.;Simple.+Lightweight.+Effective." />

<br>

<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/Paper_API-1.20.x-111827?style=for-the-badge" />
<img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
<img src="https://img.shields.io/badge/Minecraft-Plugin-62B47A?style=for-the-badge" />

</div>

---

## Overview

**TotemUsage** is a lightweight Minecraft Paper plugin that plays a **Totem of Undying effect** when a player kills another player.

It is designed to be simple, clean and easy to use, adding a visual and audio reward effect without adding unnecessary complexity.

---

## Features

- Totem resurrection animation on player kill
- Totem sound effect for the killer
- Lightweight event-based logic
- Built with Java 17
- Designed for Paper servers
- Simple Maven project structure

---

## How It Works

When a player kills another player, the plugin detects the kill event and applies the totem effect to the killer.

```txt
Player kills another player
        ↓
Plugin detects the kill
        ↓
Totem animation is played
        ↓
Totem sound is played
```

---

## Requirements

| Requirement | Version |
|---|---|
| Java | 17+ |
| Server | Paper / Paper-based server |
| Minecraft API | 1.20.x |
| Build Tool | Maven |

---

## Installation

1. Download the compiled `.jar` file from the releases section.
2. Place the `.jar` inside your server's `plugins` folder.
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

Build with Maven:

```bash
mvn clean package
```

The compiled plugin will be generated inside:

```txt
target/
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

## Plugin Information

```yaml
name: TotemKill
version: 1.0
main: me.ImIpscanning.totemkill.TotemKill
api-version: 1.20
```

---

## Configuration

The repository includes a basic `config.yml` structure for future customization:

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

## Technologies Used

<div align="center">

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="48" height="48" alt="Java" />
&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/maven/maven-original.svg" width="48" height="48" alt="Maven" />
&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-original.svg" width="48" height="48" alt="Git" />
&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/github/github-original.svg" width="48" height="48" alt="GitHub" />

</div>

---

## Code Example

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
+ Clean event listener
+ Totem visual effect
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

---

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&size=18&duration=2600&pause=900&color=E5E7EB&center=true&vCenter=true&width=650&lines=Thanks+for+checking+out+TotemUsage.;Built+for+Paper+servers.;Simple.+Clean.+Lightweight." />

<br><br>

<strong>TotemUsage</strong> — Java Minecraft Plugin

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:E5E7EB,50:374151,100:0F172A&height=120&section=footer" />

</div>
