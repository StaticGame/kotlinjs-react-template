This repository is intended to contain all the base build setup to immediately start tweaking kotlin-js project using react

Gradle build uses [kotlin-frontend-plugin](https://github.com/Kotlin/kotlin-frontend-plugin) in order to compile kotlin
(including wrappers) to js, run DCE and run webpack in order to link wrappers in resulting files to external libraries.

In order to run webpack-dev-server in continuos mode, run `gradlew webpack-run`. This task starts webpack-dev-server with hot
reload in detached process. In order to hot-reload kotlin sources also run `gradlew runDceKotlinJs -t` or `gradlew runDceKotlinJs --continous`
for continous build of kotlin files.

Run `gradlew webpack-bundle` to build final bundle.
