# StoopidProject

JIRA
Our JIRA can be found here: https://georgelosttoabot.atlassian.net/browse/
We use JIRA to keep track of which task each person is working on. This way, we can easily see who is working on which task at any time. Before you start a task, you need to log a JIRA. In this JIRA, you will explain what your task is.

GitHub
Our project can be found at https://github.com/radian3/StoopidProject

# Software Development Process
1) Brainstorm a task to work on.
3) Log JIRAS for each task that you came up with and assign the JIRAS to yourself.
3) Place the JIRA you are going to work on next as 'In Progress.'
4) Create a GitHub branch by branching off of master. Name this branch after your JIRA name.
   ```
   git checkout master # check out the master branch
   git pull # pull down the latest code on master
   git branch JIRA-NAME # create a branch off of master with thge name JIRA-NAME
   git checkout JIRA-NAME # check out your jira branch so you can begin working
   ```
5) When you are ready for your code to be reviewed, make sure your branch is up to date with master.
   ```
   git checkout master
   git pull
   git checkout JIRA-NAME
   git pull
   git merge master
   ```
   resolve merge conflicts if there are any. Now run the following commands.
   ```
   git add .
   git commit -m "resolved merge conflicts"
   git push
   ```
6) Go to GitHub and post a pull request from your branch to master.
   -link your JIRA in the pull request
   -put your JIRA in review
7) Teammates will test the code on the pull request and comment on any fixes that need to be made.
8) After all teammates approve of the pull request, you can press the green button to merge your code to master.
9) Delete your branch and close your JIRA.
10) Start working on your next task.

# Project Setup
Download Java 8 at http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Download Maven https://www.mkyong.com/maven/how-to-install-maven-in-windows/

Download Eclipse http://www.eclipse.org/downloads/

Open the command line
'''
git clone https://github.com/radian3/StoopidProject.git
cd StoopidProject
mvn clean install
'''

# How to open in Eclipse
File->Import->Maven->Existing Maven Projects->Locate the directory->Next->Finish