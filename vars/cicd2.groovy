def Newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def Maven()
{
  sh 'mvn package'
}

