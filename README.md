# jpa-sQLshell-tests

<!---
[![start with why](https://img.shields.io/badge/start%20with-why%3F-brightgreen.svg?style=flat)](http://www.ted.com/talks/simon_sinek_how_great_leaders_inspire_action)
--->
[![GitHub release](https://img.shields.io/github/release/elbosso/jpa-sQLshell-tests/all.svg?maxAge=1)](https://GitHub.com/elbosso/jpa-sQLshell-tests/releases/)
[![GitHub tag](https://img.shields.io/github/tag/elbosso/jpa-sQLshell-tests.svg)](https://GitHub.com/elbosso/jpa-sQLshell-tests/tags/)
[![GitHub license](https://img.shields.io/github/license/elbosso/jpa-sQLshell-tests.svg)](https://github.com/elbosso/jpa-sQLshell-tests/blob/master/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/elbosso/jpa-sQLshell-tests.svg)](https://GitHub.com/elbosso/jpa-sQLshell-tests/issues/)
[![GitHub issues-closed](https://img.shields.io/github/issues-closed/elbosso/jpa-sQLshell-tests.svg)](https://GitHub.com/elbosso/jpa-sQLshell-tests/issues?q=is%3Aissue+is%3Aclosed)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/elbosso/jpa-sQLshell-tests/issues)
[![GitHub contributors](https://img.shields.io/github/contributors/elbosso/jpa-sQLshell-tests.svg)](https://GitHub.com/elbosso/jpa-sQLshell-tests/graphs/contributors/)
[![Github All Releases](https://img.shields.io/github/downloads/elbosso/jpa-sQLshell-tests/total.svg)](https://github.com/elbosso/jpa-sQLshell-tests)
[![Website elbosso.github.io](https://img.shields.io/website-up-down-green-red/https/elbosso.github.io.svg)](https://elbosso.github.io/)


I got the idea from a different repo https://github.com/josueribeiro/sqlite-jpa but it was horribly outdated (hibernate 3.5)
and did just not work so i set up my own. 

Why did i set up that project? Well, I wanted to test several tools that claimed to be able to build (JPA) Entity classes
from an existimg datamodel (meaning from actual tables in a database). But it turned out - none of them could (out
of the box) and I was not patient enough to comb through arcane configuration files.

Remembering that i had the [sQLshell](https://elbosso.github.io/sQLshell) having numerous plugins already to document existing models starting from a table and then following 
all foreign key relationships, I thought it schould be possible to actually generate java source code instead of
HTML.

The most important things for me were:

* gather all tables connected by foreign key relationships and generate Entities for them
* generate the relationships (One2Many and Many2One) according to the foreign keys
* extract index information if available but leave it commented out
* detect Many2Many mappings and generate annotations for them so that they are usable later on

This project already contains some tests for some of the models I tested the plugin with. Over time, more and more tests 
will be added here.

So i sat down and tried my hand at it - with the results everyone can see in this project. 
The generated Entities are below package
`de.elbosso.generated.sqlshell` - bikestores contains the result I got from a MS SQL example database:

![Alt text](./bikestores/src/main/java/de/elbosso/generated/sqlshell/bikestores/model.svg)
 
chinook 
contains the results i got from the example database for sqlite. 

![Alt text](./chinook/src/main/java/de/elbosso/generated/sqlshell/chinook/model.svg)

package entities holds the results from an example 
in a HSQL database.

![Alt text](./entities/src/main/java/de/elbosso/generated/sqlshell/model.svg)

package inheritance contains a datamodel meant for testing inheritance strategies in JPA

![Alt text](./inheritance/src/main/java/de/elbosso/generated/sqlshell/model.svg)

