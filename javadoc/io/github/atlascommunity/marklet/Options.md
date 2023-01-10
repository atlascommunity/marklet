Class Options
=============
Class that reads and stores provided options for javadoc execution. Options that we care about
 are :

 


  
* `-d` specifies the output directory (default: `javadocs`) 
  
* `-e` specifies the file ending for files to be created (default `md`)
  
* `-l` specifies the file ending used in internal links
 (default `md`)
 


 

 The default options are ideal if you want to serve the documentation using GitHub's
 built-in README rendering. If you are using a tool like Slate, change the options as follows: ```
 $ javadoc -doclet fr.faylixe.marklet.Marklet -e html.md -l html … ```

io.github.atlascommunity.marklet.Options Summary
-------
#### Constructors
| Visibility | Signature |
| ---------- | --------- |
| public     | Options() |
#### Fields
| Modifiers                | Field name                                                                                                                                                                                   | Type                                                       |
| ------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------- |
| **public static final**  | [public static final java.lang.String SOURCE_DIRECTORY_OPTION](#javalangstring-source_directory_option)                                                                                      | String                                                     |
| **public static final**  | [public static final java.lang.String OUTPUT_DIRECTORY_OPTION](#javalangstring-output_directory_option)                                                                                      | String                                                     |
| **public static final**  | [public static final java.lang.String FILE_ENDING_OPTION](#javalangstring-file_ending_option)                                                                                                | String                                                     |
| **public static final**  | [public static final java.lang.String CREATE_BADGE_OPTION](#javalangstring-create_badge_option)                                                                                              | String                                                     |
| **private static final** | [private static final java.lang.String DEFAULT_OUTPUT_DIRECTORY](#javalangstring-default_output_directory)                                                                                   | String                                                     |
| **private static final** | [private static final java.lang.String DEFAULT_SOURCE_DIRECTORY](#javalangstring-default_source_directory)                                                                                   | String                                                     |
| **private static final** | [private static final java.lang.String DEFAULT_FILE_ENDING](#javalangstring-default_file_ending)                                                                                             | String                                                     |
| **private static final** | [private static final java.util.Map<java.lang.String,io.github.atlascommunity.marklet.MarkletOption> OPTIONS](#javautilmapjavalangstring-iogithubatlascommunitymarkletmarkletoption-options) | Map<String,io.github.atlascommunity.marklet.MarkletOption> |
#### Methods
| Modifiers         | Method signature                              | Return type                                    |
| ----------------- | --------------------------------------------- | ---------------------------------------------- |
| **public**        | [getOutputDirectory()](#getoutputdirectory)   | String                                         |
| **public**        | [getFileEnding()](#getfileending)             | String                                         |
| **public**        | [getHasBadge()](#gethasbadge)                 | String                                         |
| **public static** | [getOption(String key)](#getoptionstring-key) | io.github.atlascommunity.marklet.MarkletOption |
| **public static** | [getSupportedOptions()](#getsupportedoptions) | Set<jdk.javadoc.doclet.Doclet.Option>          |

Constructors
============
Options()
---------
Default constructor. Sets options with their default parameters if available.


Fields
======
String SOURCE_DIRECTORY_OPTION
----------------------------------------
Option name for the source directory. (`-i`) *


String OUTPUT_DIRECTORY_OPTION
----------------------------------------
Option name for the target output directory. (`-d`) *


String FILE_ENDING_OPTION
-----------------------------------
Option name for the file ending (`-e`) *


String CREATE_BADGE_OPTION
------------------------------------
MarkletOption name for create badge flag (`-b`) *


String DEFAULT_OUTPUT_DIRECTORY
-----------------------------------------
Default output directory to use. *


String DEFAULT_SOURCE_DIRECTORY
-----------------------------------------
Default source directory to use. *


String DEFAULT_FILE_ENDING
------------------------------------
Default output file ending (`md`) *


Map<String,io.github.atlascommunity.marklet.MarkletOption> OPTIONS
--------------------------------------------------------------------------------------
*No description provided*


Methods
=======
getOutputDirectory()
--------------------
Output directory file are generated in. *


getFileEnding()
---------------
Extension to use for generated file. *


getHasBadge()
-------------
Add "generated by" badge to generated doc or not. *


getOption(String key)
---------------------
*No method description provided*


getSupportedOptions()
---------------------
*No method description provided*


