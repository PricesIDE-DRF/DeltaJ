# DeltaJ / DeltaJava: an Eclipse-based delta-oriented programming language, designed to create Software Product Lines within the Java environment.
*What is difference between DeltaJ and DeltaJava?*
- "DeltaJava" and "DeltaJ" are the same. DeltaJ uses a novel domain specific language (DSL) to specify the product line declarations, whereas DeltaJava is build upon DeltaEcore. It translates its delta modules to DeltaEcore delta modules of a special dialect and uses tools provided by DeltaEcore to specify product line feature models, constraints, as well as it's feature-to-delta mappings.
## Table of Contents
- [Installation](#installation)
- [Examples](#examples)
- [Summary of *DeltaJ 1.5: delta-oriented programming for Java 1.5*](#summary)

## Installation
<a name="installation"></a>
To install new software to your Eclipse runtime, select "_Help_" and search for the "_Install new Software..._" entry. Copy the respective URL, add it as location and install the components you wish.

Use this update site to install DeltaJava to your Eclipse runtime, including all required plug-ins (DeltaEcore, JaMoPP and the EMFText common libraries).
```
https://deltajava.org/update/
```

**LEGACY WARNING**: If you run into problems with DeltaJava (e.g., references to Java classifiers are not resolved), please make sure to use an older Java version within your Eclipse runtime. We recommend to use Java 1.8 (JDK 8).
1. Install JDK 8 to your system.
2. Select "Window" -> "Preferences" -> "Java" -> "Installed JREs"
3. Click "Add...", select "Standard VM", and click "Next >"
4. Select the JDK 8 directory as the "JRE Home".
5. Select the newly-added JRE and click "Apply".
6. Go to "Java" -> "Compiler"
7. Set "Compiler compliance level" to 1.8.
8. Click "Apply and close".
When creating new projects for generated variants, make sure to select Java 1.8 as it's Execution environment JRE.
## Examples
<a name="examples"></a>
### The "PaymentGateway" toy example
*note: this is a rewritten section of DeltaJava official page's [The "DeltaTalk" toy example](https://deltajava.org/#getting_started_toy_example)*

We provide an easy to grasp toy example to get started with DeltaJava; the very simple "PaymentGateway" CLI program. The project consists of a small collection of delta modules along with an even smaller base of core Java assets. To get an overview of the entire DeltaJava syntax and the possibilites it offers, please refer to the [syntax section](https://deltajava.org/#syntax).

1. On your Eclipse IDE, add the PaymentGateway project by selecting "File" -> "Open Projects from File System..."
2. In DeltaJava, all delta modules are contained inside a designated delta folder. For the "`com.priceside_drf.deltaj.paymentgateway`" project, this folder is simply named "_deltas/_". When applied, its contained delta modules add, modify and/or remove functionality of the project's source folder's core assets. In our particular PaymentGateway example, the core assets' source files implement a fairly simple CLI program. You can go ahead and start the project as Java application.
3. The PaymentGateway example works with DeltaEcore to organize its problem space artefacts which - for this project - are a feature model and delta mapping.
4. To generate variants from the PaymentGateway SPL, open its feature model ("_PaymentGateway.defeaturemodel_") with the "_Feature Model Configurator (DeltaEcore)_" editor: (Right click -> "Open With " -> "Feature Model Configurator (DeltaEcore)").
5. Using this editor, you can select (one or more) feature(s) generate variants accordingly by pressing the "_Generate Variant_" button.
6. A pop-up window will open and ask you to select a generator along with a directory to generate the variant in. Generally, we recommend you to generate variants into a designated eclipse project (e.g. "`com.priceside_drf.deltaj.paymentgateway.marketplace`").
7. Select the designated project's `/src` directory.
8. Pressing the OK button will trigger DeltaEcore's variant generation for your selected feature; respective delta modules will be applied. You can test your generated variant by starting the variant project as Java application.[](https://deltajava.org/#installation_update_site)

Feel free to change delta modules and play around with PaymentGateway to get a taste of how the variant generation works. For more information about DeltaEcore, visit [deltaecore.org](http://deltaecore.org/).

## Summary of *DeltaJ 1.5: delta-oriented programming for Java 1.5*
<a name="summary"></a>
