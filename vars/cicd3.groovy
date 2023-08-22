def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy()
{
  deploy adapters: [tomcat9(credentialsId: '66b4205e-de87-47af-bf21-0bbff285218f', path: '', url: 'http://172.31.40.3:8080')], contextPath: 'tet', war: '**/*.war'
}
def newtest(workspace)
{
  sh "java -jar /var/lib/jenkins/workspace/${workspace}/testing.jar"
}
def newDepv()
{
  deploy adapters: [tomcat9(credentialsId: '66b4205e-de87-47af-bf21-0bbff285218f', path: '', url: 'http://172.31.33.19:8080')], contextPath: 'proda', war: '**/*.war'
}
