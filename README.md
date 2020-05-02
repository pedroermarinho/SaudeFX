<h1 align="center">
<img src="saudefx.png" height="200" width="200"><br/>
Welcome to SaudeFX 👋
<a href="https://snapcraft.io/saudefx"> <br/> <img src="https://github.com/snapcore/snap-store-badges/raw/master/PT/%5BPT%5D-snap-store-black-uneditable%401x.png"></a>
</h1>
<p>
<img alt="Version" src="https://img.shields.io/badge/version-0.2.0-blue.svg?cacheSeconds=2592000" />
<a href="https://github.com/pedroermarinho/SaudeFX#readme" target="_blank"><img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" /></a>
<a href="https://github.com/pedroermarinho/SaudeFX/graphs/commit-activity" target="_blank"><img alt="Maintenance" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" /></a>
<a href="https://github.com/pedroermarinho/SaudeFX/blob/master/LICENSE" target="_blank"><img alt="License:MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" /></a>
<a href="https://twitter.com/pedroermarinho" target="_blank"><img alt="Twitter: pedroermarinho" src="https://img.shields.io/twitter/follow/pedroermarinho.svg?style=social" /></a>
</p>

> Projeto feito em Java / JavaFX, utilizando alguns indicadores de saúde
### 🏠 [Homepage](https://github.com/pedroermarinho/SaudeFX#readme)
### ✨ [Demo](https://github.com/pedroermarinho/SaudeFX#readme)
## Install
```sh
sudo snap install saudefx

```

## Usage
```sh
saudefx

```

## Run tests
```sh
mvn install
java --module-path=snap/local/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml,com.jfoenix --add-exports javfx.controls/com.sun.javafx.scene.control=com.jfoenix --add-exports javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix  -cp shade/SaudeFX.jar br.com.saudefx.App

```

## Author
👤 **Pedro Marinho**
* Website: https://pedroermarinho.github.io/
* Twitter: [@pedroermarinho](https://twitter.com/pedroermarinho)
* GitHub: [@pedroermarinho](https://github.com/{github_username})
* LinkedIn: [@pedroermarinho](https://linkedin.com/in/{author_linkedin_username})



## 🤝 Contributing
Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/pedroermarinho/SaudeFX/issues). You can also take a look at the [contributing guide](https://github.com/pedroermarinho/SaudeFX/blob/master/CONTRIBUTING.md)
## Show your support
Give a ⭐️ if this project helped you!

## 📝 License

Copyright © 2020 [Pedro Marinho](https://github.com/pedroermarinho ).<br/>
This project is [MIT](https://github.com/pedroermarinho/SaudeFX/blob/master/LICENSE) licensed.

---
_This README was created with the [markdown-readme-generator](https://github.com/pedroermarinho/markdown-readme-generator)_