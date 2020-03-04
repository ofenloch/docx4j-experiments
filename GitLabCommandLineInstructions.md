# Command line instructions

You can also upload existing files from your computer using the instructions below.


## Git global setup

```bash
git config --global user.name "Oliver Ofenloch"
git config --global user.email "oliver.ofenloch@gea.com"
```

## Create a new repository

```bash
git clone https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
cd git-playground
touch README.md
git add README.md
git commit -m "add README"
git push -u origin master
```

## Push an existing folder

```bash
cd existing_folder
git init
git remote add origin https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
git add .
git commit -m "Initial commit"
git push -u origin master
```

## Push an existing Git repository

```bash
cd existing_repo
git remote rename origin old-origin
git remote add origin https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
git push -u origin --all
git push -u origin --tags
```
