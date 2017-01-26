SimScript
=========

SimScript is a set of cohesive DSLs for application development.

License == MIT, so provided "as-is" without warranty whatsoever.


## Installation/setup

SimScript relies on Xtext (version 2.10+) and Eclipse (version Neon.2+) which you can download [here](http://www.eclipse.org/Xtext/download.html).

Steps to perform:

1. Install Eclipse-with-Xtext.

2. Clone this repository locally (i.e., to your disk).

3. Import all projects into Eclipse, except (currently) for `nl.dslmeinte.simscript.tests` and `SimScript-examples`.

4. Run (in any way you see fit) `dev-support/scripts/all-touchXtend`, and refresh (F5) all open projects in the workspace.

5. Generate the language infrastructure for all DSLs in the following order:

	1. `structure`
	2. `backend`
	3. `simpleDb`
	4. `mappings`
	5. `ui`
	6. `application`

	(Some DSLs are dependent on another one of the DSLs.)

	Per DSL, this requires you to:

	1. Look up the corresponding `.xtext` file in the Eclipse project with a name that ends in the DSL name without `.ui` (except for `nl.dslmeinte.simscript.ui` of course...).
	2. Right-click on that file, choose the "Run As" option and then "Generate Xtext Artifacts".
		Click "Proceed" if prompted with a "Errors exist..."-dialog.
	3. When prompted on the Console with a question about downloading the ANTLR 3.2.0 runtime: (click-)focus on the Console, type '`y`' and Enter.

	You can safely ignore all errors and warnings, as the DSLs generate just fine.

	Alternatively, for step 1 and 2: "Generate Language Infrastructure" items might already be pre-populated in the Run-dropdown from the Eclipse toolbar.

6. Run the `run on Linux-Windows` or the `run on Mac` launch target located in `nl.dslmeinte.simscript.structure/.launch`, depending on your OS.
	(This is mainly for the benefit of having small fonts under Mac OS X.)
	If this is not pre-populated in the Run-dropdown, you'll have to use the Navigator View.


## An example application

After running SimScript (in the 2nd Eclipse instance; step 6 of the previous section), do the following:

1. Import the `SimScript-example` project into the workspace.

2. Verify that the following simlinks are present:

	`SimScript-example/sim-lib/` &rarr; (`../`)`SimScript-lib/sim-lib`
	`SimScript-example/src-gen/structureMapper.js` &rarr; `SimScript-example/src/gen/javascript/structureMapper.js`

	(These could make it through Git, but I'm not entirely sure and can't be bothered to check it right now.)

3. Rebuild the entire project to generate everything needed.

	*Note*: unfortunately, the generator is not set up to build the entire project automatically when only a subset has been changed, causing only the artifacts for that subset to be emitted/generated.
	This means you have to rebuild the entire project for every change (other than to the `.sim_app` file).

4. Point a browser to `SimScript-example/src-gen/ExampleApp_app.html`.

	You can also point directly to `SimScript-example/sr-gen/perModuleTest/Questionnaire.html` for the (slightly) more interesting stuff.
	Note that screen isn't entirely working `:(` &hellip;

