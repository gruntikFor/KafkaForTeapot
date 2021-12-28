@echo off

set CLASSPATH="D:\MyProjects\kafka-for-teapot\target\classes\";

for %%i in (C:\kafka\libs\*) do (
	call :concat "%%i"        
)

set COMMAND=java -classpath %CLASSPATH% %*
%COMMAND%

:concat
IF not defined CLASSPATH (
  set CLASSPATH="%~1"
) ELSE (
  set CLASSPATH=%CLASSPATH%;"%~1"
)