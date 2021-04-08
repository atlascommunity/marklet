Class PackagePage
=================
Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| **public** | PackagePage() |
#### Fields
| Type and modifiers | Field name       |
| ------------------ | ---------------- |
| **private final**  | packageDoc       |
| **private final**  | packageDirectory |
| **private final**  | options          |
#### Methods
| Type and modifiers | Method signature                                 |
| ------------------ | ------------------------------------------------ |
| **public**         | build()                                          |
| **private**        | createPackageIndexes(StringBuilder)              |
| **private**        | generateTable(String, ClassDoc[], StringBuilder) |
| **private**        | writeFile(StringBuilder)                         |

Constructors
============
PackagePage ()
--------------


Fields
======
packageDoc, com.sun.javadoc.PackageDoc
--------------------------------------
Package information

packageDirectory, java.nio.file.Path
------------------------------------
Package path

options, io.github.atlascommunity.marklet.Options
-------------------------------------------------
Doclet options


Methods
=======
build ()
--------
Build document and write it to the selected folder
### Throws
java.io.IOException: something went wrong during write operation

createPackageIndexes (StringBuilder)
------------------------------------
Generate index tables for package annotations, enums, interfaces and classes
### Parameters
packagePage: string representation of package page content


generateTable (String, ClassDoc[], StringBuilder)
-------------------------------------------------
Generate index table
### Parameters
tableLabel: table name
docs: elements to work with
packagePage: string representation of package page content


writeFile (StringBuilder)
-------------------------
Write file to the selected folder
### Parameters
pageContent: file content

### Throws
java.io.IOException: something went wrong during write operation


