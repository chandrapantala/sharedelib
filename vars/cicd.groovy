def newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newmaven()
{
 sh 'mvn package'
}
