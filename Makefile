.PHONY: help compile run test

help:
	@cat $(firstword $(MAKEFILE_LIST))

compile:
	sbt compile

run:
	sbt run

test:
	sbt test
