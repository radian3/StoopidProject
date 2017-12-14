# JIRA
Our JIRA can be found here: https://georgelosttoabot.atlassian.net/browse/SP-3
We use JIRA to keep track of which task each person is working on. This way, we can easily see who is working on which task at any time. You can log a task JIRA on the epic to say which task you are working on. Within a task JIRA, you can log subtasks. No coding task should take longer than 8 hours of coding. If you predict a task will take longer than 8 hours of coding, then you should break down the task into multiple subtasks. Your GitHub branch is named after your subtask coding JIRa. If you don't need a subtask JIRA, then you can name your GitHub branch after the task jira.

# Software Development Process
1) Spend 30 minutes - 1 hour brainstorming tasks to work on.
2) Log JIRAS for each task that you came up with and assign the JIRAS to yourself.
3) Place the JIRA you are about to start working on as 'In Progress.'
4) Create your GitHub branch by branching off of master. Name this branch after your JIRA name.
5) Code on your branch until you feel that your coding is complete. Make sure you have tested it and everything works.
6) Pull down the latest code from master into your local master branch. Merge the code from your local master into your development branch if your branch doesn't already have the latest master code. Resolve merge conflicts if there are any.
7) Go to GitHub and post a pull request from your branch to master.
   -link your JIRA on the pull request
   -make sure your JIRA is documented to include what you did in your task  
8) Teammates should look at the files changed section of the pull request and make comments on how to improve the code and fix potential bugs. This is your chance to review the code of your teammates and provide feedback. After this, the teammates should check out the pull request branch and pull down the code and test the application. They should run a mvn clean install and try using the application to make sure it works.
9) After two or more teammates approve of the pull request, you can press the green button to merge the code from your development branch to master.
10) Delete your branch and close your JIRA.
11) Start working on your next task.

# How to create a GitHub Branch
```
git checkout master # check out the master branch
git pull # pull down the latest code on master
git branch JIRA-NAME # create a branch off of master with the name JIRA-NAME
git checkout JIRA-NAME # check out your jira branch so you can begin working
```

# How to merge master into your development branch
```
git checkout master
git pull
git checkout JIRA-NAME
git pull
git merge master
```
If you get a message saying "Already up to date" then your branch already had the latest code in master and you are done.

If the code from master is able to merge into your branch with no merge conflicts, then all you have to do is git push to push the new code that was merged into your branch to remote.

If there are merge conflicts, resolve all merge conflicts and then do the following commands:
```
git add .
git commit -m "merged master into my development branch"
git push
```

# How to resolve merge conflicts

Do a git status to see which files have merge conflicts. Open up the first file which has a merge conflict in your IDE. Git will put markings in areas of the file that have merge conflicts which could be a bunch of equals signs, HEAD, a commit name, or something of the sort. The trick is to make the file look like how you want the file to look when it gets merged into master. You will need to backspace all of the markings that Git added and backspace, modify, or add any code around where Git made the markings since the areas where Git made the markings is where the merge conflict is.

Resolve conflicts for all files.

Build out the project with mvn clean install test out the application. Make sure you didn't break the project when resolving merge conflicts.

After you have tested everything, you can now add all of the files, write a commit message, and push your code.

# Project Setup
Download Java 8 at http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Download Maven https://www.mkyong.com/maven/how-to-install-maven-in-windows/

Download Eclipse http://www.eclipse.org/downloads/

Open the command line
```
git clone https://github.com/radian3/StoopidProject.git
cd StoopidProject
mvn clean install
```

# How to open StoopidProject in Eclipse
File->Import->Maven->Existing Maven Projects->Locate the directory->Next->Finish