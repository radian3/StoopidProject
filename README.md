# StoopidProject

JIRA
Our JIRA can be found here: https://georgelosttoabot.atlassian.net/browse/
We use JIRA to keep track of which task each person is working on. This way, we can easily see who is working on which task at any time. Before you start a task, you need to log a JIRA. In this JIRA, you will explain what your task is.

GitHub
Our project can be found at https://github.com/radian3/StoopidProject

# Software Development Process
1) Iteration planning. Plan out multiple coding tasks to be done within the iteration (3 weeks).
2) Decidewh on o will do each task.
3) Log JIRAS for each task and assign the JIRAS to whoever is going to do the JIRA.
4) Place the JIRA you are going to work on as 'In Progress.'
5) Create a GitHub branch by branching off of master. Name this branch after your JIRA name.
   ```
   git checkout master # check out the master branch
   git pull # pull down the latest code on master
   git branch JIRA-NAME # create a branch off of master with thge name JIRA-NAME
   git checkout JIRA-NAME # check out your jira branch so you can begin working
   ```
6) When you are ready for your code to be reviewed, make sure your branch is up to date with master.
   ```
   git checkout master
   git pull
   git checkout JIRA-NAME
   git pull
   git merge master
   ```
   now resolve the merge conflicts
   ```
   git add .
   git commit -m "resolved merge conflicts"
   git push
   ```
7) Go to GitHub and post a pull request from your branch to master.
   -link your JIRA in the pull request
   -put your JIRA in review
8) Teammates will test the code on the pull request and comment on any fixes that need to be made.
9) After all teammates approve of the pull request, you can press the green button to merge your code to master.
10) Delete your branch and close your JIRA.
11) Start working on your next task.

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