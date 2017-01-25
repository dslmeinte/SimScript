SimScript
=========

SimScript is a set of cohesive DSLs for application development.

License == MIT, so provided "as-is" without warranty whatsoever.


## Installation/setup

SimScript relies on Xtext (version 2.10+) and Eclipse (version Neon.2+) which you can download [here](http://www.eclipse.org/Xtext/download.html).

Steps to perform:

1. Install Eclipse-with-Xtext.

2. Clone this repository locally (i.e., to your disk).

3. Generate the language infrastructure for all DSLs in the following order:

	* `structure`
	* `backend`
	* `simpleDb`
	* `mappings`
	* `ui`
	* `application`

	(Most DSLs are dependent on another one of the DSLs.)

	Per DSL, this requires you to:

	1. Look up the corresponding `.xtext` file in the Eclipse project with a name that ends in the DSL name without `.ui` (except for `nl.dslmeinte.simscript.ui` of course...).
	2. Right-click on that file and choose the "Generate Language Infrastructure" option.
	3. When prompted on the Console with a question about downloading the ANTLR 3.2.0 runtime: (click-)focus on the Console, type '`y`' and Enter.

	You can safely ignore all errors and warnings, as the DSLs generate just fine.

