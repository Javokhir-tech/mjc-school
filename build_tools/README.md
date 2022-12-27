## Build-tools

### utils
The module for assembling utils jar with dependency of apache-commons-lang, 
the manifest file contains the module name and version

### core 
this module is a submodule of project "multi-project", contains Utils class
which uses utils.jar

### api
this module is another submodule of project "multi-project",
contains App class which calls method core submodule's class