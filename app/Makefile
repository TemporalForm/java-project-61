.DEFAULT_GOAL := clean-install-run-dist

setup: #install the Gradle wrapper 8.6
	./gradlew wrapper --gradle-version 8.6

clean: #remove all build artifacts and temporary files from the project
	./gradlew clean

build: #trigger the build process
	./gradlew clean build

install: #clean the project and then installs the built project
	./gradlew clean install

run-dist: #run jar file
	./build/install/app/bin/app

run: #execute the project directly from Gradle, without prior packaging
	./gradlew run

check-deps: #check for available updates to the project's dependencies
	./gradlew dependencyUpdates -Drevision=release

clean-install-run-dist: clean install run-dist

.PHONY: build
