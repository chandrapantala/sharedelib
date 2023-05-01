def newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newmaven()
{
  sh 'mvn package'
}
def newdeploy()
{
   deploy "adapters: [tomcat9(credentialsId: '940cfe09-3905-4644-be26-658311726026', path: '', url: 'http://172.31.7.4:8080')], contextPath: 'testapp', war: '**/*.war'"
}
