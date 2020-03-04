## My Git Playground

This project is only for testing, branching, merging, and things like that.


At some point (after some editing and a few commits) we create a new branch:

```bash
obama@teben:~/tmp/gitplayground$ git branch 1.1-SNAPSHOT
obama@teben:~/tmp/gitplayground$ git checkout 1.1-SNAPSHOT
Switched to branch '1.1-SNAPSHOT'
obama@teben:~/tmp/gitplayground$ git status
On branch 1.1-SNAPSHOT
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   my-app/pom.xml

no changes added to commit (use "git add" and/or "git commit -a")
obama@teben:~/tmp/gitplayground$ git commit my-app/pom.xml -m"start new branch '1.1-SNAPSHOT'"
[1.1-SNAPSHOT 3f93180] start new branch '1.1-SNAPSHOT'
 1 file changed, 1 insertion(+), 1 deletion(-)
obama@teben:~/tmp/gitplayground$ 
obama@teben:~/tmp/gitplayground$ git status
On branch 1.1-SNAPSHOT
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
obama@teben:~/tmp/gitplayground$ 
```

If You want to `push` your commits Git tells you that You can't do that:

```bash
obama@teben:~/tmp/gitplayground$ git push
fatal: The current branch 1.1-SNAPSHOT has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin 1.1-SNAPSHOT

obama@teben:~/tmp/gitplayground$ 
```

You have to set the remote `upstream`:

```bash
obama@teben:~/tmp/gitplayground$ git push --set-upstream origin 1.1-SNAPSHOT
Enumerating objects: 28, done.
Counting objects: 100% (28/28), done.
Delta compression using up to 8 threads
Compressing objects: 100% (12/12), done.
Writing objects: 100% (18/18), 13.63 KiB | 4.54 MiB/s, done.
Total 18 (delta 4), reused 0 (delta 0)
remote: 
remote: To create a merge request for 1.1-SNAPSHOT, visit:
remote:   https://teben.hopto.org:9080/teben.hopto.org/git-playground/merge_requests/new?merge_request%5Bsource_branch%5D=1.1-SNAPSHOT
remote: 
To https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
   3f93180..1d9a03c  1.1-SNAPSHOT -> 1.1-SNAPSHOT
Branch '1.1-SNAPSHOT' set up to track remote branch '1.1-SNAPSHOT' from 'origin'.
obama@teben:~/tmp/gitplayground$ 
```

Once this is done You can push the regular way:
```bash
obama@teben:~/tmp/gitplayground$ git commit README.md -m"update README.md"
[1.1-SNAPSHOT b7e7cd0] update README.md
 1 file changed, 9 insertions(+)
obama@teben:~/tmp/gitplayground$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 454 bytes | 454.00 KiB/s, done.
Total 3 (delta 2), reused 0 (delta 0)
remote: 
remote: To create a merge request for 1.1-SNAPSHOT, visit:
remote:   https://teben.hopto.org:9080/teben.hopto.org/git-playground/merge_requests/new?merge_request%5Bsource_branch%5D=1.1-SNAPSHOT
remote: 
To https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
   2e48768..b7e7cd0  1.1-SNAPSHOT -> 1.1-SNAPSHOT
obama@teben:~/tmp/gitplayground$ 
```